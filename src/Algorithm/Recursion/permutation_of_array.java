package Algorithm.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permutation_of_array {
    public static void getPermu(List <List<Integer>> ans,int arr[],boolean flag[], ArrayList <Integer> list){
        if(list.size()== arr.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < arr.length ; i++) {
            if(flag[i]==false){
                list.add(arr[i]);
                flag[i]=true;
                getPermu(ans,arr,flag,list);
                flag[i]=false;
                list.remove(list.size()-1);
            }
        }
    }
    public static  List<List<Integer>> perm(int arr[]){
        List <List<Integer>> ans=new ArrayList<>();
        boolean flag[]=new boolean[arr.length];
        ArrayList <Integer> list=new ArrayList<>();
        getPermu(ans,arr,flag,list);
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        List <List<Integer>> ans=new ArrayList<>();
        ans=perm(arr);
        System.out.println(ans);
    }
}
