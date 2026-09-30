class Solution {
    public void duplicateZeros(int[] arr) {
        int j = 0;
        int ans[] = new int[arr.length];
        for(int i=0;i<arr.length && j<arr.length;i++){
            if(arr[i] == 0){
                ans[j] = 0;
                j++;
                if(j<arr.length){
                    ans[j] = 0;
                    j++;
                }
            }else{
                ans[j] = arr[i];
                j++;
            }
            }
            for(int i=0;i<arr.length;i++){
                arr[i] = ans[i];
        }
    }
}