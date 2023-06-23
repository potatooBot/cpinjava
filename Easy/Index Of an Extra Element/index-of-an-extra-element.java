//{ Driver Code Starts
import java.util.*;
class ExtraElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n - 1];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n - 1; i++) b[i] = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.findExtra(a, b, n));
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/
class Solution {
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
}