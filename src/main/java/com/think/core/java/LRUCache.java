package com.think.core.java;

/**
 * Created by esha on 23/09/16.
 */
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Map;

public class LRUCache {

    private int intialCapacity ;

    private Map<String, String> cache;

    public Map<String, String> getCache() {
        return cache;
    }

    public void setCache(Map<String, String> cache) {
        this.cache = cache;
    }

    LRUCache(int intialCapacity) {

        this.intialCapacity = intialCapacity;
        cache = new LinkedHashMap<String, String>(intialCapacity);
    }
    public static void main(String[] args) {

    }
    public String get(String key){
        String value = cache.get(key);
        if(value !=null){
            this.put(key, value);
        }
        return value;
    }

    public void put(String key, String value){
        if(cache.containsKey(key)){
            cache.remove(key);
        }
        else if(cache.size()==intialCapacity){
            Iterator<String> iterator = cache.keySet().iterator();
            iterator.next();
            iterator.remove();
        }
        cache.put(key, value);
    }
    }

