package Algorithm.SlidingWIndow;

public class subarray_prodct_less_than_k {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int start=0;
        int prod=1;
        int cnt=0;
        int end=0;
        while(end<nums.length){
            prod=prod*nums[end];
            while(prod>=k){
                prod=prod/nums[start];
                start++;
            }
            //    if(prod==0) prod=1;

            cnt=cnt+1+(end-start);

            end++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int nums[] = {640,534,20,370,242,862,846,778,528,204,502,397,741,795,674,965,452,845,244,800}, k = 1;
        System.out.println(numSubarrayProductLessThanK(nums,k));
    }
}
