package com.revature.muhammad_ibrahim_p0.util;

import com.revature.muhammad_ibrahim_p0.LinkedList;

public class LinkedListTest {

    private LinkedList<String> sut;
    private LinkedList<? extends Screen> ex ; // generic with subtyping
    private LinkedList<?> ex2; // the ? denotes wildcard

    public void test_add_withNull(){
        //Arrange test
        sut = new LinkedList<>();

        // Act (perform the action to be tested
        try {
            sut.add(null);
            System.err.println("Test: test_add_withNull did not pass!");
        } catch(IllegalArgumentException e) {
            // Assert
            System.out.println("Test: test_add_withNull passed!");
        }
    }
}
