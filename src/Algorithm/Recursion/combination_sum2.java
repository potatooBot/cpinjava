package Algorithm.Recursion;
import java.util.*;
public class combination_sum2 {
    public static void getCombination(int idx,int arr[],int target,int n, List<List<Integer>> ans,ArrayList <Integer> ds,int orig){
        if(idx==n){
if(target==0) {
    Collections.sort(ds);
  int sum=ds.stream().mapToInt(Integer ::intValue).sum();
  if(sum==orig)
    ans.add(new ArrayList<>(ds));
    System.out.println(ans);

}
            return;
        }
        System.out.println(target);
        if(arr[idx]<=target&&idx!=n){
            ds.add(arr[idx]);
            getCombination(idx+1,arr,target-arr[idx],n,ans,ds,orig);
            ds.remove(ds.size()-1);
        }

        getCombination(idx+1,arr,target,n,ans,ds,orig);
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        ArrayList <Integer> ds=new ArrayList<>();
        HashSet <List<Integer>> set=new HashSet<>();
        int size=candidates.length;
int orig=target;

        getCombination(0,candidates,target,size,ans,ds,orig);
        for (List ele:
             ans) {
            set.add(new ArrayList<>(ele));
        }
       ans.clear();

        for(List ele:
             set) {
            ans.add(new ArrayList<>(ele));
        }
        return ans;
    }
    public static void main(String[] args) {
int arr[]={1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        List<List<Integer>> ans= new ArrayList<>();

        ans=combinationSum2(arr,27);
       System.out.println(ans);
    }
}
