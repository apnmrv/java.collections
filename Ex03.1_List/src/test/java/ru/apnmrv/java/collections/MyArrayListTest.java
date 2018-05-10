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
    private List<?> myList;

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

        myList = new MyArrayList<>(1000);
        List<?> testList = new ArrayList<>(1000);


        assertEquals(myList.isEmpty(), testList.isEmpty());

        assertEquals(myList.size(), testList.size());

    }

    public void testMyArrayListFromCollectionConstructor() {

        Collection<String> collection = new ArrayList<>();
        collection.add("String1");
        collection.add("String2");

        List <String> testList = new ArrayList<>(collection);
        //List <String> myList = new MyArrayList<>(collection);

        assertEquals(myList.isEmpty(), testList.isEmpty());
        System.out.println(testList.size());

        String [] arr = new String [10];

         arr = (String[]) collection.toArray();


//        System.out.println(myList.size());


//        assertEquals(testList.size(), myList.size());

//        String [] sArr = new String[10];
//
//        sArr[0] = "str";
//        sArr[0] = "str1";
//
//        myList.toArray(sArr);
//
//        int i = 0;
//        while (sArr[i].getClass().equals(sArr.getClass())){
//            System.out.println(sArr[i]);
//        }

    }

    public void testContains(){
        myList = new MyArrayList<>();
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
}
