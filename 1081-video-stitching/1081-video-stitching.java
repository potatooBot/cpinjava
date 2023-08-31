class Solution {
    public int videoStitching(int[][] intervals, int n) {
                int start = 0, end = 0, res = 0, index;
        int size = intervals.length;
        
   
        Arrays.sort(intervals, (interval1, interval2) -> Integer.compare(interval1[0], interval2[0]));
        
        index = 0;
        while (start < n) {
            while (index < size && intervals[index][0] <= start) {
                end = Math.max(end, intervals[index][1]);
                index++;
            }
            if (start == end) {
                return -1;
            }
            start = end;
            res++;
        }
        return res;
    }
}