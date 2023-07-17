//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;

public class code1 
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t=Integer.parseInt(in.readLine());
        while(t-->0){
            String s1[]=in.readLine().trim().split(" ");
            String s2[]=in.readLine().trim().split(" ");

            Solution ob=new Solution();
            int ans=ob.prefixSuffixString(s1,s2);
            out.println(ans);

        }
        out.close();
    }
}
// } Driver Code Ends

class Node{
    boolean flag=false;
    Node links[]=new Node[26];
    Node(){

    }
    void put(char ch,Node node){
        links[ch-'a']=node;
    }
    Node get(char ch){
        return links[ch-'a'];
    }
    void setEnd(){
        flag=true;
    }
    boolean containsKey(char ch){
        return links[ch-'a']!=null;
    }
    boolean getEnd(){
        return flag;
    }
}
//User function Template for Java
class Solution
{
    static Node root;
    Solution (){
        root=new Node();
    }

    public static void insert(String word){
        Node node=root;
        for (int i = 0; i <word.length() ; i++) {
                if (!node.containsKey(word.charAt(i))) {
                    node.put(word.charAt(i),new Node());
                }
                node=node.get(word.charAt(i));

            node.setEnd();
        }
    }
    public static boolean ifPrefixExist(String word){
        Node node=root;
        for (int i = 0; i <word.length() ; i++) {
            if(node.containsKey(word.charAt(i))==false){
                return false;
            }
            node=node.get(word.charAt(i));
        }
        return true;
    }
    public int prefixSuffixString(String s1[],String s2[])
    {
     Solution T=new Solution();
        for (int i = 0; i <s1.length ; i++) {
            T.insert(s1[i]);
        }

        for (int i = 0; i <s1.length ; i++) {
            StringBuilder sb=new StringBuilder(s1[i]).reverse();
            String str=sb.toString();
         T.insert(str);
        }
int count=0;
        for (int i = 0; i <s2.length ; i++) {
            StringBuilder sb=new StringBuilder(s2[i]).reverse();
            String str=sb.toString();
            if(T.ifPrefixExist(s2[i])||T.ifPrefixExist(str)){
                count++;
            }
        }


        return count;
    }
}