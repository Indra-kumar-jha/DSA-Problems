class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int j = 0;
        for(int x : nums){
            map.put(x , j++);
        }
        for(int i = 0;i < nums.length;i++){
            int comp = target - nums[i];
            if(map.containsKey(comp) && map.get(comp) != i){
                return new int[]{map.get(comp) , i};
            }
        }
        return new int[]{};
    }
}