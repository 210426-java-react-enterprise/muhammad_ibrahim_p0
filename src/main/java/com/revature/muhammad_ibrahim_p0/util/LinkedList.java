package com.revature.muhammad_ibrahim_p0.util;

//import com.revature.muhammad_ibrahim_p0.List;

/**
 * A simple implementation of a doubly Linked-list structure that does not
 * accept null data.
 *
 * @param <T>
 */
public class LinkedList<T> implements List<T> {

    private int size;
    private Node<T> head;
    private Node<T> tail;

    @Override
    public void add(T data) throws IllegalArgumentException{

        if (data == null) {
            throw new IllegalArgumentException("This linked list does not accept null values");
        }

        // creating new node
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            tail = head = newNode; // sets both head and tail to the new node
        } else {
            tail.nextNode = newNode;
            newNode.prevNode = tail;
            tail = newNode;
        }

        size++;
    }

    /**
     * Returns and removes the head node's data or else return null
     * @return
     */
    @Override
    public T pop() {

        if (head == null) {
            return null;
        }

        // We are trying to get T
        T soughtData = head.data;
        head = head.nextNode;
        if (head != null) {
            head.prevNode = null;
        } else{
            tail = null;
        }

        size--; // size decreases by one

        return soughtData;
    }

    @Override
    public T get(int index) {

        if (index < 0 || index > size) {
            throw new IllegalArgumentException("The provided index would be out of bounds");
        }

        Node<T> runner = head;
        for (int i = 0; i < size; i++) {
            if (i == index) {
                return runner.data;
            }
            runner = runner.nextNode;
        }
        return null;
    }

    @Override
    public boolean contains(T data) {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    private static class Node<T> {
        T data;
        // create a doubly linkedlist
        Node<T> nextNode;
        Node<T> prevNode;

        // this constructor takes in the data
        public Node(T data) {
            this.data = data;
        }

        // this constructor takes in the data as well as nextNode and prevNode
        public Node(T data, Node<T> nextNode, Node<T> prevNode) {
            this.data = data;
            this.nextNode = nextNode;
            this.prevNode = prevNode;
        }
    }
}
