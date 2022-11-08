package javaEveryday.com.datastructures;

import java.util.Optional;

public class Stack<V> {
    private LinkedListNode<V> head;

    public void push(V item){
        head = new LinkedListNode<>(item, head);
    }

    public Optional<V> pop(){
        Optional<LinkedListNode<V>> node = Optional.ofNullable(head);
        head = node.flatMap(LinkedListNode::getNext).orElse(null);
        return node.map(LinkedListNode::getValue);
    }
    /**
     * Reversing a String
     * We need to make use of a stack data structure for reversing a string.
     *
     * Follow these steps:
     *
     * To reverse the string,
     * push of each character of the input string and then pop everything out, one at a time,
     * building a reversed string. The method signature can be as follows:
     * public String reverse(String str)
     * The following code shows how a string can be reversed using the stack data structure:
     */
    public String reverse(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        for(char i: str.toCharArray()){
            stack.push(i);
        }
        Optional<Character> optChar = stack.pop();
        while(optChar.isPresent()){
            result.append(optChar.get());
            optChar = stack.pop();
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.reverse("kraM"));

    }

    @Override
    public String toString() {
        Optional<LinkedListNode<V>> node = Optional.ofNullable(this.head);
        StringBuffer result = new StringBuffer("[");
        while(node.isPresent()){
            node.ifPresent(n->result.append(n.getValue()));
            node = node.flatMap(LinkedListNode::getNext);
            node.ifPresent(n->result.append(", "));
        }
        return result.append("]").toString();
    }
}
