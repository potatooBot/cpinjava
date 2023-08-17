package Algorithm.SDE_QUESTIONS;

public class length_of_longest_positive_product_subarray {
    static   int maxLength(int arr[], int n) {
     int maxi=Integer.MIN_VALUE;
     int pref=1;
     int count=-1;
     int start=0;
        int maxCount=0;
        for (int end = 0; end <n ; end++) {


            if(pref==0){
                count=0;
            start=end;
            pref=1;
            }

            pref=pref*arr[end];
            if (maxi<pref){
                count=Math.max(count,end-start+1);
                maxi=pref;
                maxCount=Math.max(maxCount,count);
            }
        }


     return maxCount ;   //code here
    }
    public static void main(String[] args) {
        int arr[] ={0, 1, -2, -3, -4};
        int ans=maxLength(arr,arr.length);
        System.out.println(ans);
    }
}
