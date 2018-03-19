/*
 * Copyright (c) 2018. Liam Cole
 * This class is part of a public project, HeadStart
 */

package com.headstart;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class LinkedHotDog<Key, Value> extends LinkedHashMap<Key, Value> {
    @Override
    public int size() {
        return super.size();
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return super.containsKey(key);
    }

    @Override
    public Value put(Key key, Value value) {
        return super.put(key, value);
    }

    @Override
    public void putAll(Map<? extends Key, ? extends Value> m) {
        super.putAll(m);
    }

    @Override
    public Value remove(Object key) {
        return super.remove(key);
    }

    @Override
    public Value putIfAbsent(Key key, Value value) {
        return super.putIfAbsent(key, value);
    }

    @Override
    public boolean remove(Object key, Object value) {
        return super.remove(key, value);
    }

    @Override
    public boolean replace(Key key, Value oldValue, Value newValue) {
        return super.replace(key, oldValue, newValue);
    }

    @Override
    public Value replace(Key key, Value value) {
        return super.replace(key, value);
    }

    @Override
    public Value computeIfAbsent(Key key, Function<? super Key, ? extends Value> mappingFunction) {
        return super.computeIfAbsent(key, mappingFunction);
    }

    @Override
    public Value computeIfPresent(Key key, BiFunction<? super Key, ? super Value, ? extends Value> remappingFunction) {
        return super.computeIfPresent(key, remappingFunction);
    }

    @Override
    public Value compute(Key key, BiFunction<? super Key, ? super Value, ? extends Value> remappingFunction) {
        return super.compute(key, remappingFunction);
    }

    @Override
    public Value merge(Key key, Value value, BiFunction<? super Value, ? super Value, ? extends Value> remappingFunction) {
        return super.merge(key, value, remappingFunction);
    }

    @Override
    public Object clone() {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public LinkedHotDog(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    public LinkedHotDog(int initialCapacity) {
        super(initialCapacity);
    }

    public LinkedHotDog() {
        super();
    }

    public LinkedHotDog(Map<? extends Key, ? extends Value> m) {
        super(m);
    }

    public LinkedHotDog(int initialCapacity, float loadFactor, boolean accessOrder) {
        super(initialCapacity, loadFactor, accessOrder);
    }

    @Override
    public boolean containsValue(Object value) {
        return super.containsValue(value);
    }

    @Override
    public Value get(Object key) {
        return super.get(key);
    }

    @Override
    public Value getOrDefault(Object key, Value defaultValue) {
        return super.getOrDefault(key, defaultValue);
    }

    @Override
    public void clear() {
        super.clear();
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Key, Value> eldest) {
        return super.removeEldestEntry(eldest);
    }

    @Override
    public Set<Key> keySet() {
        return super.keySet();
    }

    @Override
    public Collection<Value> values() {
        return super.values();
    }

    @Override
    public Set<Map.Entry<Key, Value>> entrySet() {
        return super.entrySet();
    }

    @Override
    public void forEach(BiConsumer<? super Key, ? super Value> action) {
        super.forEach(action);
    }

    @Override
    public void replaceAll(BiFunction<? super Key, ? super Value, ? extends Value> function) {
        super.replaceAll(function);
    }
}
