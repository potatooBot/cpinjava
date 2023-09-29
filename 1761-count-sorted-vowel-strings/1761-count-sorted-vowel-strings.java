class Solution {
    public static int getCount(char[] str,int dp[][],String s,int idx,int n){
        if(idx<0) return 0;
        if(s.length()==n) return 1;
if(idx==0&&str.length==n-1) return 1;
if(dp[idx][s.length()]!=-1) return dp[idx][s.length()];
        int notTake=0+getCount(str,dp,s,idx-1,n);

        int take=0;
        if(s.length()<n){
        take=getCount(str,dp,s+str[idx],idx,n);
        }

       return dp[idx][s.length()]=take+notTake;
    } 
    public int countVowelStrings(int n) {
        char str[]=new char[5];
        str[0]='a';
         str[1]='e';
          str[2]='i';
           str[3]='o';
            str[4]='u';
            int dp[][]=new int[5][n+1];
            for(int rows[]:dp)
            Arrays.fill(rows,-1);
int ans=getCount(str,dp,"",str.length-1,n);
/*for(int rows[]:dp)
System.out.println(Arrays.toString(rows));*/
return ans;
    }
}