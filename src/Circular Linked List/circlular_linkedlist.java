public class circlular_linkedlist {
public static class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;

    }
}
public static Node head=null;
public static Node tail=null;

public void insertCircluar(int data){
    Node new_node=new Node(data);
    if (head==null){
        head=tail=new_node;
        new_node.next=head;

    }
    else
    {
        tail.next=new_node;
        tail=new_node;
        tail.next=head;
    }
}

public static void display(){
    Node current=head;
    if (head==null){
        System.out.println("No Linked List available");
    }
    else{
        System.out.println("Circular Linked List elements");

    do{
        //Prints each node by incrementing pointer.
        System.out.print(" "+ current.data);
        current = current.next;
    }while(current != head);

}
}

public static void main(String[] args) {
circlular_linkedlist cll=new circlular_linkedlist();
cll.insertCircluar(5);
cll.insertCircluar(25);
cll.insertCircluar(75);
cll.insertCircluar(125);
cll.insertCircluar(225);
cll.insertCircluar(2000);
cll.display();
}
}
