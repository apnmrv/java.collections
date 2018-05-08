package ru.apnmrv.java.collections;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    private static CollectionFabric cFabric = new CollectionFabric();
    private static String[] arrStr = {"String1","String2"};
    private static Integer[] arrInt = {4,5,2,1,2,3,6,6,345,1,2,3,4,5,6};
    private static String s = "Awesome string";
    private static Integer num = 1287658;

    public static void main( String[] args )
    {
        Collection<Collection<?>> collOfColl = new ArrayList<>();

        collOfColl.add(cFabric.getCollectionOf(arrStr));
        collOfColl.add(cFabric.getCollectionOf(arrInt));
        collOfColl.add(cFabric.getCollectionOf(s));
        collOfColl.add(cFabric.getCollectionOf(num));

        collOfColl.forEach(e->CollectionsExplorer.exploreIt(e));
        collOfColl.forEach(e->e.remove("String2"));
        collOfColl.forEach(e->CollectionsExplorer.exploreIt(e));
    }
}
