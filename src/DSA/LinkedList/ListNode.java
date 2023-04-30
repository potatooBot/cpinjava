package DSA.LinkedList;

public class ListNode {
    int val;
    public ListNode next;
    public ListNode(int val){
        this.val=val;
    }
    public ListNode(){

    }
    public ListNode(int data,ListNode next){
        this.val= next.val;
        this.next=next;
    }
}
