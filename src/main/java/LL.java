import java.util.Optional;

public class LL {
    public class LinkedListNode<V> {
        private V value;
        private LinkedListNode<V> next;
        public LinkedListNode(V value, LinkedListNode<V> next) {
            this.value = value;
            this.next = next;
        }
        public Optional<LinkedListNode<V>> getNext() {
            return Optional.ofNullable(next);
        }
    }
}
