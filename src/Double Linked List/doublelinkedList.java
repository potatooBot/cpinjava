public class doublelinkedList {
    public static class Node{
        int data;
        Node next;
        Node previous;
   public Node(int data){
       this.data=data;
       this.next=this.previous=null;
   }

    }
    public static Node head=null;
    public static Node tail=null;
    public static void insertNode(int data){
        Node new_node=new Node(data);
        if(head==null){
            head=tail=new_node;
            head.previous=null;
            tail.next=new_node;
        }
        else{
            tail.next=new_node;
            new_node.previous=tail;
            tail=new_node;
            tail.next=null;
        }

    }
    public void display(){
        Node current=head;
        if (current == null) {
            System.out.println("Linked List is Empty");
        }
        System.out.println("Elements are ");
        while (current!=null){
            System.out.println(current.data+" ");
            current=current.next;
        }

    }

    public static void main(String[] args) {
doublelinkedList node=new doublelinkedList();
node.insertNode(1);
node.insertNode(2);
node.insertNode(3);
node.insertNode(4);
node.insertNode(5);
node.insertNode(50);
node.insertNode(500);
node.insertNode(00);
node.insertNode(5500);
node.display();
    }


}
