package javaEveryday.com.datastructures;

import java.util.Optional;

public class OpenAddrHashTable<K, V> implements HashTable<K, V> {
    private final HashProvider<K> hashProvider;
    private OpenAddrPair<K, V>[] array;

    public OpenAddrHashTable(int capacity, HashProvider<K> hashProvider) {
        array = new OpenAddrPair[capacity];
        this.hashProvider = hashProvider;
    }

    public void put(K key, V value) {
        int s = array.length;
        int hashValue = hashProvider.hashKey(key,s);
        int i = 0;
        while(i < s && array[(hashValue + i) % s] != null &&
                !array[(hashValue + i) % s].isDeleted()){
            i++;
        }
        if(i < s) {
            array[(hashValue + i) % s] = new OpenAddrPair<>(key, value);
        }
    }

    private int search(K key) {
        int s = array.length;
        int hashValue = hashProvider.hashKey(key,s);
        int i = 0;
        while(i < s && array[(hashValue + i) % s] != null &&
                !array[(hashValue + i) % s].getKey().equals(key)){
            i++;
        }
        return (hashValue + i) % s;
    }

    public Optional<V> get(K key) {
        return Optional.ofNullable(array[search(key)])
                .filter(kv -> !kv.isDeleted())
                .filter(kv ->kv.getKey().equals(key))
                .map(OpenAddrPair::getValue);
    }

    public void remove(K key) {
        Optional.ofNullable(array[search(key)])
                .ifPresent(kv -> kv.setDeleted(true));
    }

}