//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String s = sc.next ();
            int q1 = sc.nextInt();
            int q2 = sc.nextInt();
            if (q1 > q2){
                int temp = q1;
                q1 = q2;
                q2 = temp;
            }
    		System.out.println (new Sol().countPalinInRange (n, s, q1, q2));
        }
        
    }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int countPalinInRange (int N, String s, int q1, int q2)
    {
         int n=s.length();
        int cnt=0;
        boolean dp[][]=new boolean[s.length()][s.length()];
    for(int g=0;g<n;g++){
for(int i=0,j=g;j<n;i++,j++){
    if(g==0){
        dp[i][j]=true;
    }
    else if(g==1){
        if(s.charAt(i)==s.charAt(j))
        {
            dp[i][j]=true;
        }
    }
    else {
        if(s.charAt(i)==s.charAt(j)&&dp[i+1][j-1]==true){
            dp[i][j]=true;
        }
    }
    if(dp[i][j]==true&&(i>=q1&&j<=q2))
    {
        cnt++;
    }
}

    }
return cnt;     
    }
}