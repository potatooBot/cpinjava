/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode cur=head;
Set<ListNode> set=new HashSet<>();
while(cur!=null){
    set.add(cur);
    if(set.contains(cur.next)){
        return true;
    }
    cur=cur.next;
}
return false;
    }
}