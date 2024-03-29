package DSA.LinkedList;

import DSA.LinkedList.ListNode;

public class add_two_numbers {
    static    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
ListNode dummy=new ListNode(0);
int carry=0;
ListNode temp=dummy;
while (l1!=null||l2!=null||carry==1){
    int sum=0;
    if(l1!=null){
        sum=sum+ l1.val;
        l1=l1.next;
    }
    if(l2!=null){
        sum=sum+ l2.val;
        l2=l2.next;
    }
    sum=sum+carry;
    carry=sum/10;
    ListNode node=new ListNode(sum%10);
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
        ListNode head=new ListNode(5);
        head.next=new ListNode(4);
//head.next.next=new ListNode(3);

ListNode head2=new ListNode(5);
        head2.next=new ListNode(4);
head2.next.next=new ListNode(3);
ListNode ans=addTwoNumbers(head,head2);

printLinkedListSummation(ans);
    }
}
