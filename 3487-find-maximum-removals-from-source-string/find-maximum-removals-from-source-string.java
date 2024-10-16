    class Solution{

    public int maxRemovals(String A, String B, int[] targetIndices) {
        int n = A.length(), m = B.length();
        int[] target = new int[n], dp = new int[m + 1];
        for (int i : targetIndices)
            target[i] += 1;
        Arrays.fill(dp, Integer.MIN_VALUE);
        dp[m] = 0;
        for (int i = n - 1; i >= 0; --i) {
            for (int j = 0; j <= m; ++j) {
                dp[j] += target[i];
                if (j < m && A.charAt(i) == B.charAt(j)) {
                    dp[j] = Math.max(dp[j], dp[j + 1]);
                }
            }
        }
        return dp[0];
    }
    }