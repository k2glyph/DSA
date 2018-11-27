package com.datastructure.algorithms;

public class LinkedList<T> {
    Node<T> head;

    private void setHead(T data) {
        head = new Node<>();
        head.setValue(data);
        head.setNext(null);
    }
    public void addToHead(T data) {
        if(head == null) {
            setHead(data);
        }else {
            Node<T> temp = head;
            setHead(data);
            head.setNext(temp);
        }
    }
    public void addToTail(T data) {
        Node<T> temp=head;
        while(temp.getNext() != null) {
            temp=temp.getNext();
        }
        Node<T> node = new Node<>();
        temp.setNext(node);
        node.setValue(data);
    }

    public void insert(T data) {
        if(head == null) {
            setHead(data);
        } else {
            addToTail(data);
        }
    }
    public void printList() {
        Node<T> temp = head;
        while(temp !=null) {
            System.out.println(temp.getValue());
            temp = temp.getNext();
        }
    }
}
