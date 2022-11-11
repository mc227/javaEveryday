package javaEveryday.com.datastructures;

public class RemainderHashing implements HashProvider<Integer> {

    public int hashKey(Integer key, int tableSize) {
        return key % tableSize;
    }
}
