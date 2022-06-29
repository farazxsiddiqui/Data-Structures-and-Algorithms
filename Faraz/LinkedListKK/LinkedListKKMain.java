package com.Faraz.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedListK list = new LinkedListK();
        list.insertFirst(1);
        list.display();
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.display();
        list.insertAtIndex(2,99);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.deleteAtIndex(2));
        list.display();
        System.out.println(list.findVal(2));
    }
}
