package ru.apnmrv.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] strArgs, Integer[] intArgs )
    {
        System.out.println( "Hello World!" );

        List<?> list = getArrayList(strArgs);
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
