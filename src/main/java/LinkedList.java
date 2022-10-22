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
        Optional<LinkedListNode<V>> firstNode = Optional.ofNullable(head);
        this.head = firstNode.flatMap(LinkedListNode::getNext).orElse(null);
        firstNode.ifPresent(n -> n.setNext(null));
    }
    public Optional<LinkedListNode<V>> find(V item) {
        /*
        To locate an item in a list,
        we need to traverse the entire list until
         we find the item we're searching or reach
         the end of the list. This can be done easily
         by starting at the head pointer and always
         following the node's next pointer until
         you either find the node with the value
         you're looking for or you run out of nodes.
         For example, the next pointer is a null one.
        * */
        Optional<LinkedListNode<V>> node = Optional.ofNullable(head);
        while(node.filter(n -> n.getValue()!=item).isPresent()){
            node = node.flatMap(LinkedListNode::getNext);
        }
        return node;
    }
    public void addAfter(LinkedListNode<V> aNode,V item) {
        aNode.setNext(new LinkedListNode<V>(item, aNode.getNext().orElse(null)));
    }
}
