package javaEveryday.com.datastructures;
/*
Before we can use any linked list operations,
we need to initialize the data structure and mark it as empty.
Conceptually, this is when the head of the list is pointing to nothing.
We can do this in Java by adding this logic in a constructor.
The following code snippet shows this.
Notice that, once again,
we use generics to hold the type of the items we want to store in the linked list:
* */
public class LinkedList<V> {
    private LinkedListNode<V> head;

    public LinkedList() {
        head = null;
    }



}
