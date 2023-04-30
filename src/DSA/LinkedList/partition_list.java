package DSA.LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class partition_list {
    static     public ListNode partition(ListNode head, int x) {

        ListNode dummy=new ListNode();
        Queue<Integer> q=new LinkedList<>();

        ListNode cur=head;
        ListNode temp=dummy;
        while (cur!=null) {
            if (cur.val < x) {
                ListNode node = new ListNode(cur.val);
                temp .next= node;
                temp=temp.next;
            }
            else {
                q.add(cur.val);
            }
            cur=cur.next;
        }

        while (q.isEmpty()==false){
//            System.out.println(q.peek());
         int val=q.peek();
         q.remove();
         ListNode node=new ListNode(val);
            temp.next=node;
            temp=temp.next;
        }
     return dummy.next;
    }
    public static void printLinkedListSummation(ListNode head){
        ListNode cur=head;
        while (cur!=null){
            System.out.print(cur.val);
            cur=cur.next;
        }
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(4);
head.next.next=new ListNode(3);
head.next.next.next=new ListNode(2);
head.next.next.next.next=new ListNode(5);
head.next.next.next.next.next=new ListNode(2);




   ListNode ans= partition(head,3);
    printLinkedListSummation(ans);
    }

}
