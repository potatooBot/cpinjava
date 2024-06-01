class Solution {
    public int scoreOfString(String s) {
        int val=0;

        for(int i=0;i<s.length()-1;i++){
            val=val+Math.abs((int)s.charAt(i)-(int)s.charAt(i+1));
        }
        return val;
    }
}