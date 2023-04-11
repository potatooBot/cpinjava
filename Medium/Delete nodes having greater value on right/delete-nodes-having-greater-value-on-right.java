//{ Driver Code Starts
import java.util.*;

class Node
{

    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}


public class LinkedList
{
    
 

    /* Function to print linked list */
   public static void print(Node root)
    {
        Node temp = root;
        while(temp!=null)
        {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }


    /* Driver program to test above functions */
    public static void main(String args[])
    {

        /* Constructed Linked List is 1.2.3.4.5.6.
         7.8.8.9.null */
        int value;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0 && sc.hasNextInt() )
        {
            int n = sc.nextInt();
            
            //int n=Integer.parseInt(br.readLine());
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;

            for (int i = 1; i < n && sc.hasNextInt() ; i++)
            {
                int a = sc.nextInt();
                tail.next = new Node(a);
                tail = tail.next;
            }


            Node result = new Solution().compute(head);
            print(result);
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends


/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution
{
    Node compute(Node head)
    {
          Node dummy
                = new Node(0);

Node cur=head;
        ArrayList<Integer> list=new ArrayList<>();
        while (cur!=null){
            list.add(cur.data);
            cur=cur.next;
        }
int maxi=Integer.MIN_VALUE;
        for (int i = list.size()-1; i >=0 ; i--) {
            maxi=Math.max(maxi,list.get(i));
        if(maxi>list.get(i)){
            list.remove(i);
        }
        }
Node cur2=dummy;
        for (int i = 0; i <list.size() ; i++) {
            Node temp=new Node(list.get(i));
            cur2.next=temp;
            cur2=cur2.next;
        }



        return dummy.next;
    }
}
  