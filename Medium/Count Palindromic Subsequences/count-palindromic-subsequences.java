//{ Driver Code Starts
import java.util.*;
class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			//System.out.println(str.length());
			Solution ob  = new Solution();
			System.out.println(ob.countPS(str));
		t--;
		}
	}
}
// } Driver Code Ends


/*You are required to complete below method */

class Solution
{
    long countPS(String s)
    {
         int n=s.length();
       long dp[][]=new long[n][n];
       int mod=(int)Math.pow(10,9)+7;
        for(int g=0;g<n;g++){
            for(int i=0,j=g;j<n;i++,j++){
                if(g==0){
                    dp[i][j]=1;
                }
                else if(g==1){
                    dp[i][j]=s.charAt(i)==s.charAt(j)?3:2;
                }
                else{
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j]=(dp[i][j-1]+dp[i+1][j]+1)%mod;
                    }
                    else {
dp[i][j]=(dp[i][j-1]+dp[i+1][j]-dp[i+1][j-1]
)%mod;
                    }
                }
            }
        }
 return (dp[0][n-1]+mod)%mod;
    }
}