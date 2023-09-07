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
    public static void reverse(ArrayList <Integer> list,int left,int right){
        while(left<=right){
            int temp=list.get(left);
            list.set(left,list.get(right));
            list.set(right,temp);
            left++;
            right--;
        }
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
       ArrayList <Integer> list= new ArrayList<>();
       ListNode cur=head;
       while(cur!=null){
           list.add(cur.val);
           cur=cur.next;
       } 
ListNode dummy=new ListNode(0);
ListNode temp=dummy;
reverse(list,left-1,right-1);
 for(int i=0;i<list.size();i++){
     temp.next=new ListNode (list.get(i));
     temp=temp.next;
 }
       return dummy.next;
    }
}