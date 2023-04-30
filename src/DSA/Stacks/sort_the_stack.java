package DSA.Stacks;

import java.util.Stack;

public class sort_the_stack {
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for (int j = low; j <=high-1 ; j++) {
            if(arr[j]>pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return (i+1);
    }

    static void quicksort(int arr[],int low,int high){
        if(low<high){
            int pidx=partition(arr,low,high);
            quicksort(arr,low,pidx-1);
            quicksort(arr,pidx+1,high);
        }
    }

    public static void sort(Stack<Integer> s)
    {
        System.out.println(s.size());
        int size=s.size();
        int [] arr=new int[size];
        for (int i = 0; i <size ; i++) {
arr[i]=s.pop();
        }
        quicksort(arr,0,size-1);

        for (int i = 0; i <size ; i++) {
            s.add(arr[i]);
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        Stack <Integer> stk=new Stack<>();
        stk.add(3);
        stk.add(2);
        stk.add(1);
//        stk.add(3);
//        stk.add(41);
        sort(stk);
    }
}


//+++++++++++++++++++Good Letcode SOlution+++++++++++++++++++++

//    void insert(stack<int>& s, int val){
//        if(s.empty())  s.push(val);
//        else if(!s.empty() and s.top() < val) s.push(val);
//  else{
//            int val1 = s.top();
//            s.pop();
//            insert(s, val);
//            s.push(val1);
//        }
//    }
//
//    void reverse(stack<int>& s){    //1,2,3,5,3
//        if(!s.empty()) return;
//        int val = s.top();   // 1, 2, 3, 5, 3
//        s.pop();
//        reverse(s);
//        insert(s, val);
//    }