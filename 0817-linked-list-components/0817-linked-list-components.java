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
    public int numComponents(ListNode head, int[] nums) {
        HashSet<Integer> set=new HashSet<>();
for(int ele:nums){
set.add(ele);
}

ListNode cur=head;

int maxi=0;
while(cur!=null){
int count=0;

while(cur!=null&&set.contains(cur.val)){
    count++;
    cur=cur.next;
}
if(count>0){
maxi++;
}
if(cur==null) break;
cur=cur.next;
}


return maxi;
    }
}