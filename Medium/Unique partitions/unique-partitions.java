//{ Driver Code Starts
//Initial Template for Java

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
            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> ans = ob.UniquePartitions(n);
            for(ArrayList<Integer>i: ans)
                for(int j: i)
                    System.out.print(j + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static void getSub(int nums[],ArrayList<Integer> ds, ArrayList< ArrayList<Integer>> ans,int target,int idx){
        if(idx==nums.length){
            if(target==0){
                if(ans.contains(ds)==false){
                Collections.sort(ds,Collections.reverseOrder());
                ans.add(new ArrayList<>(ds));
                }
                
            }
            return;
        }
        if(target==0){
              if(ans.contains(ds)==false){
            Collections.sort(ds,Collections.reverseOrder());
            ans.add(new ArrayList<>(ds));
              }
              return;
        }
        
        
        if(target>=nums[idx]){
            ds.add(nums[idx]);
            getSub(nums,ds,ans,target-nums[idx],idx);
            ds.remove(ds.size()-1);
        }
        
        getSub(nums,ds,ans,target,idx+1);
    }
    public ArrayList<ArrayList<Integer>> UniquePartitions(int n)
    {
      int nums[]=new int[n];
      
      for(int i=0;i<n;i++){
          nums[i]=n-i;
      }
      ArrayList<Integer> ds=new ArrayList<>();
      ArrayList< ArrayList<Integer>> ans=new ArrayList<>();
      getSub(nums,ds,ans,n,0);
  //Collections.sort(ans, (a, b) -> Integer.compare(a.size(), b.size()));
   // System.out.println(ans);
        return ans;
    }
}