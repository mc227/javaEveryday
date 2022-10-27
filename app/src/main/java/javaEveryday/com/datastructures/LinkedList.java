package javaEveryday.com.datastructures;

import java.util.Optional;

/*
Adding a node in a linked list requires a two pointer reassignment.
On the new node, you set the next pointer to point to whatever
the head pointer is assigned to. Then, you set the head pointer to point to this newly created node.
* */
public class LinkedList<V> {
    private LinkedListNode<V> head;

    public LinkedList() {
        head = null;
    }

    public void addFront(V item) {
        this.head = new LinkedListNode<V>(item, head.getNext().orElse(null));
    }


}
