//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for(int t=0;t<testCases;t++){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    ArrayList<Integer> A = new ArrayList<Integer>();
		    for(int i=0;i<n;i++){
		        arr[i] = sc.nextInt();
		        A.add(arr[i]);
		        
		    }
		   
		   
		    
		    ArrayList <ArrayList<Integer>> res = new Solution().subsets(A);
		    for (int i = 0; i < res.size (); i++)
		    {
		        for (int j = 0; j < res.get(i).size (); j++)
		        {
		          System.out.print(res.get(i).get(j)+" ");
		        }
		        System.out.println();
		      
		    }
		    //System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
      public static void getSub(ArrayList<Integer> nums,int idx,ArrayList<Integer> ds,ArrayList<ArrayList<Integer>> ans){

        if(idx==nums.size()){
            //if(ds.size()==0) return;
     ans.add(new ArrayList<>(ds));
            return ;
        }

      
ds.add(nums.get(idx));
        getSub(nums,idx+1,ds,ans);
        ds.remove(ds.size()-1);
      

        getSub(nums,idx+1,ds,ans);
    }
    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> nums)
    {
          ArrayList<Integer> ds=new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
       // Arrays.sort(nums);
        getSub(nums,0,ds,ans);
       // System.out.println(ans);
       Collections.sort(ans, new LexicographicComparator());
        return ans;
    }
      static class LexicographicComparator implements Comparator<ArrayList<Integer>> {
        @Override
        public int compare(ArrayList<Integer> list1, ArrayList<Integer> list2) {
            int size = Math.min(list1.size(), list2.size());
            for (int i = 0; i < size; i++) {
                int cmp = list1.get(i).compareTo(list2.get(i));
                if (cmp != 0) {
                    return cmp;
                }
            }
            return Integer.compare(list1.size(), list2.size());
        }
      }
}