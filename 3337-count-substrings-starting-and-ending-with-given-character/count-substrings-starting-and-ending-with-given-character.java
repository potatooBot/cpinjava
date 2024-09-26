class Solution {
    public long countSubstrings(String s, char c) {
     long cnt=0;
        for(int i=0;i<s.length();i++){
           if(s.charAt(i)==c) cnt++;
        
    }
    long ans= cnt*(cnt-1)/2  + cnt;;
    return   ans;
    }
}