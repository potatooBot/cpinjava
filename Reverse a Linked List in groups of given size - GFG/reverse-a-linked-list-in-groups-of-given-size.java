//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class ReverseInSize
{
    static Node head;
    
    public static void main (String[] args)throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(in.readLine().trim());
            String s[]=in.readLine().trim().split(" ");
            int a1 = Integer.parseInt(s[0]);
            Node head = new Node(a1);
            Node tail = head;
            for(int i = 1; i < n; i++)
            {
                int a = Integer.parseInt(s[i]);
                // addToTheLast(new Node(a));
                tail.next = new Node(a);
                tail =tail.next;
            }
            
            int k = Integer.parseInt(in.readLine().trim());
            Solution ob = new Solution();
            Node res = ob.reverse(head, k);
            printList(res,out);
            out.println();
        }
        out.close();
    }
    
    public static void printList(Node node,PrintWriter out)
    {
        while(node != null)
        {
            out.print(node.data + " ");
            node = node.next;
        }
    }
    
}


// } Driver Code Ends


/*node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution
{
    public static Node reverse(Node head){
        
        if(head==null||head.next==null) return head;
        Node newHead=reverse(head.next);
        head.next.next=head;
        head.next=null;
        
        return  newHead;
        
        
    }
    public static Node reverse(Node head, int k)
    {
        if(head==null||k==1) return head;
          Node dummy=new Node(0);
dummy.next=head;
          Node cur=head;
          int count=0;
          while (cur!=null){
              count++;
              cur=cur.next;


          }

          Node next=dummy;
          Node prev=dummy;
          cur=dummy;

          while (count>=k){
              cur=prev.next;
              next=cur.next;


              for (int i = 1; i <k ; i++) {
                  cur.next=next.next;
                  next.next=prev.next;
                  prev.next=next;
                  next=cur.next;
              }
              prev=cur;
              count=count-k;
          }
prev.next=reverse(cur.next);
          return dummy.next;
    }
}

