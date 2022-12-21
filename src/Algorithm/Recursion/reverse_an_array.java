package Algorithm.Recursion;

public class reverse_an_array {
    public static void swap(int arr[],int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
public static void reverse(int arr[],int low,int n){
    //Base Condition as it will be swapped to middle and meet in the middle
        if(low>=n/2) return;
        swap(arr,low,n-low-1);
        reverse(arr,low+1,n);
}

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        reverse(arr,0,arr.length);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
