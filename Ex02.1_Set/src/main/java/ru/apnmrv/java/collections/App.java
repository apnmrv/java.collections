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
    private static Collection<?> noDubbles;

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

        noDubbles = removeDubbles(cInt);
        printCollection(noDubbles);

        noDubbles = removeDubbles(cStr);
        printCollection(noDubbles);

//        noDubbles = new HashSet<Integer>(cInt); // Works too
//        printCollection(noDubbles);

    }

    private static <E> Set<E> removeDubbles(Collection<E> cStr) {
        System.out.println("No more dubbles!");
        return new HashSet<E>(cStr);
    }

    private static <E> void printCollection(Collection<E> c){
        for(E el: c) {
            System.out.printf("%s ", el.toString());
        }
        System.out.println("\n");
    }
}
