//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
import java.lang.*;

class Node {
    int data;
    Node next;
    Node(int key) {
        data = key;
        next = null;
    }
}

class Partition {
    static Node head;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                // addToTheLast(new Node(a));
                tail.next = new Node(a);
                tail = tail.next;
            }

            int k = sc.nextInt();
            Solution ob = new Solution();
            Node res = ob.partition(head, k);
            printList(res);
            System.out.println();
        }
    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
// } Driver Code Ends


// User function Template for Java

/*class Node
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

class Solution {
    public static Node partition(Node head ,int x) {
               Node dummy=new Node(0);
        Queue<Integer> q=new LinkedList<>();

        Node cur=head;
        Node temp=dummy;
        int count=0;
        while (cur!=null) {
            if (cur.data < x) {
                Node node = new Node(cur.data);
                temp .next= node;
                temp=temp.next;
            }
            else if(cur.data==x){
                count++;
            }
            else if(cur.data>x){
                q.add(cur.data);
            }
            cur=cur.next;
        }

if(count>0) {
    for (int i = 0; i <count; i++) {


        Node node = new Node(x);
        temp.next = node;
        temp = temp.next;
    }
}
        while (q.isEmpty()==false){
//            System.out.println(q.peek());
         int data=q.peek();
         q.remove();
         Node node=new Node(data);
            temp.next=node;
            temp=temp.next;
        }
     return dummy.next;
    }
}