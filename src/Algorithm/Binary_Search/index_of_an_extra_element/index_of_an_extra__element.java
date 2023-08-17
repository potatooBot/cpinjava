package Algorithm.Binary_Search.index_of_an_extra_element;

public class index_of_an_extra__element {
    public static int binarySearch(int arr[],int x){
        int low=0;int high=arr.length-1;
        int idxVal=-1;
        while (low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return idxVal;
    }
    static  public int findExtra(int arr1[], int arr2[], int n) {
        for (int i = 0; i <arr1.length ; i++) {
            int ans=binarySearch(arr2,arr1[i]);
            if(ans==-1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int N = 7;
        int arr1[] = {2,4,6,8,9,10,12};
       int arr2[] = {2,4,6,8,10,12};
    int ans=findExtra(arr1,arr2,N);
        System.out.println(ans);
    }
}
