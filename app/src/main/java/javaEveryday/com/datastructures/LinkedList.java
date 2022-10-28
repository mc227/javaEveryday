package javaEveryday.com.datastructures;

import java.util.Optional;

public class LinkedList<V> {
    private LinkedListNode<V> head;
    public LinkedList() {
        head = null;
    }

    public void addFront(V item){
        this.head = new LinkedListNode<V>(item,head);
    }

    public void deleteFront(){
        Optional<LinkedListNode<V>> firstNode = Optional.ofNullable(this.head);
        this.head = firstNode.flatMap(LinkedListNode::getNext).orElse(null);
        firstNode.ifPresent(n->n.setNext(null));
    }

    public Optional<LinkedListNode<V>> find(V item) {
        Optional<LinkedListNode<V>> node = Optional.ofNullable(head);
        while(node.filter(n->n.getValue()!=item).isPresent()){
            node = node.flatMap(LinkedListNode::getNext);
        }
        return node;
    }
}
