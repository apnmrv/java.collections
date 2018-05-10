package ru.apnmrv.java.collections;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.omg.CORBA.Object;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class MyArrayListTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public MyArrayListTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( MyArrayListTest.class );
    }

    /**
     *
     */

    public void testMyArrayListConstructor() {

        List<String> myList = new MyArrayList<>();
        List<String> testList = new ArrayList<>();

        assertEquals(myList.isEmpty(), testList.isEmpty());
        assertEquals(myList.size(), testList.size());
    }

    public void testMyArrayListSizedConstructor() {

        List<?> myList = new MyArrayList<>(1000);
        List<?> testList = new ArrayList<>(1000);

        assertEquals(myList.isEmpty(), testList.isEmpty());
        assertEquals(myList.size(), testList.size());

    }

    public void testMyArrayListFromCollectionConstructor() {

        Collection<String> collection = new ArrayList<>();
        collection.add("String1");
        collection.add("String2");

        List <String> testList = new ArrayList<>(collection);
        List <String> myList = new MyArrayList<>(collection);

        assertEquals(myList.isEmpty(), testList.isEmpty());
        assertEquals(testList.size(), myList.size());

    }

    public void testSize(){

        List <Number> testlist = new ArrayList<>();

        List <Number> myList = new MyArrayList<>();

        assertEquals(myList.size(), testlist.size());

        myList.add(3);
        testlist.add(3);

        assertEquals(myList.size(), testlist.size());

        myList.add(5);
        assertTrue(myList.size() != testlist.size());
    }

    public void testIsEmpty(){
        List <String> myList = new MyArrayList<>();
        assertTrue(myList.isEmpty());
    }

    public void testContains(){
        List <String> myList = new MyArrayList<>();
        List <String> testList = new ArrayList<>();

        myList.add("string");
        testList.add("string");
        assertEquals(testList.contains("string"), myList.contains("string"));

    }

    public void testIterator(){}

    public void testToArray(){
        List <Integer> myList = new MyArrayList<>();
        List <Integer> testList = new ArrayList<>();

        for (int i = 0; i < 1000_000; i++) {
            myList.add(i);
            testList.add(i);
            assertEquals(testList.get(i), myList.get(i));
        }

       assertEquals(testList.size(), myList.size());
       assertEquals(testList.getClass().getComponentType(), myList.getClass().getComponentType());

    }

    public void testRemove(){
        List <String> myList = new MyArrayList<>();
        List <String> testList = new ArrayList<>();

        for (int i = 0; i < 11; i++) {
            myList.add(i+"");
            testList.add(i+"");
            System.out.println(myList.get(i));
        }

        myList.remove("5");
        testList.remove("5");
        for (String e : testList) System.out.println(e);
        for (String e : myList) System.out.println(e);
//        for (int i = 0; i < 10_000-1; i++) {
//            assertEquals(testList.get(i), myList.get(i));
//        }
    }

}
