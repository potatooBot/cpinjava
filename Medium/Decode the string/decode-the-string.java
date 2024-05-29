//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s = in.readLine();
            
            Solution ob = new Solution();
            out.println(ob.decodedString(s));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String decodedString(String s){
          Stack<Integer> stk=new Stack<>();
        Stack<String> res=new Stack<>();
int num=0;
String decode="";
for(int i=0;i<s.length();i++){
char ch=s.charAt(i);
if(Character.isDigit(ch)){
    num= 10*num +Character.getNumericValue(ch);
}
else if(ch=='['){
    stk.push(num);
    num=0;
    res.push(decode);
    decode="";
}
else if(ch==']'){
    String tmp=decode;
    decode=res.pop();
    for(int j=stk.pop();j>0;j--){
        decode=decode+tmp;
    }
}
else{
    decode=decode +ch;
}

}

return decode;
    }
}