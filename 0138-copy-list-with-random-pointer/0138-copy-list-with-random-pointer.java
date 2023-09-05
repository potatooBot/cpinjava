/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/



//Tc- O(N)
//SC- O(1)


class Solution {
    public Node copyRandomList(Node head) {
         // First round: make copy of each node,
          // and link them together side-by-side in a single list.
        Node  iter=head;
        Node front=head;
        while(iter!=null){
front=iter.next;
Node copy=new Node(iter.val);
iter.next=copy;
copy.next=front;
iter=front;
        }
        
          // Second round: assign random pointers for the copy nodes.
        iter=head;
while(iter!=null){
       if(iter.random!=null){
            iter.next.random=iter.random.next;
        }
        iter=iter.next.next;
        }
         // Third round: restore the original list, and extract the copy list.
iter=head;
Node psuedoHead=new Node(0);
Node copy=psuedoHead;
while(iter!=null)
{
front=iter.next.next;
// extract the copy
copy.next=iter.next;
copy=copy.next;

  // restore the original list
iter.next=front;
iter=front;
}
return  psuedoHead.next;
    }
}