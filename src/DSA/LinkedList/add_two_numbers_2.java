package DSA.LinkedList;

public class add_two_numbers_2 {
    public static ListNode reverse(ListNode head){
        ListNode newHead = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
    static    public ListNode addTwoNumbers(ListNode first, ListNode second) {
        ListNode l1=reverse(first);
        ListNode l2=reverse(second);
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
        ListNode ans=reverse(dummy.next);
        return ans;
    }
    public static void printLinkedListSummation(ListNode head){
        ListNode cur=head;
        while (cur!=null){
            System.out.print(cur.val);
            cur=cur.next;
        }
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(4);
        head.next=new ListNode(5);
//head.next.next=new ListNode(4);
//head.next.next.next=new ListNode(3);

        ListNode head2=new ListNode(3);
        head2.next=new ListNode(4);
        head2.next.next=new ListNode(5);
        ListNode ans=addTwoNumbers(head,head2);

        printLinkedListSummation(ans);
    }
}
