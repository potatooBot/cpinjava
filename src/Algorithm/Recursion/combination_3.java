package Algorithm.Recursion;
import java.util.*;
public class combination_3 {
    public static void getComb(int idx,int k,int target,int arr[],List<List<Integer>> ans,List<Integer> ds){
        if(ds.size()==k){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
  for (int i=idx;i<9;i++) {

          ds.add(arr[i]);
          getComb(i + 1, k, target - arr[i], arr, ans, ds);
          ds.remove(ds.size() - 1);

  }
    }
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        List <Integer > ds=new ArrayList<>();
        int arr[]=new int[9];
        for(int i=1;i<=9;i++){
            arr[i-1]=i;
        }

        getComb(0,k,n,arr,ans,ds);
        return ans;
    }

    public static void main(String[] args) {
        List<List<Integer>> ans=new ArrayList<>();
        ans=combinationSum3(4,1);
        System.out.println(ans);
    }
}
