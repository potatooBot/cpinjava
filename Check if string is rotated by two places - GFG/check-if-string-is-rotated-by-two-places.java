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
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2)
    {
        // Your code here
        if(str1.length()<2||str2.length()<2) return false;
        char charArr[]=str1.toCharArray();
        for (int i = 0; i <2 ; i++) {
            char temp=charArr[0];

            for (int j = 0; j <str1.length()-1 ; j++) {
                charArr[j]=charArr[j+1];

            }
            charArr[str1.length()-1]=temp;
    
        }
                String str=new String(charArr);
if (str.equals(str2)) return true;
        charArr=str1.toCharArray();
        String strAns=new String(charArr);
        //System.out.println(strAns);
        for (int i = 0; i <2 ; i++) {
            char temp=charArr[str1.length()-1];

            for (int j = str1.length()-1; j >0 ; j--) {
              charArr[j]=charArr[j-1];
            }
            charArr[0]=temp;
        
    }
        strAns=new String(charArr);
         
   if (strAns.equals(str2)) return true;
    return false;
}
}