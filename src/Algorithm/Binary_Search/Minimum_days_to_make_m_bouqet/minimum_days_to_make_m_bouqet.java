package Algorithm.Binary_Search.Minimum_days_to_make_m_bouqet;

public class minimum_days_to_make_m_bouqet {
    public static void getMinMax(int [] bloomDay,long minmax[]){
        minmax[0]=Integer.MAX_VALUE;
        for (int i = 0; i <bloomDay.length ; i++) {
            minmax[0]=Math.min(minmax[0],bloomDay[i]);
            minmax[1]=Math.max(minmax[1],bloomDay[i]);
        }
    }
    public static boolean possible(int bloomDay[],long mid,int m,int k){

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
long minMax[]=new long[2];
        getMinMax(bloomDay,minMax);
        long low=minMax[0];
        long high=minMax[1];
long ans=-1;
        while (low<=high){
            long mid=(low+high)/2;
            if(possible(bloomDay,mid,m,k)==true){
           ans=mid;
           high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return (int) ans;
    }
    public static void main(String[] args) {
        int bloomDay[] = {1000000000,1000000000};int m = 1, k = 1;
int ans=minDays(bloomDay,m,k);
        System.out.println(ans);
    }
}
