//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    sc.nextLine();
		    Solution obj = new Solution();
		    String arr[]=sc.nextLine().split(" ");
		    System.out.println(obj.mostFrequentWord(arr, n));
		    
		}
	}
}

// } Driver Code Ends
//User function Template for Java
class Node {
    Node links[]=new Node[26];
 int cntEndWith=0;
    int cntprefix=0;
    Node(){

    }

    boolean containsKey(char ch){
        return (links[ch-'a']!=null);
    }
    Node get(char ch){
        return links[ch-'a'];
    }
    void put(char ch,Node node){
        links[ch-'a']=node;
    }
    void increamentPrefix(){
        cntprefix++;
    }
       void increamentEndWith(){
        cntEndWith++;
    }
    int getEndsWith(){
        return cntEndWith;
    }
    int getPredixCount(){
        return cntprefix;
    }

}

class Solution{
    private static Node root;
 Solution(){
        root=new Node();
    }
    public void insert(String word){

        Node node=root;
        for (int i = 0; i <word.length() ; i++) {
            if(!node.containsKey(word.charAt(i))){
                node.put(word.charAt(i),new Node());
            }
            node=node.get(word.charAt(i));
            node.increamentPrefix();
        }
        node.increamentEndWith();
    }
    public int countEndsWith(String word){
        Node node=root;
        for (int i = 0; i <word.length() ; i++) {
            if(node.containsKey(word.charAt(i))){
                node=node.get(word.charAt(i));
            }
            else {
                return 0;
            }

        }
        return node.getEndsWith();
    }


    //Function to find most frequent word in an array of strings.
    public String mostFrequentWord(String arr[],int n)
    {
         Solution T=new Solution();
        Node node=root;
        for (int i = 0; i < arr.length ; i++) {
            T.insert(arr[i]);
        }
        HashMap<String,Integer> map=new HashMap<>();
        int maxi=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            int val= T.countEndsWith(arr[i]);
            map.put(arr[i],val);

        maxi=Math.max(maxi,val);
        }
        String ans="";
                  
       Set<String> set=new TreeSet<String>();
    
        for (Map.Entry<String,Integer> entry:
                map.entrySet()) {
            if(maxi==(int) entry.getValue()){
          set.add(entry.getKey());
            }
        }
        int count=set.size();
 
    for(int i=0;i<arr.length;i++){
        for(String str:set){
            if(arr[i]==str&&count>1){
                set.remove(arr[i]);
                  count--;
                break;
              
                
            }
           if(count==1){
       break;
            }
        }
    }
  for(String str:set){
      ans=str;
  }
    return ans;    // code here
    }

}


//{ Driver Code Starts.
// } Driver Code Ends