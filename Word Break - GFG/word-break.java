//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
public class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n;
                    n = sc.nextInt();
                    ArrayList<String> arr = new ArrayList<String>();
                    for(int i = 0;i<n;i++)
                        {
                            String p = sc.next();
                            arr.add(p);
                        }
                    String line = sc.next();
                    Sol obj = new Sol();  
                    System.out.println(obj.wordBreak(line,arr));  
                    
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static int wordBreak(String s, ArrayList<String> wordDict )
    {
      HashSet<String> set=new HashSet<>(wordDict);
        int dp[]=new int[s.length()+1];
        dp[0]=1;
        for (int end = 1; end <=s.length() ; end++) {
            for (int start = 0; start <end ; start++) {
                if(dp[start]==1&& set.contains(s.substring(start,end))){
                    dp[end]=1;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}