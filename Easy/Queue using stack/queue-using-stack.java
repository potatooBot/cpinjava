//{ Driver Code Starts
import java.util.*;


class Solution
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			Queue g = new Queue();
			
			int q = sc.nextInt();
			while(q>0)
			{
				int QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					g.enqueue(a);
				}
				else if(QueryType == 2)
				System.out.print(g.dequeue()+" ");
			q--;
			}	
			System.out.println();
				
			
			
		t--;
		}
	}
}


// } Driver Code Ends


class Queue
{
    Stack<Integer> stk1 = new Stack<Integer>(); 
    Stack<Integer> stk2 = new Stack<Integer>(); 
    
    /*The method pop which return the element poped out of the stack*/
    int dequeue()
    {
        if(stk1.isEmpty()==true){
            return -1;
        }
        
        if(stk2.size()!=0){
            return stk2.pop();
        }
        while(!stk1.isEmpty()){
            stk2.add(stk1.pop());
        }
        
        return stk2.pop();
        
	    // Your code here
    }
	
    /* The method push to push element into the stack */
    void enqueue(int x)
    {
        
        stk1.add(x);
	    // Your code here	
    }
}

