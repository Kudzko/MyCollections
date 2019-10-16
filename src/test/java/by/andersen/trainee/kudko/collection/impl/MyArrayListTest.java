package by.andersen.trainee.kudko.collection.impl;

import by.andersen.trainee.kudko.collection.collinterface.MyList;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayListTest {


    @Test
    public void tst_add() {
        MyList<String> testList = new MyArrayList<>();

        assertTrue("Element have not added to MyArrayList",
                testList.add("test"));
        assertEquals("Element added, but size haven't changed",
                1, testList.size());
    }

    @Test
    public void tst_add_get() {
        MyList<String> testList = new MyArrayList<>();
        String testText = "test";

        assertTrue("some Text", testList.add(testText));
        assertTrue("Mismatches added element and got element",
                testText.equals(testList.get(0)));
    }

    @Test
    public void tst_remove() {
        MyList<String> testList = new MyArrayList<>();
        String testText = "test";
        testList.add(testText);

        assertTrue("Element haven't deleted",
                testList.remove(testText));
    }

    @Test
    public void tst_removeByIndex() {
        MyList<String> testList = new MyArrayList<>();
        String testText1 = "test1";
        String testText2 = "test2";
        String testText3 = "test3";
        String testText4 = "test4";
        testList.add(testText1);
        testList.add(testText2);
        testList.add(testText3);
        testList.add(testText4);

        assertTrue("Element haven't deleted",
                testList.remove(testText3));
        assertEquals("The number of elements haven't reduced",3, testList.size());
    }

    @Test
    public void tst_addToIndex() {
        MyList<String> testList = new MyArrayList<>();
        String testText1 = "test1";
        String testText2 = "test2";
        String testText3 = "test3";
        String testText4 = "test4";
        testList.add(testText1);
        testList.add(testText2);
        testList.add(testText4);

        assertTrue("Element haven't deleted",
                testList.add(1, testText3));
        assertTrue("Element haven't added or added to the wrong position",
                testText3.equals(testList.get(1)));
    }

    @Test
    public void tst_isEmpty(){
        MyList<String> testList = new MyArrayList<>();
        assertTrue("The list is not empty. Size is not zero",
                testList.isEmpty());
    }


}
