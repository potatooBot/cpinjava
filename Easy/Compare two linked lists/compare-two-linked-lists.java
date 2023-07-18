//{ Driver Code Starts
import java.util.*;
class Node {
        char data;
        Node next;
 
        // Constructor to create a new node
        Node(char d) 
        {
            data = d;
            next = null;
        }
    }
  class LinkedList_Compare
   {
    Node head;
	
	public void addToTheLast(Node node)
	{
		if (head == null) 
		{
		   head = node;
		} else 
		{
		   Node temp = head;
		   while (temp.next != null)
			temp = temp.next;

		   temp.next = node;
		}
	}
 
	 public static void main(String args[])
    {
       
         
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 
		 while(t>0)
         {
			 LinkedList_Compare llist1 = new LinkedList_Compare();
			 LinkedList_Compare llist2 = new LinkedList_Compare();
			int n1 = sc.nextInt();
			
			int value = 0;
			
					char a1=sc.next().charAt(0);
							Node head1= new Node(a1);
							llist1.addToTheLast(head1);
							
							for (int i = 1; i < n1; i++) 
							{
									char a = sc.next().charAt(0); 
									llist1.addToTheLast(new Node(a));
								 
							}
			    
			
				int n2 = sc.nextInt();
						char b1=sc.next().charAt(0);
						Node head2 = new Node(b1);
						llist2.addToTheLast(head2);
						 
						for (int i = 1; i < n2; i++) 
						{
							//int b;
							
							 char b = sc.next().charAt(0); 
							llist2.addToTheLast(new Node(b));
						}
 
        //int value=0;
        GfG g = new GfG();
        value = g.compare(llist1.head, llist2.head);
        System.out.println(value);
	t--;
    }
    
}}
// } Driver Code Ends


/*  Structure of Node
class Node
 {
    char data;
    Node next;
 
    // Constructor to create a new node
    Node(char d) 
    {
       data = d;
       next = null;
    }
 }*/

class GfG
{
    int compare(Node head1, Node head2)
    {
     Node l1=head1;
     Node l2=head2;
     
     while(l1!=null&&l2!=null){
         //System.out.println(l1.data+" "+l2.data);
      
         if(l1.data>l2.data){
             return 1;
         }
         if(l2.data>l1.data){
           return -1;
         }
l1=l1.next;
l2=l2.next;
     }
        return 0;
    }
}