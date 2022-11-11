package javaEveryday.com.datastructures;

public interface HashProvider<K> {
    int hashKey(K key, int tableSize);
}
