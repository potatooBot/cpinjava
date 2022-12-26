package Algorithm.Recursion;
import java.util.*;
public class subset_2 {
    public static void printSubse(int arr[],int idx,ArrayList<Integer> arrdq,int n, Set<List<Integer>> ans){
        if (idx == n) {

            ans.add(new ArrayList<>(arrdq));
            return;
        }

        arrdq.add(arr[idx]);
        printSubse(arr,idx+1,arrdq,n,ans);
        arrdq.remove(arrdq.size()-1);
        printSubse(arr,idx+1,arrdq,n,ans);
    }
    public static List<List<Integer>> subsetsWithDup(int[] arr) {
        Set <List<Integer>> ans=new HashSet<>();
        List<List<Integer>> listans=new ArrayList<>();
        ArrayList<Integer> arrdq=new ArrayList<>();
        Arrays.sort(arr);
        printSubse(arr,0,arrdq,arr.length,ans);
        for (List ele:
             ans) {
            listans.add(ele);
        }

        return listans;

    }

    public static void main(String[] args) {
        List<List<Integer>> ans=new ArrayList<>();
        int arr[]={2,1,2};
        ans=subsetsWithDup(arr);
        System.out.println(ans);
    }
}
