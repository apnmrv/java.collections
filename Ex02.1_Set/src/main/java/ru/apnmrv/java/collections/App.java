package ru.apnmrv.java.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Collection<Integer> cInt = new ArrayList<Integer>();
        Collection<String> cStr = new ArrayList<String>();

        Integer[] arrInt = {1, 2, 3, 3, 3, 3, 5, 5, 6, 7, 8, 8, 89};
        String[] arrStr = {"wer","wer","xcv","ssdf","xcv","ssdf","ghj","ghj","gjh","ghj","ghj","ghj"};

        for (int i:arrInt){
            cInt.add(i);
        }

        for (String s:arrStr){
            cStr.add(s);
        }

        for (int num:cInt) System.out.printf("%d ", num);
        System.out.println("\n");

        for (String s:cStr) System.out.printf("%s ", s);
        System.out.println("\n");

        Collection<?> noDubbles = new HashSet<Integer>(cInt);
        printCollection(noDubbles);

        noDubbles = removeDubbles(cStr);
        printCollection(noDubbles);

    }

    public static <E> Set<E> removeDubbles(Collection<E> cStr) {
        return new HashSet<E>(cStr);
    }

    public static <E> void printCollection(Collection<E> c){
        for(E el: c) {
            System.out.printf("%s ", el.toString());
        }
        System.out.println("\n");
    }
}
