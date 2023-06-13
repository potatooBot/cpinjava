class Solution {
    public int searchInsert(int[] arr, int k) {
        int n=arr.length;
             int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            
            if(arr[mid]>=k){
                ans=mid;
                high=mid-1;
            }
            else{
            low=mid+1;
            }
            
            
        }
        return ans;
    }
}