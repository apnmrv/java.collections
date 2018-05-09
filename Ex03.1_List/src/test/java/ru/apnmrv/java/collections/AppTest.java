package ru.apnmrv.java.collections;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.*;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testGetArrayList()
    {
        System.out.println("Testing method getArrayList()...");
        String [] sArr = {"String1", "String2"};
        List<String> stringList = App.getArrayList(sArr);

        testListContainsElements(stringList, sArr);
        testNotEmptyList(stringList);
        testListDoNotContainsElement(stringList);

    }

    public void testLinkedList()
    {
        System.out.println("Testing method getLinkedList()...");
        String [] sArr = {"String1", "String2"};
        List<String> stringList = App.getLinkedList(sArr);

        testListContainsElements(stringList, sArr);
        testNotEmptyList(stringList);
        testListDoNotContainsElement(stringList);
    }

    private void testNotEmptyList(List<?> list) {
        assertTrue(!list.isEmpty());
    }

    private <T> void testListContainsElements(List<T> list, T [] els){
        for(T e : els){
            assertTrue( list.contains(e) );
        }
    }

    private <T> void testListDoNotContainsElement(List<T> list){
        assertTrue(!list.contains("StrangerThings"));
    }
}
