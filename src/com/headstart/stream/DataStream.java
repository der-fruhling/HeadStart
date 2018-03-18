package com.headstart.stream;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.stream.Stream;

public class DataStream<T> {
    private final HashMap<Integer, T> hashMap = new LinkedHashMap<>();

    public void add(T data) {
        hashMap.putIfAbsent(data.hashCode(), data);
    }

    HashMap<Integer, T> getMap() {
        return hashMap;
    }
}
