package javaEveryday.com.datastructures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListNodeTest {
    @Test
    void LeonTest() {
        LinkedListNode<String> linkedListNode = new LinkedListNode<>("Leon S Kennedy", null);
        assertEquals(linkedListNode.getValue().toString(),"Leon S Kennedy");
    }
}