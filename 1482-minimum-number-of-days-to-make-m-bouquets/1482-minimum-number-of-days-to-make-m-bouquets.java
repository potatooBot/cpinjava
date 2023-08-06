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
            System.out.println(nofOfBloomday);
            return true;
        }
        return false;
    }
    static  public int minDays(int[] bloomDay, int m, int k) {
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