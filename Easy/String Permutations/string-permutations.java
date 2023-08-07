//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0)
		{
		    
		    Solution ob=new Solution();
		    
		    String S=sc.nextLine();
		    
		    ArrayList<String> arr = ob.permutation(S);
		    for(String s : arr){
		        System.out.print(s+" ");
		    }
		    System.out.println();
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    public static void getPerm(String str,ArrayList<String> list,ArrayList<Character> ds,boolean flag[]){

        if(ds.size()==str.length()){
            String val="";

            for (char ch : ds) {
                val=val+ch;
            }
            list.add(val);
            return;
        }

        for (int i = 0; i <str.length() ; i++) {
            if (flag[i] == false) {
                flag[i]=true;
                ds.add(str.charAt(i));
                getPerm(str,list,ds,flag);
                flag[i]=false;
                ds.remove(ds.size()-1);
            }
        }


    }
    static  public ArrayList<String> permutation(String str)
    {
        ArrayList<String> list=new ArrayList<>();
        ArrayList<Character> ds=new ArrayList<>();
        boolean flag[]=new boolean[str.length()+1];
        getPerm(str,list,ds,flag);
        Collections.sort(list);
     return list;
     //Your code here
    }
	   
}
