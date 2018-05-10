package ru.apnmrv.java.collections;

import java.util.*;

public class MyArrayList<T> implements List<T> {

    private T [] arr;

    public MyArrayList() {
        this.arr = ( T [] ) new Object [10];
    }

    public MyArrayList( int capacity ) {
        this.arr = ( T [] ) new Object [capacity];
    }

    public MyArrayList(Collection<T> c) {

        this.arr = ( T [] ) new Object [c.size()];
        c.toArray(this.arr);

    }

    @Override
    public int size() {
        int i = 0;
        for (; i < arr.length; i++) {
            if (arr[i] == null) break;
        }
        return i;
    }

    @Override
    public boolean isEmpty() {
        return null == arr[0] ? true : false;
    }

    @Override
    public boolean contains(Object o) {
        for (T t : arr) {
            if(t.equals(o)) return true;
        }
        return false;
    }

    // @TODO
    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public T [] toArray() {
        return this.arr;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        for (int i = 0; i < size(); i++) {
            a[i] = (T1) arr[i];
        }

        return a;
    }

    @Override
    public boolean add(T t) {
        int i = size();
        if (arr.length <= i) arr = Arrays.copyOf(arr, i + 10);
        arr[i] = t;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        int size = size();
        for (int i = 0; i < size; i++) {
            if (o.equals(arr[i])){
                for (; i < size-1; i++) {
                    arr[i] = arr[i + 1];
                }
                return true;
            }
        }
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    //@ TODO
    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    //@ TODO
    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    //@ TODO
    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    //@ TODO
    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    //@ TODO
    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        return arr[index];
    }

    //@ TODO
    @Override
    public T set(int index, T element) {
        return null;
    }

    //@ TODO
    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    //@ TODO
    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    //@ TODO
    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
