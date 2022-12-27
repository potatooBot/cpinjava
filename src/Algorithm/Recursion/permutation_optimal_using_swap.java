//Time Complexity: O(N! X N)
//        Space Complexity: O(1)
package Algorithm.Recursion;

import java.util.ArrayList;
import java.util.List;

public class permutation_optimal_using_swap {
    public static void getPermutat(int idx ,List <List<Integer>> ans,int arr[]){
        if(idx== arr.length){
            ArrayList <Integer> ds=new ArrayList<>();
            for (int i = 0; i < arr.length ; i++) {
                ds.add(arr[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = idx; i < arr.length ; i++) {
            swap(i,idx,arr);
            getPermutat(idx+1,ans,arr);
            swap(i,idx,arr);
        }

    }
    public static void swap(int x,int y,int arr[]){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        List <List<Integer>> ans=new ArrayList<>();
        getPermutat(0,ans,arr);
        System.out.println(ans);
    }
}
