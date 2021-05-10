package com.revature.muhammad_ibrahim_p0.util;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {

    private LinkedList<String> sut;

    @Before
    public void setUpTest(){
        sut = new LinkedList<>();
    }

    @After
    public void tearDownTest() {
        sut = null;
    }

    @Test
    public void test_addWithNonNullValue() {
        // Arrange (prepare the test)
        int expectedSize = 1;

        // Act (do the test)
        sut.add("data");

        // Assert (ensure the result)
        int actualSize = sut.size();
        Assert.assertEquals(expectedSize, actualSize);
    }
    @Test(expected = IllegalArgumentException.class)
    public void test_addWithNullValue() {
        // Arrange

        // Act
        sut.add(null);

        // Assert
        // Sometimes blank, especially if you expect an exception to be thrown
    }
}
