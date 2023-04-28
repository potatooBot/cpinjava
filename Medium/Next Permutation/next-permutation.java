//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.nextPermutation(N, arr);
            StringBuilder out = new StringBuilder();
            for(int i = 0;i < N;i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static List<Integer> nextPermutation(int N, int nums[]){
      int idx=-1;
int n= nums.length;
        for (int i = n-2; i >=0 ; i--) {
            if(nums[i]<nums[i+1]){
                idx=i;
                break;
            }

        }
 

        if(idx==-1) {
            List<Integer> list=new ArrayList<>();
            for (int i = 0; i <nums.length ; i++) {
                list.add(nums[i]);
            }
            Collections.reverse(list);
         return list; 
        }
        else {

            for (int i = n - 1; i > idx; i--) {
                if (nums[i] > nums[idx]) {
                    int temp = nums[idx];
                    nums[idx] = nums[i];
                    nums[i] = temp;
                    break;
                }
            }
            ArrayList<Integer> ds=new ArrayList<>();
            for (int i = idx+1; i <n ; i++) {
                ds.add(nums[i]);
            }
            // System.out.println(ds);
            Collections.reverse(ds);
            // System.out.println(ds);
            idx=idx+1;
//        System.out.println(Arrays.stream(nums).boxed().collect(Collectors.toList()));
            for (int i = 0; i <ds.size() ; i++) {
                nums[idx++]=ds.get(i);
            }
        }
        List<Integer> ds=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            ds.add(nums[i]);
        }
        return ds;
    }
}