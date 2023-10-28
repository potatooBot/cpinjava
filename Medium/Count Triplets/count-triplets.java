//{ Driver Code Starts
import java.util.*;
class Node{
    int data;
    Node next;
    
    Node(int a){
        data = a;
        next = null;
    }
    
}

class LinkedList{
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            Node head=null;
            for(int i=0;i<n;i++)
            {int a=sc.nextInt();
            if(head==null){
                head=new Node(a);
            }
            else
                insert(head,a);
            }
        
            Solve y = new Solve();
            System.out.println(y.countTriplets(head,x));
        }
    }
    public static Node insert(Node head,int a){
        if(head==null){
            return new Node(a);
        }
        head.next=insert(head.next,a);
        return head;
    }
    
}


// } Driver Code Ends


//User function Template for Java

class Solve
{
    static int countTriplets(Node head, int x) 
    { 
        ArrayList<Integer>ds=new ArrayList<>();
       Node cur=head;
       while(cur!=null){
           ds.add(cur.data);
           cur=cur.next;
       }
       
       int n=ds.size();
       if(ds==null||ds.size()<3) return 0;
       Collections.sort(ds);
       
       int cnt=0;
       for(int i=0;i<n-2;i++){
           int low=i+1;
           int high=ds.size()-1;
           
           
           while(low<high){
               if(ds.get(i)+ds.get(low)>x){
                   break;
               }
               
               if(ds.get(i)+ds.get(low)+ds.get(high)<x){
                   low++;
               }
               else if(ds.get(i)+ds.get(low)+ds.get(high)>x){
                   high--;
               }
               
               else{
                 cnt++;
                 low++;
                 high--;
               }
           }
       }
       
       return cnt;
    } 
}