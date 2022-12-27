package Algorithm.Recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class unique_permutation {
    public static void getPermu(List <List<Integer>> ans, int arr[],Set<List<Integer>> set ,boolean flag[], ArrayList<Integer> list){
        if(list.size()== arr.length){
            set.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < arr.length ; i++) {
            if(flag[i]==false){
                list.add(arr[i]);
                flag[i]=true;
                getPermu(ans,arr,set,flag,list);
                flag[i]=false;
                list.remove(list.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,1,2};
        Set<List<Integer>> set=new HashSet<>();
        List <List<Integer>> ans=new ArrayList<>();
        boolean flag[]=new boolean[arr.length];
        ArrayList <Integer> list=new ArrayList<>();
        getPermu(ans,arr,set,flag,list);

        for (List ele:
             set) {
            ans.add(ele);
        }
        System.out.println(ans);
    }
}
