//{ Driver Code Starts
import java.util.*;

class LNode
{
    int data;
    LNode next;
    LNode(int d) {
        data = d; 
        next = null;
    }
}

class TNode
{
    int data;
    TNode left, right;
    TNode(int x)
    {
        data=x;
        left=right=null;
    }
    
}


class ListToBST
{
    
  /* Function to print linked list */
   public static void preOrder(TNode root)
    {
        
        if(root==null)
            return;
            
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
	
	 
 
     /* Driver program to test above functions */
    public static void main(String args[])
    {
       
         
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 
		 while(t>0)
         {
			int n = sc.nextInt();
			LNode head = new LNode(sc.nextInt());
            LNode tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new LNode(sc.nextInt());
                tail = tail.next;
            }
		
			Solution obj = new Solution();
			TNode root = obj.sortedListToBST(head);
			preOrder(root);
			
			System.out.println();
			
			t--;
			
         }
    }
}

// } Driver Code Ends


//User function Template for Java

/*Linked List Node
class LNode
{
    int data;
    LNode next;
    LNode(int d) {
        data = d; 
        next = null;
    }
}

//Tree Node
class TNode
{
    int data;
    TNode left, right;
    TNode(int x)
    {
        data=x;
        left=right=null;
    }
    
}*/

class Solution
{
      static TNode sortedToBst(ArrayList<Integer> arrayList,int start,int end){
        if(start>end){
            return null;
        }
         int mid=(start+end)/2;
        if((start+end)%2!=0){
            mid=mid+1;
        }
       
        TNode root=new TNode(arrayList.get(mid));
        root.left=sortedToBst(arrayList,start,mid-1);
        root.right=sortedToBst(arrayList,mid+1,end);
        return root;
    }
    static  public TNode sortedListToBST(LNode head)
    {
TNode cur2=null;
LNode cur=head;
        ArrayList<Integer> arrList=new ArrayList<>();
while (cur!=null){
    arrList.add(cur.data);
    cur=cur.next;
}
TNode ans=sortedToBst(arrList,0,arrList.size()-1);

return ans;
        //code here
    }
}