class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=1;i<n;i++){
            int prev=nums[i-1];
            int curr=nums[i];
            if(prev==curr){
                return true;
            }
        }
        return false;
    }
}