//{ Driver Code Starts
import java.util.*;

class Sorted_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            GfG obj = new GfG();
            System.out.println(obj.transitionPoint(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG {
        public static int getFirst(int arr[],long x){
        int first=-1;
        int low=0;
        int high= arr.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                high=mid-1;
                first=mid;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }
            else {
                high=mid-1;
            }


        }
        return first;
    }
    int transitionPoint(int arr[], int n) {
       int x=arr[0];
      
      if(arr[0]==1){
          return 0;
      }
      
       return getFirst(arr,1);
 
    }
}