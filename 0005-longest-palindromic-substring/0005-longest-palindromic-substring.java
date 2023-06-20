class Solution {
      static    public String longestPalindrome(String s) {

        if(s.length()<1||s==null) return "";
        int start=0;
        int end=0;
        for (int i = 0; i <s.length() ; i++) {
            int len1=expandFromCenter(s,i,i);
            int len2=expandFromCenter(s,i,i+1);
            int len=Math.max(len1,len2);

            if(len>end-start){
                start=i-(len-1)/2;
                end=i+len/2;
            }
        }

        return s.substring(start,end+1);
    }
    public static int expandFromCenter(String str,int left,int right){
        int L=left;
        int R=right;
        while (L>=0&&R<str.length()&&str.charAt(L)==str.charAt(R)){
            L--;
            R++;

        }
        return R-L-1;
    }
}