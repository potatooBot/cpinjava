//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.math.*;

class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}

class GFG
{
    static Node buildTree(String str)
    {
        // Corner Case
        if(str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");
        
        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        
        // Starting from the second element
        int i = 1;
        while(!q.isEmpty() && i < s.length)
        {
              // Get and remove the front of the queue
              Node currNode = q.remove();
        
              // Get the current node's value from the string
              String currVal = s[i];
        
              // If the left child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the left child for the current node
                  currNode.left = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.left);
              }
        
              // For the right child
              i++;
              if(i >= s.length)
                  break;
              currVal = s[i];
        
              // If the right child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the right child for the current node
                  currNode.right = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.right);
              }
              
              i++;
        }
    
        return root;
    }
    
    public static void main(String args[]) throws IOException {
    
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t>0)
        {
            String s = br.readLine();
            Node root = buildTree(s);
            
            int k = Integer.parseInt(br.readLine().trim());
            
            Solution T = new Solution();
            System.out.println(T.minDiff(root,k));
            t--;
        }
    }
}
// } Driver Code Ends


//User function Template for Java

/*
class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}
*/

class Solution
{
        public static void inorder(Node root,int maxi[],int K){
        if(root==null) return;

        inorder(root.left,maxi,K);
maxi[0]=Math.min(maxi[0],Math.abs(K-root.data));
inorder(root.right,maxi,K);
    }

    public static int findFloor(ArrayList<Integer> ds,int val){
int low=0;
int high=ds.size()-1;

int ans=-1;
while(low<=high)
{
int mid=(low+high)/2;
if(ds.get(mid)<=val){
    ans=ds.get(mid);
    low=mid+1;
}
else{
    high=mid-1;
}

}
return ans; 
    }
        public static int findCeil(ArrayList<Integer> ds,int val){
int low=0;
int high=ds.size()-1;

int ans=-1;
while(low<=high)
{
int mid=(low+high)/2;
if(ds.get(mid)>=val){
    ans=ds.get(mid);
    high=mid-1;
}
else{
    low=mid+1;
}

}
return ans; 
    }
    //Function to find the least absolute difference between any node
    //value of the BST and the given integer.
    static int minDiff(Node  root, int K) 
    { 
    ArrayList<Integer>ds=new ArrayList<>();
    int maxi[]=new int[1];
    maxi[0]=Integer.MAX_VALUE;
       inorder(root,maxi,K);

    
    return maxi[0];
       
    } 
}

