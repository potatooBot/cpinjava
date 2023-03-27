//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minSwaps(nums);
            System.out.println(ans);
       }
    }
}
// } Driver Code Ends




class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
         public int minSwaps(int nums[])
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n= nums.length;
        int temp[]= Arrays.copyOfRange(nums,0,n);
        Arrays.sort(temp);
int ans=0;
 


      //  System.out.println();
        for (int i = 0; i <n ; i++) {
            map.put(nums[i],i);
        }

      //  System.out.println(map);
        for (int i = 0; i <n ; i++) {
            if(nums[i]==temp[i]) continue;
            else {
       ans++;
                int iniatialPos=nums[i];
                swap(nums,i,map.get(temp[i]));
map.put(iniatialPos,map.get(temp[i]));
map.put(temp[i],i);
            }
        }
       // System.out.println();


     return ans;   // Code here
    }
    public static void swap(int [] nums,int x,int y){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
}