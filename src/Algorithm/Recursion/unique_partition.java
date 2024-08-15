package Algorithm.Recursion;
import java.util.*;

public class unique_partition {
    public static void getSub(int nums[],ArrayList<Integer> ds, ArrayList< ArrayList<Integer>> ans,int target,int idx){
        if(idx==nums.length){
            if(target==0){
                if(ans.contains(ds)==false){
                    Collections.sort(ds,Collections.reverseOrder());
                    ans.add(new ArrayList<>(ds));
                }

            }
            return;
        }
        if(target==0){
            if(ans.contains(ds)==false){
                Collections.sort(ds,Collections.reverseOrder());
                ans.add(new ArrayList<>(ds));
            }
            return;
        }


        if(target>=nums[idx]){
            ds.add(nums[idx]);
            getSub(nums,ds,ans,target-nums[idx],idx);
            ds.remove(ds.size()-1);
        }

        getSub(nums,ds,ans,target,idx+1);
    }
    public static ArrayList<ArrayList<Integer>> UniquePartitions(int n)
    {
        int nums[]=new int[n];

        for(int i=0;i<n;i++){
            nums[i]=n-i;
        }
        ArrayList<Integer> ds=new ArrayList<>();
        ArrayList< ArrayList<Integer>> ans=new ArrayList<>();
        getSub(nums,ds,ans,n,0);
    //    Collections.reverse(ans);
        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args) {
        int n=6;
        System.out.println(UniquePartitions(n));
    }
}
