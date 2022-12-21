package com.company;

public class testarray {
    public static int partition(int arr[],int low,int high){

        int pivot=arr[high];
        int i=low-1;

        for (int j = low; j <high ; j++) {
            if (arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;

        return i; //pivot index;

    }
    public static void quick_sort(int arr[],int low,int high){

        if (low<high){
            int pi=partition(arr,low,high);
            quick_sort(arr,low,pi-1);
            quick_sort(arr,pi+1,high);
        }

    }
    public static void main(String[] args) {
        System.out.println("Unsorted Array");
        int arr[]={-4,8,9,25,-1,0,0,44,-999};
        int n= arr.length;
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nSorted Array");
        quick_sort(arr,0,n-1);
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
