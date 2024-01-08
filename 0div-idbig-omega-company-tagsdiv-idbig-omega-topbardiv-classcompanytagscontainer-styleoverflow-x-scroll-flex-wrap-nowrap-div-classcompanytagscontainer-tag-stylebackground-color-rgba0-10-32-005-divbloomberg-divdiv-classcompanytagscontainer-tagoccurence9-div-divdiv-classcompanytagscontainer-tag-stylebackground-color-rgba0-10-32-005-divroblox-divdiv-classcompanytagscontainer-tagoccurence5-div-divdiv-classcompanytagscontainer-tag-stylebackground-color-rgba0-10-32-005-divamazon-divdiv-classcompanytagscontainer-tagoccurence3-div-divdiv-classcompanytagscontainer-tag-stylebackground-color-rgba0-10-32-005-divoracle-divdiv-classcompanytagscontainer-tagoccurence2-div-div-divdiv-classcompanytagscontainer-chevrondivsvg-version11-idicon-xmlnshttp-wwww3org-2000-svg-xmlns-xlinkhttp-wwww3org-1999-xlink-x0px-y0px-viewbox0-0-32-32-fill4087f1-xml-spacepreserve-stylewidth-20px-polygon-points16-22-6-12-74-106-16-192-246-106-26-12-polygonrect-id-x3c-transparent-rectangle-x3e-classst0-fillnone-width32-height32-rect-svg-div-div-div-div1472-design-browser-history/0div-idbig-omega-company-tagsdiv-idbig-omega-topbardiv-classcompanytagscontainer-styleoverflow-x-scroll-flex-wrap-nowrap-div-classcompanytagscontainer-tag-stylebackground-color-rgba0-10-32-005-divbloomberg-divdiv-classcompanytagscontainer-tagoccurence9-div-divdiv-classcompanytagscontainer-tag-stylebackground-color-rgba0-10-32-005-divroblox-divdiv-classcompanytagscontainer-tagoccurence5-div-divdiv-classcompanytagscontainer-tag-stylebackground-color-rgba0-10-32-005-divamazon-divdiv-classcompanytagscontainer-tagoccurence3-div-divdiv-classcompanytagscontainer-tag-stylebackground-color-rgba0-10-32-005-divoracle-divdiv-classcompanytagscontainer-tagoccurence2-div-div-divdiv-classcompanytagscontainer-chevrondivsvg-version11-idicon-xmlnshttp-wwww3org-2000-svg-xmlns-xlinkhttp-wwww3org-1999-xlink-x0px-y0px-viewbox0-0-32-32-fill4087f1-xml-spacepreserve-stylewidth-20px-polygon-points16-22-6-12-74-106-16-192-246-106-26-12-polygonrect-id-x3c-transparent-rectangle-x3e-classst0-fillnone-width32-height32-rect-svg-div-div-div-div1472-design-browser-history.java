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

    public BrowserHistory(String homepage) {
        Node newNode=new Node(homepage);
    head=newNode;
    upd=head;
    
    }
    
    public void visit(String url) {
    
       Node newNode=new Node(url);
   upd.next=newNode;
   newNode.prev=upd;
   upd=newNode;
    }
    
    public String back(int steps) {
        
        int cnt=0;
while(upd.prev!=null&&steps!=cnt){
    cnt++;
    upd=upd.prev;
}
return upd.data;

    }
    
    public String forward(int steps) {
         
        int cnt=0;
while(upd.next!=null&&steps!=cnt){
    cnt++;
    upd=upd.next;
}
return upd.data;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */