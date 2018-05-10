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
<<<<<<< HEAD
        System.out.println("No more dublets!");
        System.out.println("Weird order!");
=======
        System.out.println("No more dubblets!");
>>>>>>> 83276a4fc924a2865a267be968e1dfdaff0a3e02
        return new HashSet<E>(cStr);
    }

    private static <E> void printCollection(Collection<E> c){
        for(E el: c) {
            System.out.printf("%s ", el.toString());
        }
        System.out.println("\n");
    }
}
