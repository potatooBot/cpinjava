//Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.
//
//        Each number in candidates may only be used once in the combination.
//
//       Note: The solution set must not contain duplicate combinations.
//Time Complexity:O(2^n*k)
package Algorithm.Recursion;
import java.util.*;
public class combination_sum2 {
    public static void getCombination(int idx,int arr[],int target, List<List<Integer>> ans,ArrayList <Integer> ds){
     if(target==0) {
         ans.add(new ArrayList<>(ds));
         return;
     }
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>target) break;
            if (i>idx&&arr[i]==arr[i-1]) continue;
            ds.add(arr[i]);
            getCombination(i+1,arr,target-arr[i],ans,ds);
            ds.remove(ds.size()-1);
        }
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
     List <List<Integer>> ans=new ArrayList<>();
     //First Sort it
        Arrays.sort(candidates);
     getCombination(0,candidates,8,ans,new ArrayList<>());
     return ans;
    }
    public static void main(String[] args) {
int arr[]={1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        List<List<Integer>> ans= new ArrayList<>();

        ans=combinationSum2(arr,27);
       System.out.println(ans);
    }
}
