package DSA.LinkedList.Reverse_Linked_List_in_k_groups;

import java.util.Arrays;
import java.util.stream.Collectors;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class reverse_linked_list_in_k_groups {
      static public ListNode reverseKGroup(ListNode head, int k) {
if(head==null||k==1) return head;
          ListNode dummy=new ListNode(0);
dummy.next=head;
          ListNode cur=head;
          int count=0;
          while (cur!=null){
              count++;
              cur=cur.next;


          }

          ListNode next=dummy;
          ListNode prev=dummy;
          cur=dummy;

          while (count>=k){
              cur=prev.next;
              next=cur.next;


              for (int i = 1; i <k ; i++) {
                  cur.next=next.next;
                  next.next=prev.next;
                  prev.next=next;
                  next=cur.next;
              }
              prev=cur;
              count=count-k;

          }



          return dummy.next;
      }
    public static void main(String[] args) {
ListNode head=new ListNode(1);
head.next=new ListNode(2);
head.next.next=new ListNode(3);
head.next.next.next=new ListNode(4);
head.next.next.next.next=new ListNode(5);
int k=3;
ListNode cur=reverseKGroup(head,k);
while (cur!=null){
    System.out.println(cur.val);
    cur=cur.next;
}


    }
}
