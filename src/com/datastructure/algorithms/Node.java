package com.datastructure.algorithms;

public class Node<T> {
    private T value;
    private Node next;

    public T getValue() {
        return value;
    }
    public Node getNext() {return next;}

    public void setValue(T value) {
        this.value=value;
    }
    public void setNext(Node next) {this.next=next;}
}
