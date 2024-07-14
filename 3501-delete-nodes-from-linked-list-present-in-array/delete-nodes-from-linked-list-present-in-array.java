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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet();
	for(int num : nums) set.add(num);

	ListNode dummy = new ListNode(-1);
	ListNode temp = dummy;
    ListNode cur=head;
	while(cur != null) {
		if(!set.contains(cur.val)) {
			temp.next = cur;
			temp = temp.next;
		}
		cur = cur.next;
	}
	temp.next = null;
	return dummy.next;
    }
}