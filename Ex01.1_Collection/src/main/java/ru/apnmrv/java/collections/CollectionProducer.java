package ru.apnmrv.java.collections;

import java.util.*;

public interface CollectionProducer {

    /** empty Collection**/
    public Collection<?> getCollectionOf();

    public Collection<?> getCollectionOf(Integer[] integers);

    public Collection<?> getCollectionOf(String[] strings);

    public Collection<?> getCollectionOf(ArrayList<?> arrayList);

    public Collection<?> getCollectionOf(SortedSet<?> sortedSet);

    public Collection<?> getCollectionOf(SortedMap<?, ?> sortedMap);

    public Collection<?> getCollectionOf(HashMap<?, ?> hashMap);

    public Collection<?> getCollectionOf(String string);

    public Collection<?> getCollectionOf(Integer integer);

}
