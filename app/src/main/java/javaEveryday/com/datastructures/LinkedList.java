package javaEveryday.com.datastructures;

import java.util.Optional;

public class LinkedList<V> {
    private LinkedListNode<V> head;
    public LinkedList() {
        head = null;
    }
    public void addFront(V value) {
        this.head = new LinkedListNode<V>(value, head);
    }
    public void deleteFront() {
        Optional<LinkedListNode<V>> firstNode = Optional.ofNullable(this.head);
        this.head = firstNode.flatMap(LinkedListNode::getNext).orElse(null);
        firstNode.ifPresent(n->n.setNext(null));
    }
    public Optional<LinkedListNode<V>> find(V item) {
        Optional<LinkedListNode<V>> node = Optional.ofNullable(this.head);
        while(node.filter(n->n.getValue()!=item).isPresent()){
            node = node.flatMap(LinkedListNode::getNext);
        }
        return node;
    }
    public void addAfter(LinkedListNode<V> aNode, V item) {
        aNode.setNext(new LinkedListNode<V>(item, aNode.getNext().orElse(null)));
    }

    @Override
    public String toString() {
        Optional<LinkedListNode<V>> node = Optional.ofNullable(this.head);
        StringBuffer result = new StringBuffer("[");
        while(node.isPresent()){
            node.ifPresent(n->result.append(n.getValue().toString()));
            node = node.flatMap(LinkedListNode::getNext);
            node.ifPresent(n->result.append(", "));
        }
        return result.append("]").toString();
    }

    /**
     We have a linked list containing some elements and we need to build a string of the
     form [3,6,4,2,4]. If the list is empty, it should output [].
     */
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addFront(4);
        linkedList.addFront(2);
        linkedList.addFront(4);
        linkedList.addFront(6);
        linkedList.addFront(3);
        System.out.println(linkedList.toString());
    }
}
