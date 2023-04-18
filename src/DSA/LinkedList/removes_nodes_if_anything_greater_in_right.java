package DSA.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class removes_nodes_if_anything_greater_in_right {
    static    public ListNode removeNodes(ListNode head) {
        ListNode dummy
                = new ListNode(0);

ListNode cur=head;
        ArrayList<Integer> list=new ArrayList<>();
        while (cur!=null){
            list.add(cur.val);
            cur=cur.next;
        }
int maxi=Integer.MIN_VALUE;
        for (int i = list.size()-1; i >=0 ; i--) {
            maxi=Math.max(maxi,list.get(i));
        if(maxi>list.get(i)){
            list.remove(i);
        }
        }
ListNode cur2=dummy;
        for (int i = 0; i <list.size() ; i++) {
            ListNode temp=new ListNode(list.get(i));
            cur2.next=temp;
            cur2=cur2.next;
        }



        return dummy.next;
    }

    public static void main(String[] args) {
ListNode head=new ListNode(5);
head.next=new ListNode(2);
head.next.next=new ListNode(13);
head.next.next=new ListNode(13);
head.next.next.next=new ListNode(3);
head.next.next.next.next=new ListNode(8);
head.next.next.next.next.next=null;
ListNode cur=head;
removeNodes(head);
    }
}
