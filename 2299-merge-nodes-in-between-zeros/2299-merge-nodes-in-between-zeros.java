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
    public ListNode mergeNodes(ListNode head) {
       ArrayList<Integer> ds=new ArrayList<>();
       ListNode cur=head;
      cur=cur.next;
       int sum=0;
       while(cur.next!=null){
         sum=sum+cur.val;
         
         cur=cur.next;
         
         if(cur.val==0){
         ds.add(sum);
         sum=0;  
         }

       }
ListNode dummy=new ListNode(0);
 cur=dummy;
for(int ele:ds){
    ListNode temp=new ListNode(ele);
    cur.next=temp;
    cur=cur.next;
}

return dummy.next;
    }
}