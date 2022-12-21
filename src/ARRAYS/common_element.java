package ARRAYS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.*;

public class common_element {


     static void commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
    {

        ArrayList <Integer> list=new ArrayList<>();

        for (int i = 0; i <n1 ; i++) {
int v2=Arrays.binarySearch(B,A[i]);
int v3=Arrays.binarySearch(C,A[i]);

if(v2>=0&&v3>=0&&!list.contains(A[i])){
    list.add(A[i]);
}

        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        int []A = {1, 5, 10, 20, 40, 80};
        int[] B = {6, 7, 20, 80, 100};
        int [] C = {3, 4, 15, 20, 30, 70, 80, 120};
        commonElements(A,B,C,A.length,B.length,C.length);
    }
}
