package javaEveryday.com.datastructures;

import java.util.Optional;

public class SimpleBinaryTree<K,V> implements BinaryTree<K,V> {
    protected BinaryTreeNode<K,V> root;


    public void put(K key, V value) {

    }


    public Optional<V> get(K key) {
        return Optional.ofNullable(root).flatMap(n->get(key,n));
    }

    private Optional<V> get(K key, BinaryTreeNode<K,V> node) {
        if(((Comparable) key).compareTo(node.getKey())==0){
            return Optional.of(node.getValue());
        } else if(((Comparable) key).compareTo(node.getKey()) <0){
            return node.getLeft().flatMap(n->get(key,n));
        }else {
            return node.getRight().flatMap(n->get(key,n));
        }
    }
}
