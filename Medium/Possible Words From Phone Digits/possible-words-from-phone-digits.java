//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class PhoneDigit
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//testcases
        
        
        while(t-- > 0)
        {
            int n = sc.nextInt(); // input size of array
            int arr[] = new int[n]; //input the elements of array that are keys to be pressed
            
            for(int i = 0; i < n; i++)
               arr[i] = sc.nextInt();//input the elements of array that are keys to be pressed
            ArrayList <String> res = new Solution().possibleWords(arr, n);
            for (String i : res) System.out.print (i + " ");
             System.out.println();
              
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
        public static void backtrack(String digit,int start,String curStr,ArrayList<String> ans,HashMap<Character,String> map){
        if(start==digit.length())
        {
            ans.add(curStr);
            return;
        }
        String val=map.get(digit.charAt(start));
      //  System.out.println(val);
        for(int i=0;i<val.length();i++){
            backtrack(digit,start+1,curStr+val.charAt(i),ans,map);
        }
    }
    //Function to find list of all words possible by pressing given numbers.
    static ArrayList <String> possibleWords(int a[], int N)
    {
        
        String digits="";
        
        for(int ele:a)
        digits+= Integer.valueOf(ele);
       ArrayList<String> ans=new ArrayList<>();
HashMap<Character,String> map=new HashMap<>();
if(digits.length()==0) return ans;
//map.put('0'," ");
//map.put('1',"");
map.put('2',"abc");
map.put('3',"def");
map.put('4',"ghi");
map.put('5',"jkl");
map.put('6',"mno");
map.put('7',"pqrs");
map.put('8',"tuv");
map.put('9',"wxyz");

backtrack(digits,0,"",ans,map);
return ans;
    }
}


