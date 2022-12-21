package Algorithm.Recursion;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class print_subsequence {
    public static void printSubse(int arr[],int idx,ArrayList<Integer> arrdq,int n){
        if (idx == n) {
            for (int i = 0; i <arrdq.size() ; i++) {
                System.out.print(arrdq.get(i)+" ");
            }
            if(arrdq.size()==0){
                System.out.println("{}");
            }
            System.out.println();
            return;
        }

        arrdq.add(arr[idx]);
        printSubse(arr,idx+1,arrdq,n);
        arrdq.remove(Integer.valueOf(arr[idx]));
        printSubse(arr,idx+1,arrdq,n);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrdq=new ArrayList<>();
        int arr[]={3,3,6,8};
        printSubse(arr,0,arrdq,arr.length);
    }
}
