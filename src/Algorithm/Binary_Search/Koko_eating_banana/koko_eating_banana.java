package Algorithm.Binary_Search.Koko_eating_banana;

public class koko_eating_banana {
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
    static public int minEatingSpeed(int[] piles, int h) {
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
    public static void main(String[] args) {
        int piles[] = {3,6,7,11}, h = 8;
int ans=minEatingSpeed(piles,h);
        System.out.println(ans);

    }
}
