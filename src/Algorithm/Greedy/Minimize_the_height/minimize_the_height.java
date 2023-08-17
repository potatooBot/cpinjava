package Algorithm.Greedy.Minimize_the_height;
import java.util.*;
public class minimize_the_height {
    static int getMinDiff(int[] nums, int n, int k) {
        // code here
        if(nums.length==1) return 0;

        Arrays.sort(nums);


        if(k>=nums[n-1]-nums[0]){
            return nums[n-1]-nums[0];
        }
        int minScore=nums[n-1]-nums[0];
        for(int p=1;p<n;p++){
            int min=Math.min(nums[0]+k,nums[p]-k);
            int max=Math.max(nums[p-1]+k,nums[n-1]-k);
            minScore=Math.min(minScore,max-min);
        }

        return minScore;
    }


    public static void main(String[] args) {
        int K = 3, N = 5;
        int arr[] = {3, 9, 12, 16, 20};
        int ans=getMinDiff(arr,N,K);
        System.out.println(ans);
    }
}
