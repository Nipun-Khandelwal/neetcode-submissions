class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int i=0;
        for(int ele:set){
            nums[i]=ele;
            i++;
        }
        return set.size();
    }
}