package Algorithm.SDE_QUESTIONS;

public class maximum_product_subarray {
    static  long maxProduct(int[] nums, int n) {
        long maxi = Long.MIN_VALUE;
        long pref=1;
        long suff=1;
        for(int i=0;i<nums.length;i++){
            if(pref==0) pref=1;
            if(suff==0) suff=1;
            pref=pref*nums[i];
            suff=suff*nums[nums.length-i-1];
            maxi=Math.max(maxi,Math.max(pref,suff));
        }


        return maxi;
    }
    public static void main(String[] args) {
        int N = 5;
        int arr[] = {6, -3, -10, 0, 2};
long ans=maxProduct(arr,N);
        System.out.println(ans);
    }
}
