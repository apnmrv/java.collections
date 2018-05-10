package ru.apnmrv.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class App
{
    public static void main( String[] strArgs)
    {
        System.out.println( "Hello World!" );

        List<?> list = getArrayList(strArgs);

        List<?> myArrayList1 = new ArrayList<>();

        List<?> myArrayList2 = new ArrayList<>(100);

        System.out.println("MyArrayList constructor says : " + myArrayList1.size());

        System.out.println("MyArrayList constructor says : " + myArrayList2.size());

        System.out.println("MyArrayList constructor says : " + myArrayList2.isEmpty());
    }

    public static <T> List<T> getArrayList(T [] els) {
        List<T> list = new ArrayList<T>();
        list.addAll(Arrays.asList(els));
        return list;
    }

    public static <T> List<T> getLinkedList(T [] els) {
        List<T> list = new LinkedList<T>();
        list.addAll(Arrays.asList(els));
        return list;
    }
}
