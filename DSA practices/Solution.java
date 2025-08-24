import java.util.*;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
       
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    
                    return new int[] {i, j};
                }
            }
        }
       
        return new int[] {};
    }


    public static void main(String args[]){
     Scanner sc= new Scanner(System.in);
     int target = sc.nextInt();
     int n=sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        
     }
     twoSum(arr,target);
    }
}
