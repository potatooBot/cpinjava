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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode cur=head.next;
        int cnt=1;
        int prev=head.val;
        ArrayList<Integer> ds=new ArrayList<>();
        while(cur.next!=null){
            cnt++;
            
            if(cur.val>prev&&cur.val>cur.next.val){
                ds.add(cnt);
            }
                if(cur.val<prev&&cur.val<cur.next.val){
                ds.add(cnt);
            }
            
            prev=cur.val;
            cur=cur.next;
            
        
        }
        Collections.sort(ds);
        int ans[]=new int[2];
        if(cnt<=2||ds.size()<=1){
            ans[0]=-1;
            ans[1]=-1;
            return ans;
        }
        
       /* if(ds.size()<=1){
            return ans;
        }*/
   //    System.out.println(ds);
      //  ans[0]=Math.min(ds.get(1)-ds.get(0),ds.get(ds.size()-1)-ds.get(ds.size()-2));
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<ds.size()-1;i++){
            mini=Math.min(ds.get(i+1)-ds.get(i),mini);
        }
        ans[0]=mini;
        ans[1]=Math.abs(ds.get(0)-ds.get(ds.size()-1));
        
        return ans;
        
    }
}