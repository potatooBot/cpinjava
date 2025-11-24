class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        int cur = 0;
        ArrayList<Boolean> res = new ArrayList<>();
        for (int num : nums) {
            cur = cur * 2 + num;
            cur %= 5;
            res.add((cur == 0) ? true : false);
        }
        return res;
    }
}