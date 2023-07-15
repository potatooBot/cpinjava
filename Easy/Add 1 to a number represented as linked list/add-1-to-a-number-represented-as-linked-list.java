//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}
class GfG
{
    public static void printList(Node node) 
    { 
        while (node != null)
        { 
            System.out.print(node.data);
            node = node.next; 
        }  
        System.out.println();
    } 
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Node head = new Node( s.charAt(0) - '0' );
                    Node tail = head;
                    for(int i=1; i<s.length(); i++)
                    {
                        tail.next = new Node( s.charAt(i) - '0' );
                        tail = tail.next;
                    }
                    Solution obj = new Solution();
                    head = obj.addOne(head);
                    printList(head); 
                }
        }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
*/

class Solution
{
    public static Node reverse(Node head){
        if(head==null||head.next==null) return head;
        Node newhead=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;
    }
    public static Node addOne(Node head) 
    { 
       if(head==null) return head;
       Node cur=reverse(head);
    //   Node cur2=cur;
    //   while(cur2!=null){
    //       System.out.print(cur2.data);
    //       cur2=cur2.next;
    //   }
       
     
       int carry=0;
  Node val=new Node(1);
  Node dummy=new Node(0);
  
  Node dhead=dummy;
  while(cur!=null||val!=null||carry==1){
        int sum=0;
      if(cur!=null){
          sum=sum+cur.data;
          cur=cur.next;
      }
      if(val!=null){
          sum=sum+val.data;
          val=val.next;
      }
      sum=sum+carry;
        // System.out.println(sum);
      Node temp=new Node(sum%10);
      carry=sum/10;
      dhead.next=temp;
      dhead=dhead.next;
  }
//   Node cur2=dummy.next;
//             while(cur2!=null){
//           System.out.print(cur2.data);
//           cur2=cur2.next;
//       }
     Node ans=reverse(dummy.next);
     return ans; 
    }
}
