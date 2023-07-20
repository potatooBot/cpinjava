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
    public ListNode mergeKLists(ListNode[] lists) {


int k=lists.length;
if(k==0) return null; 
System.out.println(k);
ListNode l1=lists[0];
ListNode resultHead=l1;
for(int i=1;i<k;i++){

ListNode l2=lists[i];

         if(l1==null&&l2!=null) {
l1=l2;
resultHead=l1;
           continue;
         }
        
     if(l2==null)  continue;
        
        
        if(l1.val>l2.val){
            ListNode temp=l1;
            l1=l2;
            l2=temp;
        }
        
   resultHead=l1;
        
        while(l1!=null&&l2!=null){
            ListNode tmpRemember=null;
            while(l1!=null&&l1.val<=l2.val){
                tmpRemember=l1;
                l1=l1.next;
            }
            
           tmpRemember.next=l2;
            
     ListNode temp=l1;
            l1=l2;
            l2=temp;
            
        }
l1=resultHead;
    }
     return resultHead;
    }
   
}