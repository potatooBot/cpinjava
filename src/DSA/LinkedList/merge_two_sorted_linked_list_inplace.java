package DSA.LinkedList;

import java.io.IOException;
import java.util.Scanner;

public class merge_two_sorted_linked_list_inplace {
    /* Link list node */
    static class Node {
        public int data;
        public Node next;

        public Node(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }
    Node sortedMerge(Node l1, Node l2) {
//     Always remember l1 will be of small node


     //If l1 is null l2 will be answer
        if(l1==null) return l2;
        //If l1 is null l2 will be answer
        if(l2==null) return l1;


//        if l2 becomes smaller and l1 bigger then swap l1 and l2

        if(l1.data>l2.data){
            Node temp=l1;
            l1=l2;
            l2=temp;
        }
//Storing the head as result
        Node resHead=l1;


        while(l1!=null &&l2!=null){

//            For changing position of l1
            Node temptoremember=null;
            while(l1!=null&&l1.data<=l2.data){
                temptoremember=l1;
                l1=l1.next;
            }


            //If again some place l2 to be found smaller then swap l1 and l2

            temptoremember.next=l2;


            Node temp=l1;
            l1=l2;
            l2=temp;
        }

        return resHead;
    }
    static class LinkedList {
        public reverseLinkedList.Node head;

        public LinkedList() {
            this.head = null;
        }

        public void insertNode(int nodeData) {
            reverseLinkedList.Node node = new reverseLinkedList.Node(nodeData);

            if (this.head != null) {
                node.next = head;
            }
            this.head = node;
        }
    }

    /* Function to print linked list */
    public static void printSinglyLinkedList(reverseLinkedList.Node node,
                                             String sep) throws IOException {
        while (node != null) {
            System.out.print(String.valueOf(node.data) + sep);
            node = node.next;
        }
    }

    // Complete the reverse function below.

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        reverseLinkedList.LinkedList llist = new reverseLinkedList.LinkedList();

        llist.insertNode(20);
        llist.insertNode(4);
        llist.insertNode(15);
        llist.insertNode(85);

        System.out.println("Given linked list:");
        printSinglyLinkedList(llist.head, " ");

        System.out.println();
        System.out.println("Reversed Linked list:");



        scanner.close();
    }
}
