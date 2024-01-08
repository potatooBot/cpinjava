//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    
    BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
    String homepage=bu.readLine();
    BrowserHistory obj=new BrowserHistory(homepage);
    int total_queries=Integer.parseInt(bu.readLine());
    while(total_queries-->0)
     {
         String s[]=bu.readLine().split(" ");
         int query=Integer.parseInt(s[0]);
          if(query == 1) {
            String url=s[1];
            obj.visit(url);
        }
        else if(query == 2) {
            int steps=Integer.parseInt(s[1]);
            System.out.println(obj.back(steps));
        }
        else {
            int steps=Integer.parseInt(s[1]);
            System.out.println(obj.forward(steps));
        }
     }
  }
}
// } Driver Code Ends


//User function Template for Java
class Node {
    Node next;
    Node prev;
    String data;
    public Node(String data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }

}
class BrowserHistory {
    Node head;
Node upd;
     // constructor to initialize object with homepage
    BrowserHistory(String homepage) {
          Node newNode=new Node(homepage);
    head=newNode;
    upd=head;
    }
    
    // visit current url
    void visit(String url) {
         Node newNode=new Node(url);
   upd.next=newNode;
   newNode.prev=upd;
   upd=newNode;
    }
    
    // 'steps' move backward in history and return current page
    String back(int steps) {
        int cnt=0;
while(upd.prev!=null&&steps!=cnt){
    cnt++;
    upd=upd.prev;
}
return upd.data;
    }
    
    // 'steps' move forward and return current page
    String forward(int steps) {
          
        int cnt=0;
while(upd.next!=null&&steps!=cnt){
    cnt++;
    upd=upd.next;
}
return upd.data;
    }
}