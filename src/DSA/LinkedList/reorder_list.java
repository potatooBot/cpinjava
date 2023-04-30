package DSA.LinkedList;

import java.util.Stack;

class ListNode2{
    int val;
    ListNode2 next;
    ListNode2(){

    }

    public ListNode2(int val) {
this.val=val;
this.next=null;
    }
    public  ListNode2(int val,ListNode2 next) {
this.val=val;
this.next=null;
    }
}
public class reorder_list {
    static    public void reorderList(ListNode2 head) {
        if(head==null) return;

        Stack<ListNode2> stk=new Stack<>();
        ListNode2 cur=new ListNode2();
        cur=head;
        ListNode2 slow=head;
        ListNode2 fast=head;

        while (fast.next!=null&&fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        slow=slow.next;
   while (slow!=null){
       stk.push(slow);
       slow=slow.next;
   }
   while (stk.isEmpty()==false){
       ListNode2 node=stk.peek();
       node.next=cur.next;
       cur.next=node;
       cur=cur.next.next;
       stk.pop();
   }
   cur.next=null;
   ListNode2 cur2=head;
   while (cur2!=null){
       System.out.println(cur2.val);
       cur2=cur2.next;
   }

    }
    public static void main(String[] args) {
ListNode2 head=new ListNode2(1);
head.next=new ListNode2(2);
head.next.next=new ListNode2(3);
head.next.next.next=new ListNode2(4);
head.next.next.next.next=new ListNode2(5);

head.next.next.next.next.next=null;

reorderList(head);
    }
}
