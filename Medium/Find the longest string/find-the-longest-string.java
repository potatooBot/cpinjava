//{ Driver Code Starts
import java.io.*;
import java.util.*;


class StringArray
{
    public static String[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        return s;
    }

    public static void print(String[] a)
    {
        for(String e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<String> a)
    {
        for(String e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            String[] arr = StringArray.input(br, n);
            
            Solution obj = new Solution();
            String res = obj.longestString(n, arr);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends

class Node {
   Node links[]=new Node[26];
boolean flag=false;
    Node(){

    }

    boolean containsKey(char ch){
        return (links[ch-'a']!=null);
    }
   Node get(char ch){
        return links[ch-'a'];
    }
    void put(char ch, Node node){
        links[ch-'a']=node;
    }
   void setFlag(){
        flag=true;
   }
   boolean getFlag(){
        return flag;
   }

}
class Solution {
  private  Node root;
   Solution (){
        root=new Node();
    }
    public void insert(String word){
        Node node=root;
        for (int i = 0; i <word.length() ; i++) {
            if(node.containsKey(word.charAt(i))==false){
                node.put(word.charAt(i),new Node());
            }
            node=node.get(word.charAt(i));
        }
        node.setFlag();
    }
    public boolean countIfPrefixExist(String word){
        Node node=root;
        boolean flag=true;
        for (int i = 0; i <word.length() ; i++) {
            if(node.containsKey(word.charAt(i))){

                node=node.get(word.charAt(i));
                flag=flag&node.getFlag();
            }
            else {
                return false;
            }
        }
        return flag;
    }

    public static String longestString(int n, String[] arr) {
Solution  T=new Solution ();
        for (int i = 0; i < arr.length ; i++) {
            T.insert(arr[i]);
        }
String longest="";
        for (int i = 0; i < arr.length ; i++) {
            if(T.countIfPrefixExist(arr[i])==true){
                if (arr[i].length()>longest.length()){
                    longest=arr[i];
                }
                else if (arr[i].length()==longest.length()){
                    if(arr[i].compareTo(longest)<0){
                        longest=arr[i];
                    }

                }
            }
        }

    return longest;
}
}
        
