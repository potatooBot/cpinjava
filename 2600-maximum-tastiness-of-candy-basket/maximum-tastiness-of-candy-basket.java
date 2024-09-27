class Solution {
      public static boolean canWePlace(int stalls[],int mid,int nOfCows){
        int countOfCows=1;
        int last=stalls[0];

        for (int i = 1; i <stalls.length ; i++) {
if(stalls[i]-last>=mid){
    countOfCows++;
    last=stalls[i];
}
if(countOfCows>=nOfCows){
    return true;
}
        }

return false;

    }
    public int maximumTastiness(int[] stalls, int noOfcows) {
         Arrays.sort(stalls);
         int n=stalls.length;
        int low=1;int high=stalls[n-1]-stalls[0];
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
}