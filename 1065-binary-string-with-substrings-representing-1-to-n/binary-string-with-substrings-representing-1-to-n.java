class Solution {
    public boolean queryString(String s, int n) {
        for(int i=1;i<=n;i++){
            String bin=Integer.toBinaryString(i);
            if(s.contains(bin)==false) return false;
        }

        return true;
    }
}