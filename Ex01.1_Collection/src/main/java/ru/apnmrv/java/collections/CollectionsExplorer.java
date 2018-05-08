package ru.apnmrv.java.collections;

import java.util.*;

public class CollectionsExplorer {

    private static Collection<?> collection;

    public static void exploreIt(Collection<?> coll){

        collection = coll;

        if(!(collection == null && collection.isEmpty())) {
            System.out.println("Collection consists of " + collection.size() + " elements");
            printElements();
        }
        else System.out.println("Collection is empty");
    }

    private static void printElements(){
        /*Iterations*/
        System.out.println(".forEach iteration");
        collection.forEach(e -> System.out.println("\"" + e.toString() + "\"" +
                " of class " + e.getClass().getSimpleName()));

        System.out.println("for (Object o : Collection<?> c) iteration");
        for (Object o : collection)
            System.out.println("\"" + o.toString() + "\"" +
                    " of class " + o.getClass().getSimpleName());
        System.out.println("Iteration with Iterator<?>");
        for(Iterator<?> it = collection.iterator(); it.hasNext();){
            System.out.println(it.next());
        }
    }

}
