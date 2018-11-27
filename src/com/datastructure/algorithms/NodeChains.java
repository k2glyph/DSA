package com.datastructure.algorithms;

public class NodeChains {
    public static void main(String[] args) {
//      +-------+------+
//      |  3    | null |
//      +-------+------+
        Node first = new Node();
        first.setValue(3);
//      +-------+------+   +-------+------+
//      |  3    | null |   |  5    | null |
//      +-------+------+   +-------+------+
        Node middle = new Node();
        middle.setValue(5);
//      +-------+------+         +-------+------+
//      |  3    | *    |-------->|  5    | null |
//      +-------+------+         +-------+------+
        first.setNext(middle);
//      +-------+------+         +-------+------+   +-------+------+
//      |  3    | *    |-------->|  5    | null |   |  7    | null |
//      +-------+------+         +-------+------+   +-------+------+
        Node last = new Node();
        last.setValue(7);
//      +-------+------+         +-------+------+        +-------+------+
//      |  3    | *    |-------->|  5    | *    |---->   |  7    | null |
//      +-------+------+         +-------+------+        +-------+------+
        middle.setNext(last);
//      Now iterate over each node and print the node list.
        printList(first);
    }
    private static void printList(Node node) {

        while(node !=null) {
            System.out.println(node.getValue());

            node = node.getNext();
        }
    }
}
