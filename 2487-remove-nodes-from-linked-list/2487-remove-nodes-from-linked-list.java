/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {
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
}