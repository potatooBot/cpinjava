package DSA.LinkedList;

public class implement_linked_list {
    class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    node head;
    public void append(int data){
        if(head==null){
            head=new node(data);
            return;
        }
        node curr=head;
        while (curr.next!=null){
            curr=curr.next;
        }
        curr.next=new node(data);
    }

    public void print_ll(){
        node cur=head;
        while (cur!=null){
            System.out.println(cur.data);
            cur=cur.next;
        }
    }
    public void prepend(int data){
        node newhead=new node(data);
        newhead.next=head;
        head=newhead;
    }

    public  void addElementatIndex(int data,int idx)
    {
        if(head==null) head=new node(data);
        node cur=head;
        for (int i = 1; i <idx ; i++) {
         cur=cur.next;
        }
        node new_node=new node(data);
        new_node.next=cur.next;
        cur.next=new_node;
    }
    public void deleteFirst(){
        if(head==null) return;
        head=head.next;
    }
    public void deleteLast(){
        if(head==null) return;
        node cur=head;
        while (cur.next.next!=null){
            cur=cur.next;
        }
        cur.next=null;
    }
    public void deleteParticularEle(int data){
        if(head==null) return;
        node cur=head;
        node prev=head;
        while (cur!=null){
            if(cur.data==data){
                prev.next=cur.next;
            }
            prev=cur;

            cur=cur.next;
        }
    }


    public static void main(String[] args) {
      implement_linked_list ll=new implement_linked_list();
    ll.append(1);
    ll.append(2);
    ll.append(3);
    ll.append(4);
ll.append(5);
ll.append(6);
ll.append(7);
ll.append(8);
ll.append(9);
ll.append(10);
//    ll.print_ll();
//    ll.deleteFirst();
//        System.out.println("Calling it Second time");
//        ll.print_ll();
//        ll.deleteLast();
//        ll.deleteLast();
//        ll.deleteLast();
        ll.addElementatIndex(566,2);
        ll.deleteParticularEle(7);
        System.out.println("Calling it Second time after calling delete last");
        ll.print_ll();
    }
}
