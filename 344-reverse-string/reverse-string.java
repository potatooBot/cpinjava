class Solution {
    public void reverseString(char[] s) {
        String res="";
        for(int i=0;i<s.length;i++){
          res=s[i]+res;
        }
       for(int i=0;i<s.length;i++){
         s[i]=res.charAt(i);
        }
        
    }
}