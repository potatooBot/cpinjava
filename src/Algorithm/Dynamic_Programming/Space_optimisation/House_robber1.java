package Algorithm.Dynamic_Programming.Space_optimisation;

public class House_robber1 {
    public static int FindMaxSum(int arr[], int n)
    {
        // Your code here

        int prev2=0;
        int prev=arr[0];
        for(int i=1;i<n;i++){
            int take=arr[i];
            if(i>1){
                take=take+prev2;
            }

            int nottake=0+prev;
            int curi=Math.max(take,nottake);
            prev2=prev;
            prev=curi;
        }
        return prev;

    }
    public static void main(String[] args) {
        int n = 6,
                a[] = {5,5,10,100,10,5};
        int result=FindMaxSum(a,n);
        System.out.println(result);
    }
}
