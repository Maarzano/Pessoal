package MinhasEstruturas.HashTable;

import java.util.LinkedList;

public class MyHashMap<T, Y> {

    private LinkedList<Entry<T, Y>>[] buckets;
    
    private static final int INITIAL_CAPACITY = 16;
    private static final float DEFAULT_LOAD_FACTOR = 0.75f;
    private int size = 0;

    private static class Entry<T, Y> {
        T key;
        Y value;

        Entry(T key, Y value) {
            this.key = key;
            this.value = value;
        }
    }

    public MyHashMap() {
        this.buckets = new LinkedList[INITIAL_CAPACITY];
        for (int i = 0; i < INITIAL_CAPACITY; i++) {
            this.buckets[i] = new LinkedList<>();
        }
    }

    private int getBucketIndex(T key) {
        if (key == null) {
            return 0;
        }
        
        int hashCode = key.hashCode();
        int positiveHash = Math.abs(hashCode);
        int index = positiveHash % buckets.length;
        
        return index;
    }


    public void put(T key, Y value) {
        
        throw new UnsupportedOperationException("Ainda não implementado!");
    }

    public Y get(T key) {

        throw new UnsupportedOperationException("Ainda não implementado!");
    }
    
    public Y remove(T key) {
        
        throw new UnsupportedOperationException("Ainda não implementado!");
    }
    
    private void resize() {
        
        System.out.println("Redimensionando!");
    }
}