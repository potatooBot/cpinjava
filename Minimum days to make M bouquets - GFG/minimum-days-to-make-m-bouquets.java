//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
       
        int t = sc.nextInt();
        while(t-- > 0){
            
            
           int M = sc.nextInt();
           int K = sc.nextInt();
            
            
            //int n = sc.nextInt();
            sc.nextLine();
            String s[]=sc.nextLine().split(" ");
            int n=s.length;
            int[] bloomDay = new int[n];
            for(int i=0;i<n;i++) bloomDay[i]=Integer.parseInt(s[i]);
            
            Solution obj = new Solution();
            int res = obj.solve(M, K, bloomDay);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
        public static void getMinMax(int [] bloomDay,int minmax[]){
        minmax[0]=Integer.MAX_VALUE;
        for (int i = 0; i <bloomDay.length ; i++) {
            minmax[0]=Math.min(minmax[0],bloomDay[i]);
            minmax[1]=Math.max(minmax[1],bloomDay[i]);
        }
    }
    public static boolean possible(int bloomDay[],int mid,int m,int k){

int count=0;
int nofOfBloomday=0;
        for (int i = 0; i <bloomDay.length ; i++) {
            if(bloomDay[i]<=mid){
        count++;
//                System.out.println(count);
            }
            else {
                nofOfBloomday=nofOfBloomday+(count/k);
                count=0;
            }
        }
        nofOfBloomday=nofOfBloomday+ (count/k);

        if (nofOfBloomday >= m) {
       
            return true;
        }
        return false;
    }
    public static int solve(int m, int k, int[] bloomDay) {
       int minMax[]=new int[2];
        getMinMax(bloomDay,minMax);
        int low=minMax[0];
        int high=minMax[1];
int ans=-1;
        while (low<=high){
            int mid=(low+high)/2;
            if(possible(bloomDay,mid,m,k)==true){
           ans=mid;
           high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return ans;
    }
}