import java.util.*;

import static java.util.Collections.*;

public class linked_list {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null;
    public static Node tail = null;

    public void insertLinkedList(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            tail = new_node;

        } else {
            tail.next = new_node;
            tail = new_node;
        }
    }

    public static void display() {
        Node current = head;
        if (current == null) {
            System.out.println("Linked List Empty");
            return;
        } else {
            System.out.print("Elements are :");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }

        }
    }

    public boolean isPalindrome() {

        Node current = head;
        Stack<Integer> stk = new Stack<>();
        boolean check = true;
        while (current != null) {
            stk.push(current.data);
            current = current.next;
        }
        while (head != null) {
            int i = stk.pop();
            if (head.data == i) {
                check = true;
            } else {
                check = false;
                break;
            }
            head = head.next;
        }
        return check;

    }

    public void reverseList() {
        Stack<Integer> stk2 = new Stack<>();
        LinkedList <Integer> ll=new LinkedList<>();
        Node current=head;
        while (current!=null){
            stk2.push(current.data);
            current=current.next;
        }
        while (head!=null){
            int i=stk2.pop();
            ll.add(i);
            head=head.next;
        }
        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " ");
        }

    }

    public static void main(String[] args) {
        linked_list nodeAdd = new linked_list();
        nodeAdd.insertLinkedList(1);
        nodeAdd.insertLinkedList(2);
        nodeAdd.insertLinkedList(3);
        nodeAdd.insertLinkedList(4);
        nodeAdd.insertLinkedList(5);


//nodeAdd.display();
//boolean test=nodeAdd.isPalindrome();
//        System.out.println(test);
//    }
        nodeAdd.reverseList();
    }
}
