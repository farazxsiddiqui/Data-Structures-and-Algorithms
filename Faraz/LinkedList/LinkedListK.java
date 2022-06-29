package com.Faraz.LinkedList;

public class LinkedListK {
    private Node head;
    private Node tail;
    private int size;

    public LinkedListK() {
        this.size = 0;
    }

    public void insertFirst(int val){
        //Creating a new node
        Node newNode = new Node(val);
        //Pointing the next of the new node to head, now the next of the new node is head.
        newNode.next=head;
        //Reassigning head to the new Node
        head=newNode;
        //If this is the first node, tail would be null initially, but now it should be the same as head
        //Tail always points to the last element, if it exists.
        if(tail==null){
            tail=head;
        }
        //Increasing the size
        size++;
    }

    public void insertLast(int val){
        //If this is the first node we can call the insertFirst function and return from this one.
        if(head==null){
            insertFirst(val);
            return;
        }
        //Creating a new node
        Node newNode = new Node(val);
        //Tail always points to the last node and the next of tail points to null.
        //Pointing the next of tail to the new node
        tail.next = newNode;
        //Reassigning tail to the last node that is the newly created node.
        tail=newNode;
        //Increasing the size
        size++;
    }

    public void insertAtIndex(int index, int val){
        if(head==null){
            return;
        }
        //If index is unreachable, return
        if(index>size-1 || index<0){
            return;
        }
        //If index is equal to 0, calling the insertFirst function and return from this one.
        if(index==0){
            insertFirst(val);
            return;
        }
        //If index is equal to the last index, calling the insertLast function and return from this one.
        if(index==size-1){
            insertLast(val);
            return;
        }
        //Creating a temp node that points to the head
        Node temp = head;
        //Moving the temp node forward until it reaches (given index-1), we will add the new node after (given index-1)
        //so that the index of the new node would be the (given index).
        for(int i=1; i<index; i++){
            temp=temp.next;
        }
        //Creating a new node with the given val
        Node newNode = new Node(val);
        //Creating a new node temp2 that would point at the next of temp
        Node temp2 = temp.next;
        //Now we will attach the new node between temp and temp2
        //Making the next of temp point to the new node
        temp.next = newNode;
        //Making the next of the new node point to temp2
        newNode.next = temp2;
        //Increasing the size
        size++;
    }

    public int deleteFirst(){
        //If the head in null we return -1
        if(head==null){
            return -1;
        }
        //Store the initial value of head in dVal variable
        //because we will be reassigning the head pointer to another node
        int dVal = head.value;
        //Making the next of head as head
        //This will cause the linked list to lose it's original head as the head has moved forward.
        //Now we have new head.
        head=head.next;
        //Decrease the size
        size--;
        //Return the deleted value
        return dVal;
    }

    public int deleteLast(){
        //If the head in null we return -1
        if(head == null){
            return -1;
        }
        //Creating a new node temp
        Node temp = head;
        //Moving temp forward until it reaches the node just before tail
        while(temp.next!=tail){
            temp=temp.next;
        }
        //Store the initial value of tail in dVal variable
        //because we will be reassigning the tail pointer to another node
        int dVal = tail.value;
        //Making the next of temp as null
        //This will cause the original tail to be detached from the linked list
        temp.next=null;
        //Now because we have lost the tail, we need to reassign the tail to the last node
        //which is the temp node
        tail = temp;
        //Decreasing the size
        size--;
        //Return the deleted value
        return dVal;
    }

    public int deleteAtIndex(int index){
        //If index is unreachable, return -1.
        if(index>size-1 || index<0){
            return -1;
        }
        //If index is 0, we will call the deleteFirst function, and return from this one
        if(index==0){
            deleteFirst();
        }
        //If index is 0, we will call the deleteFirst function, and return from this one
        if(index==size-1){
            deleteLast();
        }
        //Else we will delete it manually
        else{
            //Creating a new node temp that points to head
            Node temp = head;
            //Move temp forward (given index-1)times, so that it reaches the node just before the target node
            for(int i=1; i<index; i++){
                temp=temp.next;
            }
            //Store the initial value of the target node
            //Here the target node which is to be deleted is the next of temp, which is temp.next.
            int dVal = temp.next.value;
            //Make the (next of temp) point to the (next of the next of temp)
            //Here we have skipped the target node and linked temp with the next of the target node.
            temp.next=temp.next.next;
            //Decreasing the size
            size--;
            //Returning the value of the target node
            return dVal;
        }
        return -1;
    }

    public boolean findVal(int value){
        //If head is null, we return false
        if(head==null){
            return false;
        }
        //Creating a new node temp that points to head
        Node temp = head;
        //Traverse the entire linked list
        //We move until temp is null, which means we move till temp reaches the last node
        while(temp!=null){
            //Check if the value matches the given value
            if(temp.value==value){
                return true;
            }
            //Move temp forward
            temp=temp.next;
        }
        //If after traversing the entire linked list we don't find the value we return false
        return false;
    }



    public void display(){
        //if head is null, we return since we don't have anything to print
        if(head==null){
            return;
        }
        //Creatina a new node temp, that points to head
        Node temp = head;
        //Traversing the entire linked list
        //We move until temp is null, which means we move till temp reaches the last node
        while(temp!=null) {
            //Printing the value of each node
            System.out.print(temp.value+"->");
            //Moving temp forward
            temp = temp.next;
        }
        //Printing null at the end
        System.out.println("null");
    }

    //Defining the class Node
    private class Node{
        //Defining the variable int value
        private int value;
        //Defining the variable Node next
        private Node next;
        //Constructor to create an object of Node class
        public Node(int value) {
            this.value = value;
        }
    }
}
