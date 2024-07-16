//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.CountWays(str);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int CountWays(String s)
    {
          int mod=(int)Math.pow(10,9)+7;
       int dp[]=new int[s.length()];
        if(s.charAt(0)=='0') dp[0]=0;
        else{
        dp[0]=1;
        }
int n=s.length();
        for(int i=1;i<n;i++){
            if(s.charAt(i-1)=='0'&&s.charAt(i)=='0'){
dp[i]=0;
            } 
            else  if(s.charAt(i-1)=='0'&&s.charAt(i)!='0'){
dp[i]=dp[i-1]%mod;
            }
             else if(s.charAt(i-1)!='0'&&s.charAt(i)=='0'){
if(s.charAt(i-1)=='1'||s.charAt(i-1)=='2'){
    if(i>=2){
        dp[i]=dp[i-2]%mod;
    }
    else{
        dp[i]=1;
    }

}
else{
    dp[i]=0;
}
            }
             else {
                if(Integer.parseInt(s.substring(i-1,i+1))<=26){
                    if(i>=2){
                        dp[i]=(dp[i-1]+dp[i-2])%mod;
                    }
                    else{
                dp[i]=(dp[i-1]+1)%mod;
                    }
                }
                else{
                    dp[i]=dp[i-1]%mod;
                }

            }
            
                    }
                  

                    return dp[s.length()-1]%mod;
    }
}