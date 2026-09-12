import java.util.*;

class Solution {
    // 1. Move State class out to class scope
    private static class State {
        long weight;
        List<Integer> indices;
        
        State(long weight, List<Integer> indices) {
            this.weight = weight;
            this.indices = indices;
        }
    }

    public int[] maximumWeight(List<List<Integer>> intervals) {
        int n = intervals.size();
        
        // Store [l, r, weight, original_index]
        int[][] sorted = new int[n][4];
        for (int i = 0; i < n; i++) {
            List<Integer> interval = intervals.get(i);
            sorted[i] = new int[]{interval.get(0), interval.get(1), interval.get(2), i};
        }
        
        // Sort by right endpoint
        Arrays.sort(sorted, (a, b) -> Integer.compare(a[1], b[1]));
        
        // dp[k][i] = best state taking k intervals up to index i
        State[][] dp = new State[5][n + 1];
        for (int k = 0; k <= 4; k++) {
            for (int i = 0; i <= n; i++) {
                dp[k][i] = new State(0, new ArrayList<>());
            }
        }
        
        for (int i = 1; i <= n; i++) {
            int l = sorted[i - 1][0];
            int r = sorted[i - 1][1];
            long w = sorted[i - 1][2];
            int origIdx = sorted[i - 1][3];
            
            // Find last non-overlapping interval using binary search
            int prevIdx = 0;
            int low = 0, high = i - 2;
            while (low <= high) {
                int mid = (low + high) >>> 1;
                if (sorted[mid][1] < l) {
                    prevIdx = mid + 1;
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            
            for (int k = 1; k <= 4; k++) {
                // Choice 1: Skip current interval
                State best = dp[k][i - 1];
                
                // Choice 2: Include current interval
                State prev = dp[k - 1][prevIdx];
                long newWeight = prev.weight + w;
                List<Integer> newIndices = new ArrayList<>(prev.indices);
                newIndices.add(origIdx);
                Collections.sort(newIndices);
                
                State takeState = new State(newWeight, newIndices);
                
                // Compare choices: max weight first, then lexicographically smaller indices
                if (isBetter(takeState, best)) {
                    best = takeState;
                }
                
                dp[k][i] = best;
            }
        }
        
        // Find best overall state across count 1..4
        State bestResult = dp[0][n];
        for (int k = 1; k <= 4; k++) {
            if (isBetter(dp[k][n], bestResult)) {
                bestResult = dp[k][n];
            }
        }
        
        int[] result = new int[bestResult.indices.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = bestResult.indices.get(i);
        }
        return result;
    }
    
    private boolean isBetter(State a, State b) {
        if (a.weight != b.weight) {
            return a.weight > b.weight;
        }
        // Lexicographical tie-breaking
        int minLen = Math.min(a.indices.size(), b.indices.size());
        for (int i = 0; i < minLen; i++) {
            if (!a.indices.get(i).equals(b.indices.get(i))) {
                return a.indices.get(i) < b.indices.get(i);
            }
        }
        return a.indices.size() < b.indices.size();
    }
}