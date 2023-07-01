//{ Driver Code Starts
import java.util.*;
import java.io.*;
class Node
{
    int data; 
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}

class GFG
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node root = null;
            int inorder[] = new int[n];
            int preorder[] = new int[n];
            for(int i = 0; i < n; i++)
              inorder[i] = sc.nextInt();
              
            for(int i = 0; i < n; i++)
              preorder[i] = sc.nextInt();
              
            Solution ob = new Solution();
            root = ob.buildTree(inorder, preorder, n);
            postOrdrer(root);
            System.out.println();
        }
    }
    
    public static void postOrdrer(Node root)
    {
        if(root == null)
          return;
          
        postOrdrer(root.left);
        postOrdrer(root.right);
        System.out.print(root.data + " ");
    }
}
// } Driver Code Ends


class Solution
{
        public static Node build(int inorder[],int inStart,int inEnd,int preorder[],int preStart,int preEnd,HashMap<Integer,Integer> map){
        if(inStart>inEnd||preStart>preEnd) {
            return null;
        }


        Node root=new Node(preorder[preStart]);
      
    int ind = 0;
        for(int i = 0; i < inorder.length; i++){
            if(inorder[i] == preorder[preStart]){
                ind = i;
                inorder[i] = -1;
                break;
            }
        }
        int numsleft=ind-inStart;
        root.left=build(inorder,inStart,ind-1,preorder,preStart+1,preStart+numsleft,map);
        root.right=build(inorder,ind+1,inEnd,preorder,preStart+numsleft+1,preEnd,map);


        return root;
    }

    public static Node buildTree(int inorder[], int preorder[], int n)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <n ; i++) {
            map.put(inorder[i],i);
        }
        Node root=build(inorder,0,inorder.length-1,preorder,0,preorder.length-1,map);
     
     return root;   // code here
    }
}
