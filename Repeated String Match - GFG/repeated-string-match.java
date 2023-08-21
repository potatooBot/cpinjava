//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t > 0){
            String A = sc.nextLine();
            String B = sc.nextLine();
            Solution ob = new Solution();
            System.out.println(ob.repeatedStringMatch(A,B));
            t--;
        }
    } 
} 
        


// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
	static int repeatedStringMatch(String str1, String str2) 
	{ 
          int n1=str1.length();
        int n2=str2.length();
        if(str1.contains(str2)) return 1;
     
int count=0;
        String val="";
       
       while(val.length()<str2.length()) {
            val=val +str1;
count++;
        }
        
        if(val.contains(str2)==true){
            return count;
        }
            val=val+str1;
            count++;
            if(val.contains(str2)==true){
                return count;
            }

return -1;

       
       
       
	} 
} 
