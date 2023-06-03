//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int K;
            K = sc.nextInt();

            int N;
            N = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<ArrayList<Integer>> ans = obj.combinationSum(K, N);
            Collections.sort(ans, new Comparator<ArrayList<Integer>>() {
                @Override   public int compare(ArrayList<Integer> a,
                                             ArrayList<Integer> b) {
                    int al = a.size();
                    int bl = b.size();
                    int min = Math.min(al, bl);
                    for (int i = 0; i < min; i++) {
                        if (a.get(i) < b.get(i))
                            return -1;
                        else if (a.get(i) > b.get(i))
                            return 1;
                    }
                    if (al < bl)
                        return -1;
                    else if (al > bl)
                        return 1;
                    return -1;
                }
            });
            for (int i = 0; i < ans.size(); i++) {
                ArrayList<Integer> cur = ans.get(i);
                for (int j = 0; j < cur.size(); j++) {
                    System.out.print(cur.get(j) + " ");
                }
                System.out.println();
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static void getCombination(int nos,int target,int nums[],ArrayList<Integer> ds, ArrayList<ArrayList<Integer>> ans,int idx){
        if(idx==nums.length){
            if(target==0&&ds.size()==nos){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
    
if(nums[idx]<=target){    
    ds.add(nums[idx]);
    getCombination(nos,target-nums[idx],nums,ds,ans,idx+1);
    ds.remove(ds.size()-1);
    }
       getCombination(nos,target,nums,ds,ans,idx+1);
    }
    public static ArrayList<ArrayList<Integer>> combinationSum(int K, int N) {
        int nums[]={1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> ds=new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        getCombination(K,N,nums,ds,ans,0);
return ans;        
    }
}