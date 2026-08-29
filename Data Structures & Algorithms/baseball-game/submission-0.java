class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int n = operations.length;
        for (int i = 0; i < n; i++) {
            if (!operations[i].equals("+") && !operations[i].equals("C")
                && !operations[i].equals("D")) {
                st.push(Integer.parseInt(operations[i]));
            } else if (operations[i].equals("+")) {
                int first = st.pop();
                int second = st.peek();

                int sum = first + second;

                st.push(first);
                st.push(sum);
            } else if (operations[i].equals("C")) {
                st.pop();
            } else if (operations[i].equals("D")) {
                int d = (2 * st.peek());
                st.push(d);
            }
        }
        int ans = 0;
        for (int ele : st) {
            ans = ans + ele;
        }
        return ans;
    }
}
