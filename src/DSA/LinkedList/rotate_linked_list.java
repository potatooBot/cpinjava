package DSA.LinkedList;

public class rotate_linked_list {
    class node {
        int data;
        node next;
        public node(int data){
            this.data=data;
        }
    }
    node head;
    public  void append(int data){
        if(head==null){
            head=new node(data);
        }
        else {
            node curr=head;
            while (curr.next!=null){
                curr=curr.next;
            }
            curr.next=new node(data);
        }
    }
    public void prepend(int data){
        node new_node=new node(data);
        new_node.next=head;
        head=new_node;
    }
    public void print_ll(){
       node cur=head;
        while (cur!=null){
            System.out.println(cur.data);
            cur=cur.next;
        }
    }
    public void rotate(int k){
        node curr=head;
        int length=0;
        while (curr.next!=null){
            curr=curr.next;
            length++;
        }
        length++;
        curr.next=head;
        k=k%length;
        k=length-k;
        while (k!=0){
            curr=curr.next;
            k--;
        }
        head=curr.next;
        curr.next=null;
    }
    public static void main(String[] args) {
        rotate_linked_list list1=new rotate_linked_list();
        list1.append(1);
        list1.append(2);
        list1.append(3);
        list1.append(4);
        list1.append(5);

//        list1.print_ll();
        list1.rotate(2);
        list1.print_ll();
    }
}
