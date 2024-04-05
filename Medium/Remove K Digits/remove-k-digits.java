//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String S = sc.next();
            int K = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.removeKdigits(S, K));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public String removeKdigits(String nums, int k) {
        Stack<Integer> stk=new Stack<>();
int n=nums.length();
     int i=0;
     for( i=0;i<n;i++){
        int val=Character.getNumericValue(nums.charAt(i));
        while(stk.isEmpty()==false&&stk.peek()>val&&k!=0){
            stk.pop();
            k--;
        }
        if(stk.isEmpty()==false||val!=0)
        stk.push(val);
      //  if(k==0) break;
   // System.out.println(stk);
     }
while(stk.isEmpty()==false&&k!=0){
        stk.pop();
    k--;
    }
  
 // System.out.println(stk);
      StringBuilder ans=new StringBuilder("");
        while(!stk.isEmpty())
        {
            ans=ans.append(stk.pop());
        }
        String a=ans.reverse().toString();
        if(a.equals(""))
        return "0";
        return a;
    }
}