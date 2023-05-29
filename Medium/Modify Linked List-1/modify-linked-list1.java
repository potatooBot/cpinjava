//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
    }
}
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());

        while (t-- > 0) {
            int n=Integer.parseInt(in.readLine().trim());
            String s[]=in.readLine().trim().split(" ");
            Node head=new Node(Integer.parseInt(s[0]));
            Node copy=head;
            for(int i=1;i<n;i++){
                Node temp=new Node(Integer.parseInt(s[i]));
                copy.next=temp;
                copy=copy.next;
            }
            Solution ob=new Solution();
            Node ans=ob.modifyTheList(head);
            while(ans!=null){
                out.print(ans.data+" ");
                ans=ans.next;
            }out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
        public static Node reverse(Node head ){
        if(head.next==null||head==null){
            return head;
        }
        Node newNode=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newNode;
    }
    public static Node modifyTheList(Node head)
    {
 Node slow=head;
        Node fast=head;
int len=0;
        while (fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
Node cur=head;
while(cur!=null){
    len++;
    cur=cur.next;
}
cur=head;
      if(len%2!=0){
          cur=reverse(slow.next);
          slow.next=cur;
          Node curHead=head;
          while (cur!=null){
              int temp=curHead.data;
    curHead.data=(cur.data-curHead.data);
    cur.data=temp;
    curHead=curHead.next;
              cur=cur.next;
          }
          Node cur2=reverse(slow.next);
      slow.next=cur2;
       cur=head;
      }
      else {
          cur=reverse(slow.next);
          slow.next=cur;
          Node curHead=head;
          while (cur!=null){
              int temp=curHead.data;
              curHead.data=(cur.data-curHead.data);
              cur.data=temp;
              curHead=curHead.next;
              cur=cur.next;
          }
          Node cur2=reverse(slow.next);
          slow.next=cur2;
      }
        return head;
    }
}