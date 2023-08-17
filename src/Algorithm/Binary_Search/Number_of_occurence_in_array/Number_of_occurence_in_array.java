package Algorithm.Binary_Search.Number_of_occurence_in_array;

public class Number_of_occurence_in_array {
    public static int getFirst(int arr[],int x){
        int low=0;int high= arr.length-1;
        int first=-1;
        while (low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==x){
                first=mid;
                high=mid-1;
            }
           else if(arr[mid]<x)
            {
                low=mid+1;
            }
            else {
            high=mid-1;
            }
        }
        return first;
    }
    public static int getLast(int arr[],int x){
        int low=0;int high= arr.length-1;
        int last=-1;
        while (low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==x){
                last=mid;
                low=mid+1;
            }
            else if(arr[mid]<x)
            {
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return last;
    }
    static    int count(int[] arr, int n, int x) {
     int first=getFirst(arr,x);
     int last=getLast(arr,x);


     return last-first+1;        // code here
    }
    public static void main(String[] args) {
        int N = 7, X = 2;
        int arr[] = {1, 1, 2, 2, 2, 2, 3};
int ans=count(arr,N,X);
        System.out.println(ans);
    }
}
