package DSA.LinkedList.segret_odd_even_nodes;

import java.util.ArrayList;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class segret_odd_even_linked_list {
    static    Node divide(int N, Node head){
    Node cur=head;
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        while (cur!=null){
            if(cur.data%2==0){
                even.add(cur.data);
            } else {
                odd.add(cur.data);
            }
            cur=cur.next;
        }

        cur=head;
        for (int i = 0; i <even.size() ; i++) {
            cur.data=even.get(i);
            cur=cur.next;
        }
        for (int i = 0; i <odd.size() ; i++) {
            cur.data = odd.get(i);
            cur = cur.next;
        }
cur=head;

    return cur;
    }
    public static void main(String[] args) {
Node head=new Node(17);
head.next=new Node(15);
head.next.next=new Node(8);
head.next.next.next=new Node(9);
head.next.next.next.next=new Node(2);
head.next.next.next.next.next=new Node(4);
head.next.next.next.next.next.next=new Node(6);
head.next.next.next.next.next.next.next=null;

Node ans=divide(7,head);
Node cur=ans;
   while (cur!=null){
       System.out.println(cur.data);
       cur=cur.next;
   }
    }
}
