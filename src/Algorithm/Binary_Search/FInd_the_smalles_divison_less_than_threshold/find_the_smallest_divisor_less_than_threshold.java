package Algorithm.Binary_Search.FInd_the_smalles_divison_less_than_threshold;

public class find_the_smallest_divisor_less_than_threshold {
    public static int getMax(int nums[]){
        int maxi=-1;
        for (int ele:
             nums) {
            maxi=Math.max(maxi,ele);
        }
        return maxi;
    }
    public static int getMinDivisor(int nums[],int threshold,int mid){
        int sum=0;
        for (int i = 0; i <nums.length ; i++) {
            double v = nums[i] / (double) mid;
            sum =(int) (sum+ (int)Math.ceil((double)nums[i]/(double) mid));
        }
if(sum<=threshold) return 1;
return 0;
    }
    static  public int smallestDivisor(int[] nums, int threshold) {
int low=1;
int high=getMax(nums);
int ans=0;
        while (low<=high){
        int mid=(low+high)/2;

        if(getMinDivisor(nums,threshold,mid)==1){
high=mid-1;
ans=mid;
        }
        else {
        low=mid+1;
        }


        }


        return ans;
    }
    public static void main(String[] args) {
        int nums []= {44,22,33,11,1};int threshold = 5;
    int ans=smallestDivisor(nums,threshold);
        System.out.println(ans);

    }
}
