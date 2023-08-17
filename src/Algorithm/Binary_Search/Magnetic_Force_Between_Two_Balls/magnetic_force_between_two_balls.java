package Algorithm.Binary_Search.Magnetic_Force_Between_Two_Balls;

import java.util.Arrays;

public class magnetic_force_between_two_balls {
    public static boolean canWePlace(int position[],int mid,int nOfCows){
        int countOfballs=1;
        int last=position[0];

        for (int i = 1; i <position.length ; i++) {
            if(position[i]-last>=mid){
                countOfballs++;
                last=position[i];
            }
            if(countOfballs>=nOfCows){
                return true;
            }
        }

        return false;

    }
    public static int maxDistance(int[] position, int noOfBalls) {
        Arrays.sort(position);
        int n=position.length;
        int low=1;int high=position[n-1]-position[0];
        int ans=0;

        while (low<=high){
            int mid=(low +high)/2;
            if(canWePlace(position,mid,noOfBalls)==true){
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
        int [] position = {1,2,3,4,7};int m = 3;
        int ans=maxDistance(position,m);
        System.out.println(ans);
    }
}
