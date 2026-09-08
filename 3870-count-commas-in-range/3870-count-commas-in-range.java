class Solution {
    int count = 0 ;
    public int countCommas(int n) {
        for (int i = 1; i <= n; i++) {
      if (i >= 1000) {
        count++;
      }
    }
    return count;
    }}
