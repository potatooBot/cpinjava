package ARRAYS;

import java.util.ArrayList;

public class contribution {
    public static void newContributions(int arr[],int n){
        ArrayList <Integer> list=new ArrayList<>();
        for (int i = 0; i < arr.length-2 ; i++) {
       list.add(arr[i+1]+arr[i+2] );
        }
        list.add(arr[n-1]+arr[0]);
        list.add(arr[0]+arr[1]);
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
    public static void main(String[] args) {
        int arr[]={10,20,30};
        newContributions(arr, arr.length);
    }
}
