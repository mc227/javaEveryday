package javaEveryday.com.datastructures;

import java.util.Optional;

public class InOrderSuccessorBinaryTree<K,V> extends SimpleBinaryTree<K,V> {
    public Optional<K> inOrderSuccessorKey(K key) {
        Optional<BinaryTreeNode<K,V>> node = Optional.ofNullable(root);
        Optional<K> successor = Optional.empty();
        while(node.isPresent() && !node.get().getKey().equals(key)){
            if(((Comparable) node.get().getKey()).compareTo(key) > 0) {
                successor = node.map(BinaryTreeNode::getKey);
                node = node.flatMap(BinaryTreeNode::getLeft);
            } else {
                node =node.flatMap(BinaryTreeNode::getRight);
            }
            return node.flatMap(BinaryTreeNode::getRight).map(this::minKey).map(Optional::of).orElse(successor);
        }

//    public static void main(String[] args) {
//        InOrderSuccessorBinaryTree<Integer, String> binaryTree = new InOrderSuccessorBinaryTree<Integer, String>();
//        binaryTree.put(1, "Isabel");
//        binaryTree.put(2, "John");
//        binaryTree.put(3, "Ruth");
//        binaryTree.put(4, "Sarah");
//        binaryTree.put(5, "Peter");
//        binaryTree.put(6, "Tom");
//        System.out.println(binaryTree.inOrderSuccessorKey(1));
//    }
}
