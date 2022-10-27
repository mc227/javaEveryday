package javaEveryday.com.datastructures;

import java.util.Optional;

public class LinkedList<V> {
    private LinkedListNode<V> head;

    public LinkedList() {
        head = null;
    }

    public void addFront(V item) {
        this.head = new LinkedListNode<V>(item, head);
    }

    public void deleteFront() {
        Optional<LinkedListNode<V>> firstNode = Optional.ofNullable(head);
        this.head = firstNode.flatMap(LinkedListNode::getNext).orElse(null);
        firstNode.ifPresent(n->n.setNext(null));
    }
    /*
    The following code snippet shows one way to implement a find method.
    Again, observe how we make use of Java's Optional methods.
    We start a while loop from the head pointer and keep on moving to
    the next node as long as there is a node present and that node
    doesn't contain the item we're looking for. We then return the last pointer,
    which can be an empty optional or a node containing a match
    * */
    public Optional<LinkedListNode<V>> find(V item) {
        Optional<LinkedListNode<V>> node = Optional.ofNullable(this.head);
        while(node.filter(n-> n.getValue() != item).isPresent()){
            node = node.flatMap(LinkedListNode::getNext);
        }
        return node;
    }
    public void addAfter(LinkedListNode<V> aNode, V item) {
        aNode.setNext(new LinkedListNode<V>(item, aNode.getNext().orElse(null)));
    }

    @Override
    public String toString() {
        Optional<LinkedListNode<V>> node = Optional.ofNullable(head);
        StringBuffer result = new StringBuffer("[");
        while(node.isPresent()){
            node.ifPresent(n->result.append(n.getValue().toString()));
            node = node.flatMap(LinkedListNode::getNext);
            node.ifPresent(n->result.append(", "));
        }
        return result.append("]").toString();
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFront(4);
        list.addFront(2);
        list.addFront(4);
        list.addFront(6);
        list.addFront(3);
        System.out.println(list.toString());
    }
}
