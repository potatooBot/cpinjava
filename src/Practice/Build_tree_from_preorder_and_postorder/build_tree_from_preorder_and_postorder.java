package Practice.Build_tree_from_preorder_and_postorder;

import java.util.HashMap;

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class build_tree_from_preorder_and_postorder {
    public static Node build(int inorder[],int inStart,int inEnd,int preorder[],int preStart,int preEnd,HashMap<Integer,Integer> map){
        if(inStart>inEnd||preStart>preEnd) {
            return null;
        }


        Node root=new Node(preorder[preStart]);
        int inRoot=map.get(root.data);

        int numsleft=inRoot-inStart;
        root.left=build(inorder,inStart,inRoot-1,preorder,preStart+1,preStart+numsleft,map);
        root.right=build(inorder,inRoot+1,inEnd,preorder,preStart+numsleft+1,preEnd,map);


        return root;
    }
    public static void postOrder(Node root){
    if (root==null){
        return;

    }
    postOrder(root.left);
    postOrder(root.right);
        System.out.println(root.data);
    }
    public static Node buildTree(int inorder[], int preorder[], int n)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <n ; i++) {
            map.put(inorder[i],i);
        }
        Node root=build(inorder,0,inorder.length-1,preorder,0,preorder.length-1,map);
        postOrder(root);
     return root;   // code here
    }

    public static void main(String[] args) {
        int N = 4;
        int inorder[] = {1, 6 ,8 ,7};
        int preorder[] = {1 ,6 ,7 ,8};
        buildTree(inorder,preorder,N);
    }
}
