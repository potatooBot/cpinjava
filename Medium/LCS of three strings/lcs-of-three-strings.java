//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            int n1 = Integer.parseInt(input_line[0]);
            int n2 = Integer.parseInt(input_line[1]);
            int n3 = Integer.parseInt(input_line[2]);
            input_line = read.readLine().trim().split("\\s+");
            String A = input_line[0];
            String B = input_line[1];
            String C = input_line[2];
            Solution obj = new Solution();
            System.out.println(obj.LCSof3(A, B, C, n1, n2, n3));
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    public static int lcs(String str1,String str2,String str3 ){
         int n=str1.length();
        int m=str2.length();
        int k=str3.length();
        int dp[][][]=new int[n+1][m+1][k+1];
        
        
        for(int ind1=1;ind1<=n;ind1++){
            for(int ind2=1;ind2<=m;ind2++){
                for(int ind3=1;ind3<=k;ind3++){
                if(str1.charAt(ind1-1)==str2.charAt(ind2-1)&&str1.charAt(ind1-1)==str3.charAt(ind3-1)&&str2.charAt(ind2-1)==str3.charAt(ind3-1)){
                    dp[ind1][ind2][ind3]= 1+ dp[ind1-1][ind2-1][ind3-1];
                }
                else{
                    dp[ind1][ind2][ind3]=0 + Math.max(dp[ind1-1][ind2][ind3],Math.max(dp[ind1][ind2-1][ind3],dp[ind1][ind2][ind3-1]));
                }
            }
            }
        }
        
        
        
    return dp[n][m][k];
        
    }
    
    
    int LCSof3(String A, String B, String C, int n1, int n2, int n3) 
    { 
        /*int valAB=lcs(A,B);
        int valAC=lcs(A,C);
        int res1=Math.min(valAB,valAC);
     System.out.println(valAC);
        
        
        int valBA=lcs(B,A);
        int valBC=lcs(B,C);
        int res2=Math.min(valBA,valBC*/
      

        int ans=lcs(A,B,C);
        
        return ans;
        
        
    }
} 