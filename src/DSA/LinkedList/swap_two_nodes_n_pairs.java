package DSA.LinkedList;

public class swap_two_nodes_n_pairs {
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
    public  node swap(node head){
        if(head==null||head.next==null) return head;

        node curr=head;
        if(curr.next!=null||curr==null){
            node temp=curr;
            curr=curr.next;
            curr.next=temp;
            temp.next=null;
        }

curr.next=null;
curr=curr.next;
return curr;
    }

    public void print_ll(){
       node cur=head;
        while (cur!=null){
            System.out.println(cur.data);
            cur=cur.next;
        }
    }
    public static void main(String[] args) {
        swap_two_nodes_n_pairs ll=new swap_two_nodes_n_pairs();
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.swap(ll.head);
        ll.print_ll();
    }
}
