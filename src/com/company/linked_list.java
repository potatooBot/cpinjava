package com.company;

import java.util.*;

public class linked_list {

    public static void main(String[] args) {
        LinkedList<Integer> ll= new LinkedList<Integer>();
        LinkedList<String> ll2= new LinkedList<String>();
        ll.add(10);
        ll.add(15);
        ll.add(15);
        ll.add(15);
        ll.add(15);
        ll.add(15);
        ll.add(15);
ll2.add("Keshav");
ll2.add("Risita");
ll2.add("Keshav");
ll2.add("Keshav");
ll2.add("Keshav");
        System.out.println("Linked List"+ll);
        System.out.println("Linked List"+ll2);
        System.out.println("Head : "+ll.element());

    }
}
