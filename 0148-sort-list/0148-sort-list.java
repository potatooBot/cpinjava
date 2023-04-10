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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> list=new ArrayList<>();
        ListNode cur=head;
        
        
        while(cur!=null){
            list.add(cur.val);
            cur=cur.next;
        }
        
        Collections.sort(list);
        System.out.println(list);
        ListNode dummy=new ListNode(0);
        ListNode cur2=dummy;
        for(int i=0;i<list.size();i++){
            
            ListNode temp=new ListNode(list.get(i));
        cur2.next=temp;
            cur2=cur2.next;
            
        }
        
        return dummy.next;
    }
}