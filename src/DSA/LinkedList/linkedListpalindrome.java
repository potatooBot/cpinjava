package CheckingLinkedListPalindrom;

public class linkedListpalindrome{
    static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head=null;
    public static Node tail=null;
    public static void insertNode(int data){
        Node new_node=new Node(data);

     if (head==null){
         head=new_node;
        tail=new_node;
        head.prev=null;
        tail.next=new_node;
     }
     else{

         tail.next=new_node;
         new_node.prev=tail;
         tail=new_node;
         tail.next=null;
     }
    }
    public static void displayinreverse(){
        Node current=tail;
        if (tail==null){
            System.out.println("Linked List empty");
        }
        else {
            while (current!=null){
                System.out.print(current.data+" ");
                current=current.prev;
            }
        }

    }
    
    public boolean checkPlaindrome(){
        Node x=head;
        Node y=tail;
        boolean check=true;
        if (head==null){
            System.out.println("Linked list is empty");
        }
        else
        {
            while (x!=null||y!=null) {

                if (x.data == y.data) {
                    check = true;
                    x=x.next;
                    y=y.prev;
                } else {
                    check = false;
return check;
                }
            }
        }
        return check;
    }
    public static void main(String[] args) {
linkedListpalindrome llp=new linkedListpalindrome();
llp.insertNode(1);
llp.insertNode(5);
llp.insertNode(5);
llp.insertNode(5);
llp.insertNode(1);



if(llp.checkPlaindrome()){
    System.out.println("yes");
}
else {
    System.out.println("No");
}
    }
}
