class Solution {
    public int maxProduct(int n) {
        int digit = 1;
        int first = 0;
        int last = 0;

        while(n>0){
            int ans = n%10;
            if(ans>first){
              last = first;
              first = ans;
            }
            else if(ans>last){
              last = ans;
                }

            n = n/10;
        }

        return first*last;
    }
}
