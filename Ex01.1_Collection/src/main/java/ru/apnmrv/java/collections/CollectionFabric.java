package ru.apnmrv.java.collections;

import java.util.*;

public class CollectionFabric implements CollectionProducer {

    @Override
    public Collection<?> getCollectionOf() {
        return new ArrayList<>();
    }

    @Override
    public Collection<?> getCollectionOf(Integer[] integers) {
        Collection<Integer> collection = new ArrayList<>();
        for (Integer i : integers) {
            collection.add(i);
        }
        return Arrays.asList(integers);
    }

    @Override
    public Collection<?> getCollectionOf(String[] strings) {
        Collection<String> collection = new ArrayList<>();
        for (String s : strings) {
            collection.add(s);
        }
        return collection;
    }

    @Override
    public Collection<?> getCollectionOf(ArrayList<?> arrayList) {
        return arrayList;
    }

    @Override
    public Collection<?> getCollectionOf(SortedSet<?> sortedSet) {
        return sortedSet;
    }

    @Override
    public Collection<?> getCollectionOf(SortedMap<?, ?> sortedMap) {
        return (Collection<?>) sortedMap;
    }

    @Override
    public Collection<?> getCollectionOf(HashMap<?, ?> hashMap) {
        return (Collection<?>) hashMap;
    }

    @Override
    public Collection<?> getCollectionOf(String string) {
        String[] arrStr = {string};
        return getCollectionOf(arrStr);
    }

    @Override
    public Collection<?> getCollectionOf(Integer integer) {
        Integer[] arrInt = {integer};
        return getCollectionOf(arrInt);
    }
}
