package Algorithm.Dynamic_Programming.KnapsackType;
import java.util.*;
import java.util.stream.Collectors;

public class find_all_distinct_subset {
    public static boolean getSubsetUtil(int arr[],int dp[][],int n,int target,int idx){

        if(target==0) return true;
        if(idx==0){
            return target==arr[0];
        }
if(dp[idx][target]!=-1){
    return dp[idx][target]==0?false:true;
}

      boolean notake= getSubsetUtil(arr,dp,n,target,idx-1);
        boolean take=false;
        if(arr[idx]<=target){
            take=getSubsetUtil(arr,dp,n,target-arr[idx],idx-1);
        }
        dp[idx][target]=take||notake?1:0;
        return take||notake;
    }

    static  public int[] DistinctSum(int[] nums)
    {

       int sum=0;
        for (int i = 0; i <nums.length ; i++) {
            sum+=nums[i];
        }
        int idx=0;
int n= nums.length;
        int dp[][]=new int[n][sum+1];
        for (int rows[]:
           dp  ) {
            Arrays.fill(rows,-1);
        }
ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i <=sum ; i++) {

if(getSubsetUtil(nums,dp,n,i,n-1)){
    list.add(i);
}

        }
        int ans[]=new int[list.size()];
        for (int ele:
                list) {
            ans[idx++]= ele;
        }
       return ans;
    }

    public static void main(String[] args) {
int nums[] = {1,2,3};
    int ans[]=DistinctSum(nums);
        System.out.println(Arrays.stream(ans).boxed().collect(Collectors.toList()));
    }
}
