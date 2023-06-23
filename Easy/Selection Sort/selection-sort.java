//{ Driver Code Starts
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n]; 
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
		
			Solution obj = new Solution();
			obj.selectionSort(arr, n);
			
			for(int i=0;i<n;i++)
		    	System.out.print(arr[i]+" ");
		    System.out.println();
			t--;
		}
		
	}
}

// } Driver Code Ends


class Solution
{
   static int  select(int arr[], int i)
    {
        int minValidx=-1;
        int val=arr[i];
        for (int j = i; j <arr.length ; j++) {
            if(arr[j]<=val){
                val=arr[j];
                minValidx=j;
            }
        }
        // code here such that selectionSort() sorts arr[]
    return minValidx;
    }

  static   void selectionSort(int arr[], int n)
    {

        for (int i = 0; i <n-1 ; i++) {
            int mini=i;
            int j=select(arr,i);
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        //code here
    }
}