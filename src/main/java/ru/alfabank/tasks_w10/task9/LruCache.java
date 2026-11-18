package ru.alfabank.tasks_w10.task9;

import java.util.LinkedHashMap;
import java.util.Map;

public class LruCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public LruCache(int capacity) {
        super(capacity, 1, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        if (this.size() > capacity)
            return true;
        return false;
    }

    static void main() {
        LruCache<Integer, String> lruCache = new LruCache<>(3);
        lruCache.put(1, "A");
        lruCache.put(2, "B");
        lruCache.put(3, "C");
        lruCache.get(1);
        System.out.println(lruCache);
        lruCache.put(4, "D");
        System.out.println(lruCache);
        lruCache.put(5, "E");
        System.out.println(lruCache);
    }
}
