package javaEveryday.com.datastructures;

import java.util.Optional;

public class SimpleBinaryTree<K,V> implements BinaryTree<K,V>{
    protected BinaryTreeNode<K,V> root;

    public void put(K key, V value) {

    }

    public void put(K key, V value, BinaryTreeNode<K,V> node) {
        if(((Comparable) key).compareTo(node.getKey())==0){

        } else if(((Comparable) key).compareTo(node.getKey()) < 0){

        } else {

        }
    }

    public Optional<V> get(K key) {
        return Optional.of(root).flatMap(n->get(key,n));
    }

    public Optional<V> get(K key, BinaryTreeNode<K,V> node) {
        if(((Comparable) key).compareTo(node.getKey())==0){
            return Optional.of(node.getValue());
        } else if(((Comparable) key).compareTo(node.getKey()) < 0){
            return node.getLeft().flatMap(n->get(key,n));
        } else {
            return node.getRight().flatMap(n->get(key,n));
        }
    }
    public Optional<K> minKey(){
        return Optional.of(root).map(this::minKey);
    }

    public K minKey(BinaryTreeNode<K,V> node) {
        return node.getLeft().map(this::minKey).orElse(node.getKey());
    }
}
