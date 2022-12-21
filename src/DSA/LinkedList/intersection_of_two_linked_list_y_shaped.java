package DSA.LinkedList;
import java.util.*;
public class intersection_of_two_linked_list_y_shaped {
    static class ListNode {
        public int data;
        public ListNode next;

        public ListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //if any one of is Null

        if(headA==null||headB==null)

            return null;


        ListNode a=headA;
        ListNode b= headB;
        while(a!=b){
//             if(a == null) a = headB;
//             else a = a.next;
//
//             if(b == null) b = headA;
            a=a==null? headB : a.next;
            b=b==null? headA : b.next;
        }
        return a;

    }
    public static void main(String[] args) {

    }
}
