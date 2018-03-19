/*
 * Copyright (c) 2018. Liam Cole
 * This class is part of a public project, HeadStart
 */

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
