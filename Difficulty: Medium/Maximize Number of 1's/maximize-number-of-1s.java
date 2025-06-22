// User function Template for Java

class Solution {
    // k is the maximum number of zeros allowed to flip
    public int maxOnes(int arr[], int k) {
        // code here
        int ans=0;
        int zero=0;
        int low=0;
        for(int end=0;end<arr.length;end++){
        
            if(arr[end]==0){
            zero++;
            }
            while(zero>k){
                if(arr[low]==0){
                    zero--;
                }
                    low++;
            }
                ans=Math.max(ans,end-low+1);
        }
        
        return ans;
    }
}