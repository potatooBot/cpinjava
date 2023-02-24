package Algorithm.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Combination {
    public static void getCombi(int arr[],List<List<Integer>> ans,List<Integer> ds,int k,int idx){
        if(ds.size()==k){
            ans.add(new ArrayList<>(ds));
            return;
        }

        if(idx>= arr.length) return;


        ds.add(arr[idx]);
        getCombi(arr,ans,ds,k,idx+1);
        ds.remove(ds.size()-1);

       getCombi(arr,ans,ds,k,idx+1);



    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        int arr[]=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=i+1;
        }
        getCombi(arr,ans,ds,k,0);
        return ans;
    }
    public static void main(String[] args) {
        int n = 1, k = 1;
        List<List<Integer>> ans=new ArrayList<>();
 ans=combine(n,k);
        System.out.println(ans);

}
}