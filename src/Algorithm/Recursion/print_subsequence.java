package Algorithm.Recursion;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class print_subsequence {
    public static void printSubse(int arr[],int idx,ArrayList<Integer> arrdq,int n, List<List<Integer>> ans){
        if (idx == n) {
        ans.add(new ArrayList<>(arrdq));
//            if(arrdq.size()==0){
//                System.out.println("{}");
//            }

            return;
        }

        arrdq.add(arr[idx]);
        printSubse(arr,idx+1,arrdq,n,ans);
        arrdq.remove(arrdq.size()-1);
        printSubse(arr,idx+1,arrdq,n,ans);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrdq=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList <>();

        int arr[]={1,2,3};
        printSubse(arr,0,arrdq,arr.length,ans);
        System.out.println(ans);    }
}
