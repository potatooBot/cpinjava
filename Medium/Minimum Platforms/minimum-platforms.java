//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            
            int arr[] = new int[n];
            int dep[] = new int[n];
            
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
              arr[i] = Integer.parseInt(str[i]);
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                dep[i] = Integer.parseInt(str[i]);
                
            System.out.println(new Solution().findPlatform(arr, dep, n));
        }
    }
    
    
}



// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
       
        int count=0;
        boolean vis[]=new boolean[n];
        int time[][] =new int[n][2];
        for (int i = 0; i <n ; i++) {
            time[i][0]=arr[i];
            time[i][1]=dep[i];
        }
        Arrays.sort(time,(a,b)->Integer.compare(a[0],b[0]));

        for (int i = 0; i <n ; i++) {
         if(vis[i]==true) continue;
            vis[i]=true;
int end=time[i][1];
count++;
            for (int j = i; j <n ; j++) {
                if(vis[j]==false&&time[j][0]>end){
                    vis[j]=true;
                    end=time[j][1];
                }
            }
        }
    return count;
        
    }
    
}

