package ru.apnmrv.java.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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

    //@TODO

    @Override
    public int size() {
        int size = 0;
        while (arr[size].getClass().equals(arr.getClass())){
            size++;
            System.out.println(size);
        }
        return size;
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
    public Object[] toArray() {
        return this.arr;
    }

    // @TODO
    @Override
    public <T1> T1[] toArray(T1[] a) {
        for (int i = 0; i < size(); i++) {
            a[i] = (T1) arr[i];
        }

        return a;
    }

    @Override
    public boolean add(T t) {
        for (int i = 0; i < arr.length; i++){
            if (arr [i] == null) {
                arr [i] = t;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
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
