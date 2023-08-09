//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		String s12 = sc.nextLine();
		for(int i=0; i<t; i++){
		    String s1 = sc.nextLine();
		    String s2 = sc.nextLine();
		    
		    Solution obj = new Solution();
		    
		    boolean flag = obj.isRotated(s1, s2);
		    
		    if(flag == true) System.out.println("1");
		    else System.out.println("0");
		    
		}
	}
}
// } Driver Code Ends


class Solution
{
        public static void reverse(char arr[],int start,int end){


        while(start<=end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void checkLeft(char arr[]){
        reverse(arr,0,1);
        reverse(arr,2,arr.length-1);
        reverse(arr,0,arr.length-1);

    }
    public static void  checkRight(char arr[]){
        reverse(arr,0,arr.length-1);
        reverse(arr,0,1);
        reverse(arr,2,arr.length-1);
    }
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str, String str2)
    {
        if(str.length()!=str2.length()){
   return false;
}
if(str.length()==1&&str2.length()==1){
    if(str.equals(str2)) return true;
   return false;
}
        int n=str.length();
char arr[]=new char[n];
arr=str.toCharArray();

        char arr2[]=new char[n];
        arr2=str.toCharArray();
checkLeft(arr);
checkRight(arr2);
String res1=new String(arr);
String res2=new String(arr2);
boolean ans1=false;
boolean ans2=false;
if(res1.equals(str2)){
    ans1=true;
}
if(res2.equals(str2)){
    ans2=true;
}
if(ans1||ans2){
    return true;
}
else {
    return false;
}

    }
    
}