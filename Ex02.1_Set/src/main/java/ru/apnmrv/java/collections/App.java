package ru.apnmrv.java.collections;

import java.util.*;
import java.util.stream.Collectors;


/**
 * Hello world!
 *
 */
public class App 
{
    private static Collection<?> collection;
    private static Collection<?> noDubbles;

    public static void main( String[] args )
    {
        collection = Arrays.asList(args).stream()
            .collect(Collectors.toList());
        printCollection(collection);

        noDubbles = removeDubbles(collection);
        printCollection(noDubbles);

    }

    private static <E> Set<E> removeDubbles(Collection<E> cStr) {
        System.out.println("No more dublets!");
        System.out.println("Weird order!");
        return new HashSet<E>(cStr);
    }

    private static <E> void printCollection(Collection<E> c){
        for(E el: c) {
            System.out.printf("%s ", el.toString());
        }
        System.out.println("\n");
    }
}
