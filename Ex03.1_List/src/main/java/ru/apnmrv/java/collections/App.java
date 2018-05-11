package ru.apnmrv.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class App
{
    public static void main( String[] strArgs)
    {

        List<String> list = getArrayList(strArgs);

        List<String> myArrayList1 = new MyArrayList<>();

        List<String> myArrayList2 = new MyArrayList<>(100);

        System.out.println("MyArrayList constructor says : " + myArrayList1.size());

        System.out.println("MyArrayList constructor says : " + myArrayList2.size());

        System.out.println("MyArrayList constructor says : " + myArrayList2.isEmpty());
    }

    public static <T> List<T> getArrayList(T [] els) {
        List<T> list = new ArrayList<>();
        list.addAll(Arrays.asList(els));
        return list;
    }

    public static <T> List<T> getLinkedList(T [] els) {
        List<T> list = new LinkedList<T>();
        list.addAll(Arrays.asList(els));
        return list;
    }
}
