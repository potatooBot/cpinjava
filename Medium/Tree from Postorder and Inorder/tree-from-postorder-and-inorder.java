//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int value) {
        data = value;
        left = null;
        right = null;
    }
}

class InorderPostorderToTree {
    public void preOrder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);

        preOrder(root.right);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        InorderPostorderToTree ip = new InorderPostorderToTree();
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int inorder[] = new int[n];
            int postorder[] = new int[n];
            for (int i = 0; i < n; i++) inorder[i] = sc.nextInt();
            for (int i = 0; i < n; i++) postorder[i] = sc.nextInt();
            GfG g = new GfG();
            Node root = g.buildTree(inorder, postorder, n);
            ip.preOrder(root);
            System.out.println();

            T--;
        }
    }
}

// } Driver Code Ends


/* Tree node structure
class Node
{
    int data;
    Node left;
    Node right;

        Node(int value)
    {
        data = value;
        left = null;
        right = null;
    }
}*/


class GfG
{
    public static Node build(int postorder[],int postStart,int postEnd,int inorder[],int inStart,int inEnd,HashMap<Integer,Integer> map){
if(postStart>postEnd||inStart>inEnd){
    return null;
}    

Node root=new Node(postorder[postEnd]);
int inIdx=map.get(postorder[postEnd]);
int numleft=inIdx-inStart;

root.left=build(postorder,postStart,postStart+numleft-1,inorder,inStart,inIdx-1,map);
root.right=build(postorder,postStart+numleft,postEnd-1,inorder,inIdx+1,inEnd,map);
return root;
}
    //Function to return a tree created from postorder and inoreder traversalhttps://www.geeksforgeeks.org/geek-olympics-2023s.
    Node buildTree(int inorder[], int postorder[], int n) {
          HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
      
      for(int i=0;i<inorder.length;i++){
          
          map.put(inorder[i],i);
      }
      
      Node root=build(postorder,0,postorder.length-1,inorder,0,inorder.length-1,map);
      return root;
    }
}
