package com.revature.muhammad_ibrahim_p0;

public interface List<T> {

    // all fields declared within interfaces are implicitly public, static and final
    // all method stubs declared within interfaces are implicitly public and abstract
    // interfaces do not have constructors

    // T is the generic name for this collection

    // list needs to be able to add,

    // add method that adds to our list
    void add(T data);
    //get method that returns a value
    T pop();
    T get(int index);
    //Contain method which is boolean
    boolean contains(T data);
    // size method that returns an int
    int size();

}
