class Solution {
   public static int memo(int dp[],String s, int idx){
    if(idx==s.length()) return 0;


    if(dp[idx]!=-1) return  dp[idx];
int ans=(int)(1e9);
for(int end=idx;end<s.length();end++){
    char ch=s.charAt(idx);
if(ch=='0'&&end==idx){
    return (int)1e9;
}
String bin=s.substring(idx,end+1);
int val=Integer.parseInt(bin,2);

boolean flag=isPowerOf5(bin);


if(flag==true){
    ans=Math.min(ans,1+memo(dp,s,end+1));
}




}
return dp[idx]=ans;

   }
   public static  boolean isPowerOf5(String binaryStr) {
      
        int decimalNumber = Integer.parseInt(binaryStr, 2);
        while (decimalNumber > 1) {
            if (decimalNumber % 5 != 0) {
                return false;
            }
            decimalNumber /= 5;
        }

        return decimalNumber == 1;
    }
   
    public int minimumBeautifulSubstrings(String s) {
        int n=s.length();
    int dp[]=new int[n+1];
    Arrays.fill(dp,-1);


int ans=memo(dp,s,0);
if(ans==(int)(1e9)) return -1;

return ans;

        }
}