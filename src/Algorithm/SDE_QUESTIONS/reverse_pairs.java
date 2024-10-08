package Algorithm.SDE_QUESTIONS;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class reverse_pairs {

    public static void merge(int nums[],int low,int mid,int high){

        ArrayList<Integer> temp=new ArrayList<>();
        int left=low;
        int right=mid+1;

        while (left<=mid&&right<=high){
            if(nums[left]<=nums[right]){
                temp.add(nums[left]);
                left++;
            }
            else {
                temp.add(nums[right]);
                right++;
            }
        }


        while (left<=mid){
            temp.add(nums[left] );
            left++;
        }
        while (right<=high){
            temp.add(nums[right] );
            right++;
        }
        for (int i = low; i <=high ; i++) {
            nums[i]=temp.get(i-low);
        }
    }
    public static int countReversePairs(int nums[],int low,int mid,int high){
        int count=0;
int right=mid+1;
        for (int i = low; i <=mid ; i++) {
            long check=0;

            while (right<=high&&nums[i]>(long)2*(long)nums[right]){
                right++;
            }
            count=count+(right-(mid+1));
        }
return count;
    }
    public static int mergeSort(int nums[],int low,int high){
        int count=0;
        if(low>=high) return 0;
        int mid=(low+high)/2;
        count+=mergeSort(nums,low,mid);
        count+=mergeSort(nums,mid+1,high);
        count+=countReversePairs(nums,low,mid,high);
        merge(nums,low,mid,high);
        return count;
    }
    static   public int reversePairs(int[] nums) {
        int count=mergeSort(nums,0,nums.length-1);
        return count;
    }
    public static void main(String[] args) {
        int [] nums = {2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
    int ans=reversePairs(nums);
        System.out.println(ans);
    }
}
