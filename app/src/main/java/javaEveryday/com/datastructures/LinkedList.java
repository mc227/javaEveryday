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
}
