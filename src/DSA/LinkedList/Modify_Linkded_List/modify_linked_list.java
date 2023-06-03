package DSA.LinkedList.Modify_Linkded_List;
class Node {
    int data;
    Node next=null;
    public Node(int data){
        this.data=data;
    }
}
public class modify_linked_list {
    public static Node reverse(Node head ){
        if(head.next==null||head==null){
            return head;
        }
        Node newNode=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newNode;
    }
     public static Node modifyTheList(Node head)
    {
        Node slow=head;
        Node fast=head;
int len=0;
        while (fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
Node cur=head;
while(cur!=null){
    len++;
    cur=cur.next;
}
cur=head;
      if(len%2!=0){
          cur=reverse(slow.next);
          slow.next=cur;
          Node curHead=head;
          while (cur!=null){
              int temp=curHead.data;
    curHead.data=(cur.data-curHead.data);
    cur.data=temp;
    curHead=curHead.next;
              cur=cur.next;
          }
          Node cur2=reverse(slow.next);
      slow.next=cur2;
       cur=head;
      while (cur!=null){
          System.out.println(cur.data);
          cur=cur.next;
      }
      }
      else {
          cur=reverse(slow.next);
          slow.next=cur;
          Node curHead=head;
          while (cur!=null){
              int temp=curHead.data;
              curHead.data=(cur.data-curHead.data);
              cur.data=temp;
              curHead=curHead.next;
              cur=cur.next;
          }
          Node cur2=reverse(slow.next);
          slow.next=cur2;
      }
        return cur;
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(4);
        head.next.next=new Node(5);
        head.next.next.next=new Node(3);
        head.next.next.next.next=new Node(6);
//        head.next.next.next.next.next=new Node(10);
//        Node head=new Node(2);
//        head.next=new Node(9);
//        head.next.next=new Node(8);
//        head.next.next.next=new Node(12);
//        head.next.next.next.next=new Node(7);
//        head.next.next.next.next.next=new Node(10);

    modifyTheList(head);
     }
}
