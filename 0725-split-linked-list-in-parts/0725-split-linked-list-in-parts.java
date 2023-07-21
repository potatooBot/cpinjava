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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int length=0;
        ListNode cur=head;

while(cur!=null){
length++;
cur=cur.next;
}
ListNode ans[]=new ListNode[k];

int part=length/k;
cur=head;
int extraNodes=length%k;
ListNode prev=null;
int i=0;
while(head!=null){
int eachPart=part;
ans[i++]=cur;

while(eachPart>0){
prev=cur;
cur=cur.next;
eachPart--;
}

if(extraNodes!=0&&cur!=null){
    prev=cur;
    cur=cur.next;
    extraNodes--;
}
if(prev!=null){
    head=cur;
    prev.next=null;
}
}

while(ans.length!=k){
ans[i++]=null;
}


return ans;
    }
}