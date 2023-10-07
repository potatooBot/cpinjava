//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
class Zeroes{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Node head=null;
            Node curr=null;
            while(n-->0){
                int a=sc.nextInt();
                if(head==null){
                    head=new Node(a);
                    curr=head;
                }
                else{
                    Node temp=new Node(a);
                    temp.next=null;
                    curr.next=temp;
                    curr=temp;
                }
            }
            GfG g=new GfG();
            head = g.moveZeroes(head);
            while(head!=null){
                System.out.print(head.data+" ");
                head=head.next;
            }
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

/*
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
*/

class GfG{
    public Node moveZeroes(Node head){
      Node cur=head;
      int cnt=0;
      while(cur!=null){
          if(cur.data==0) cnt++;
          cur=cur.next;
      }
      Node dummy=new Node(0);
      dummy.next=head;
      cur=dummy;
for(int i=0;i<cnt;i++){
    Node temp=new Node(0);
    cur.next=temp;
    cur=cur.next;
}   
Node cur2=head;
while(cur2!=null){
    if(cur2.data!=0){
        Node temp=new Node(cur2.data);
        cur.next=temp;
        cur=cur.next;
    }
    cur2=cur2.next;
}


        return dummy.next;
    }
}