class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
         int n=s1.length();
        int m=s2.length();
      int dp[][]=new int[n+1][m+1];
      
      
      for(int rows[]:dp){
          Arrays.fill(rows,0);
      }
    
        for(int ind1=1;ind1<=n;ind1++){
            for(int ind2=1;ind2<=m;ind2++){
                if(s1.charAt(ind1-1)==s2.charAt(ind2-1)){
                    dp[ind1][ind2]=1+dp[ind1-1][ind2-1];
                }
                else{
                     dp[ind1][ind2]=0+Math.max(dp[ind1-1][ind2],dp[ind1][ind2-1]);
                }
            }
        }
        String ans="";
        int i=n;
        int j=m;
        int len=dp[n][m];
        for(int k=1;k<=len;k++){
            ans=ans+'&';
        }
int idx=len-1;
          StringBuilder ss=new StringBuilder(s1);
          StringBuilder sb=new StringBuilder(ans);
        while(i>0&&j>0){
            if(ss.charAt(i-1)==s2.charAt(j-1)){
                sb.setCharAt(idx,ss.charAt(i-1));
              idx--;
                i--;
                j--;

            }
            else if(ss.charAt(i-1)>s2.charAt(j-1)){
                i--;
            }
            else {
                j--;
            }
        }
      
        System.out.println(sb.toString());
        return dp[n][m];
    }
}