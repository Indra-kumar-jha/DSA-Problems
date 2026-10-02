class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int count1 = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }else if(nums[i]!=1){
                if(count>count1){
                    count1 = count;
                    count = 0;
                }
                count = 0;
            }
        }
        if(count1<count){
            count1 = count;
        }
        return count1;
    }
}