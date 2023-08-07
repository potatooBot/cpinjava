class Solution {
        public static int getMax(int nums[]){
        int maxi=-1;
        for (int ele:
                nums) {
            maxi=Math.max(maxi,ele);
        }
        return maxi;
    }

    public static int getSum(int nums[]){
        int sum=0;
        for (int ele:
                nums) {
           sum+=ele;
        }
        return sum;
    }
    public static int getDays(int []weight,int mid,int days){
        int noOfdays=1;
        int load=0;

        for (int i = 0; i <weight.length ; i++) {
            if(load +weight[i]>mid){
//  ! Next day we entered for shipping
                noOfdays=noOfdays+1;
                load=weight[i];
            }
            else {
                load=load+weight[i];
            }
        }
        return noOfdays;
    }
    static public int shipWithinDays(int[] weights, int days) {


        int low = getMax(weights);
        int high = getSum(weights);

        while (low <= high) {
            int mid = (low + high) / 2;

      if(getDays(weights,mid,days)<=days){
          high=mid-1;
      }
      else {
          low=mid+1;
      }

        }
        return low;
    }
}