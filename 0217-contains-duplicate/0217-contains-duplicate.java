class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        for(int j=1;j<n;j++){
            if(nums[j]==nums[j-1]){
                return true;
            }
        }
        return false;
    }
}