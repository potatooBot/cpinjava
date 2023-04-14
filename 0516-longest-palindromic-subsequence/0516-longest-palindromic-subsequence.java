class Solution {
public static int lcs(String str1,String str2,int dp[][],int idx1,int idx2){
if(idx1<0||idx2<0) return 0;

if(dp[idx1][idx2]!=-1) return dp[idx1][idx2];

if(str1.charAt(idx1)==str2.charAt(idx2))
 return dp[idx1][idx2]=1+lcs(str1,str2,dp,idx1-1,idx2-1);
 else{
     return dp[idx1][idx2]=0 +Math.max(lcs(str1,str2,dp,idx1-1,idx2),lcs(str1,str2,dp,idx1,idx2-1));
 }
}
    public int longestPalindromeSubseq(String s) {
String t="";
for(int i=0;i<s.length();i++){
    t=s.charAt(i)+t;
}
     int dp[][]=new int [s.length()][t.length()];
        for(int[] row:dp)
        Arrays.fill(row,-1);
return lcs(s,t,dp,s.length()-1,t.length()-1);
    }
}