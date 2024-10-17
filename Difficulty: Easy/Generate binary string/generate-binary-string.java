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
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            List<String> res  = ob.generate_binary_string(s);
            for(int i = 0; i < res.size(); i++)
            {
                System.out.print(res.get(i)+" ");
            }
            System.out.println();
        }
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution {
    public void backtrack(String s,int idx,List<String> ans){
        if(idx==s.length()){
            ans.add(s);
            return;
        }
        
        if(s.charAt(idx)=='?'){
            for(char ch='0';ch<='1';ch++){
                String cur=s.substring(0,idx)+ch+s.substring(idx+1);
                backtrack(cur,idx,ans);
            }
        }
            else{
                backtrack(s,idx+1,ans);
            }
    }
    public List<String>generate_binary_string(String s)
    {
        // Code here
        List<String> ans=new ArrayList<>();
        
        backtrack(s,0,ans);
        return ans;
    }
}