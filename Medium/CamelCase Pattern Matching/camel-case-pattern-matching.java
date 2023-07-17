//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String[] Dictionary=read.readLine().split(" ");
            String Pattern=read.readLine();
            Solution ob = new Solution();
            ArrayList <String> ans=ob.CamelCase(N,Dictionary,Pattern);
            for(String u:ans)
             System.out.print(u+" ");
            System.out.println(); 
        }
    }
}
// } Driver Code Ends

class Node{
    boolean flag=false;
   Node links[]=new Node[123];
    Node(){

    }
    void put(char ch, Node node){
        if(ch>=65&&ch<=97){
           links[ch-'A']=node;
        }
        else
            links[ch-'a']=node;
    }
   Node get(char ch){
       if(ch>=65&&ch<=97){
           return links[ch-'A'];
       }
       else
        return links[ch-'a'];
    }
    void setEnd(){
        flag=true;
    }
    boolean containsKey(char ch){
        if(ch>=65&&ch<=97){
            return links[ch-'A']!=null;
        }
        else
        return links[ch-'a']!=null;
    }
    boolean getEnd(){
        return flag;
    }
}
//User function Template for Java

class Solution{
      static Node root;
   Solution(){
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
    public static boolean ifPrefixExist(String word,String pattern){
        Node node=root;
        int count=0;
        for (int i = 0; i <word.length() ; i++) {
            if(word.charAt(i)>=97&&word.charAt(i)<=122){
                continue;
            }
            if(node.containsKey(word.charAt(i))==false){
                return false;
            }
            count++;
            if(count==pattern.length()) return true;
            node=node.get(word.charAt(i));
        }
        return false;

    }
    ArrayList<String> CamelCase(int N,String[] dictionary,String pattern){
                ArrayList<String> ans=new ArrayList<>();
        Solution T=new Solution();

        T.insert(pattern);

        for (int i = 0; i <dictionary.length ; i++) {
            if(T.ifPrefixExist(dictionary[i],pattern)){
ans.add(dictionary[i]);
            }
        }
        Collections.sort(ans);
       // System.out.println(ans);
        if(ans.isEmpty()){
            ans.add("-1");
        }
        return ans;
    }
}