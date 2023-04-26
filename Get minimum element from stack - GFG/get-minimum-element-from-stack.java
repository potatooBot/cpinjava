//{ Driver Code Starts
import java.util.*;



class Get_Min_From_Stack
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int q = sc.nextInt();
			GfG g = new GfG();
			while(q>0)
			{
				int qt = sc.nextInt();
				
				if(qt == 1)
				{
					int att = sc.nextInt();
					g.push(att);
					//System.out.println(att);
				}
				else if(qt == 2)
				{
					System.out.print(g.pop()+" ");
				}
				else if(qt == 3)
				{
					System.out.print(g.getMin()+" ");
				}
			
			q--;
			}
			System.out.println();
		T--;
		}
		
	}
}



// } Driver Code Ends

class pair{
    int val;
    int min;
    pair(int val,int min){
        this.val=val;
        this.min=min;
    }
}
class GfG
{

    Stack<pair> stk=new Stack<pair> ();

    /*returns min element from stack*/
    int getMin()
    {
        if(stk.isEmpty()) return -1;
	return stk.peek().min;
    }
    
    /*returns poped element from stack*/
    int pop()
    {
        if(stk.isEmpty()) return -1;
int val=stk.peek().val;
stk.pop();
    return val;
    }

    /*push element x into the stack*/
    void push(int val)
    {
  int min=Integer.MAX_VALUE;
if(stk.isEmpty()==true) {
min=val;
}
else {
    min=Math.min(val,stk.peek().min);
}
stk.push(new pair(val,min));
    }	
}

