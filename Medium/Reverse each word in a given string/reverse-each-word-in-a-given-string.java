//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
            
            Solution ob = new Solution();
            
            System.out.println(ob.reverseWords (s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
   
    String reverseWords(String str)
    {
              Stack<Character> stk=new Stack<>();
        String ans="";
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='.'){
                while (stk.isEmpty()==false){
                    ans=ans+stk.pop();
                }
                ans=ans+'.';
            }
            else {
                stk.push(str.charAt(i));
            }
        }
      while (stk.isEmpty()==false){
          ans=ans+stk.pop();
      }
     return ans;  
    }
}