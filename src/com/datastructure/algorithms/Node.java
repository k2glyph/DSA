package com.datastructure.algorithms;

public class Node {
    private int value;
    private Node next;

    public int getValue() {
        return value;
    }
    public Node getNode() {return next;}

    public void setValue(int value) {
        this.value=value;
    }
    public void setNode(Node next) {this.next=next;}
}
