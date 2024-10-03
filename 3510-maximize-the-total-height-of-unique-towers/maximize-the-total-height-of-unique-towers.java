class Solution {
    public long maximumTotalSum(int[] maximumHeight) {
        Arrays.sort(maximumHeight);
        
        long maxSum = 0;
        int maxVal = Integer.MAX_VALUE;
        
       
        for (int i = maximumHeight.length - 1; i >= 0; i--) {
            if (maximumHeight[i] <= maxVal) {
                maxSum += maximumHeight[i];
                maxVal = maximumHeight[i] - 1;
            } else if (maxVal == 0) {
                return -1;
            } else {
                maxSum += maxVal;
                maxVal--;
            }
        }

        return maxSum;
    }
}