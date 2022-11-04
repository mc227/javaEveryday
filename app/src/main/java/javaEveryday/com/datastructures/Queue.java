package javaEveryday.com.datastructures;

public class Queue<V> {
    private DblLinkedListNode<V> head;
    private DblLinkedListNode<V> tail;

    public Queue() {
        head = null;
        tail = null;
    }

    /**
     dequeue(head)
        if(head!=null)
            node = head
            head = head.next
            if(head!=null) head.previous = null
            return node.value
        return null
     * */
    /**
     enqueue(tail,item)
        node = new Node(item)
        node.previous = tail
        if(tail!=null) tail.next = node
        tail = node
        if(head==null) head = node
     */
}
