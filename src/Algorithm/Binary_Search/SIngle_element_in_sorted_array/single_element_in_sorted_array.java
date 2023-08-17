package Algorithm.Binary_Search.SIngle_element_in_sorted_array;

public class single_element_in_sorted_array {
    static  public int search(int arr[], int n)
    {

        if(n==1) {
            return arr[0];
        }
        if(arr[0]!=arr[1]){
            return arr[0];
        }
        if(arr[n-1]!=arr[n-2]){
            return arr[n-1];
        }

        int low=1;
        int high=n-2;

        while (low<=high){
            int mid=(low+high)/2;


            if(arr[mid]!=arr[mid-1]&&arr[mid]!=arr[mid+1]){
                return arr[mid];
            }


            if((mid%2==1&&arr[mid]==arr[mid-1]) || mid%2==0&&arr[mid]==arr[mid+1])   {
                low=mid+1;
            }
            else {
                high=mid-1;
            }

        }
        return -1;
        // your code here
    }
    public static void main(String[] args) {
        int N = 7;
        int arr[] = {2, 2, 5, 5, 20, 30, 30};
int ans=search(arr,N);
        System.out.println(ans);
    }
}
