package ru.apnmrv.java.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Collection<Integer> c = new ArrayList<Integer>();
        Integer[] arrInt = {1, 2, 3, 3, 3, 3, 5, 5, 6, 7, 8, 8, 89};
        for (int i:arrInt){
            c.add(i);
        }
        for (int j:c) System.out.printf("%d ", j);
        System.out.println("\n");

        Collection<Integer> noDubbles = new HashSet<Integer>(c);
        for (Object k:noDubbles) System.out.printf("%d ", k);
        System.out.println("\n");
    }
}
