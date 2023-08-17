package Algorithm.Binary_Search.Aggressive_Cows;

import java.lang.reflect.Array;
import java.util.Arrays;

public class aggressive_cows {
    public static boolean canWePlace(int stalls[],int mid,int nOfCows){
        int countOfCows=1;
        int last=stalls[0];

        for (int i = 1; i <stalls.length-1 ; i++) {
if(stalls[i]-last>=mid){
    countOfCows++;
}
if(countOfCows>=nOfCows){
    return true;
}
        }

return false;

    }
    public static int solve(int n, int noOfcows, int[] stalls) {
        Arrays.sort(stalls);
        int low=1;int high=stalls[n-1];
        int ans=0;

        while (low<=high){
            int mid=(low +high)/2;
            if(canWePlace(stalls,mid,noOfcows)==true){
                ans=mid;
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
int n=5;
        int k=3;
    int []    stalls = {10 ,1 ,2 ,7 ,5};
    int ans=solve(n,k,stalls);
        System.out.println(ans);
    }
}
