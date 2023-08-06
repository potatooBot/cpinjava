//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int h = sc.nextInt();
            Solution obj = new Solution();
            int ans = obj.Solve(n,a,h);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution {
       public static int getMax(int piles[]){
        int maxi=Integer.MIN_VALUE;

        for (int i = 0; i <piles.length ; i++) {
            maxi=Math.max(maxi,piles[i]);
        }
        return maxi;
    }
    public static int getMinTime(int piles[],int mid){
        int totaLtime=0;
        for (int i = 0; i < piles.length ; i++) {
            totaLtime= (int) (totaLtime +Math.ceil((double) piles[i]/(double) mid));

        }

     return totaLtime;
    }
    public static int Solve(int N, int[] piles, int h) {
      int low=1;
int maxi=getMax(piles);
int high=maxi;

while (low<=high) {
    int mid = (low + high) / 2;
  //  System.out.println(mid);
    int val = getMinTime(piles, mid);
    if (val <= h) {
        high = mid - 1;
    } else {
        low = mid + 1;
    }
}
        return low;
    }
}
        
