//{ Driver Code Starts
import java.util.*;
class Triplets{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			Solution g=new Solution();
			if(g.findTriplets(a,n))
				System.out.println("1");
			else
				System.out.println("0");
			
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/


class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int nums[] , int n)
    {
    Arrays.sort(nums);
    for(int i=0;i<n-2;i++){
        if(nums[i]>0){
            break;
        }
        
        int low=i+1;
        int high=n-1;
        
        
        while(low<high){
            int sum=nums[i] +nums[low] +nums[high];
            
            if(sum>0){
                high--;
            }
            else if(sum<0){
                low++;
            }
            else {
                return true;
            }
        }
        
    
    }
    return false;
    }
}