package DSA.LinkedList.Important_Sorted_Linked_List_ToBST;

import java.util.ArrayList;
import java.util.TreeMap;

class LNode
{
    int data;
    LNode next;
    LNode(int d) {
        data = d;
        next = null;
    }
}

//Tree Node
class TNode
{
    int data;
    TNode left, right;
    TNode(int x)
    {
        data=x;
        left=right=null;
    }

}
public class Important_Sorted_Linked_List_ToBST {
//    static TNode root;
    static TNode sortedToBst(ArrayList<Integer> arrayList,int start,int end){
        if(start>end){
            return null;
        }
        int mid=start+((end-start)/2);
        TNode root=new TNode(arrayList.get(mid));
        root.left=sortedToBst(arrayList,start,mid-1);
        root.right=sortedToBst(arrayList,mid+1,end);
        return root;
    }
    static  public TNode sortedListToBST(LNode head)
    {
TNode cur2=null;
LNode cur=head;
        ArrayList<Integer> arrList=new ArrayList<>();
while (cur!=null){
    arrList.add(cur.data);
    cur=cur.next;
}
TNode ans=sortedToBst(arrList,0,arrList.size()-1);

return ans;
        //code here
    }
    public static void inorder(TNode root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        inorder(root.left);

        inorder(root.right);
    }
    public static void main(String[] args) {
        LNode head=new LNode(1);
        head.next=new LNode(2);
//        head.next.next=new LNode(3);
//        head.next.next.next=new LNode(4);
//        head.next.next.next.next=new LNode(5);
//        head.next.next.next.next.next=new LNode(6);
//        head.next.next.next.next.next.next=new LNode(7);
        TNode ans=sortedListToBST(head);
        inorder(ans);
    }
}
