package javaEveryday.com.datastructures;

import java.util.Optional;
import java.util.LinkedList;

public class ChainedHashTable<K,V> implements HashTable<K,V> {
    private final HashProvider<K> hashProvider;
    private LinkedList<Pair<K,V>>[] array;

    public ChainedHashTable(int capacity, HashProvider<K> hashProvider) {
        array = new LinkedList[capacity];
        for(int i = 0; i<capacity;i++) {
            array[i] = new LinkedList<>();
        }
        this.hashProvider = hashProvider;
    }

    public void put(K key, V value) {
        int hashValue = hashProvider.hashKey(key, array.length);
        array[hashValue].addFirst(new Pair<>(key, value));
    }

    public Optional<V> get(K key) {
        int hashValue = hashProvider.hashKey(key, array.length);
        return array[hashValue].stream()
                .filter(keyValue -> keyValue.getKey().equals(key))
                .findFirst()
                .map(Pair::getValue);
    }

    public void remove(K key) {
        int hashValue = hashProvider.hashKey(key, array.length);
        array[hashValue].removeIf(p->p.getKey().equals(key));
    }

    public static void main(String[] args) {
        ChainedHashTable<Integer,String> chainedHashTable = new ChainedHashTable<>(10, new RemainderHashing());
        chainedHashTable.put(1,"Mark");
        System.out.println(chainedHashTable.get(1));
    }
}
