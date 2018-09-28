package com.my.utils;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 */
public class MyBinarySearchTreeTest {
    @Test
    public void put() throws Exception {
        MyBinarySearchTree<Integer,Integer> bst = new MyBinarySearchTree();
        bst.put(7,7);
        bst.put(4,4);
        bst.put(5,5);
        bst.put(10,10);
        System.out.println();
    }

    @Test
    public void get() throws Exception {
        MyBinarySearchTree<Integer,Integer> bst = new MyBinarySearchTree();
        bst.put(7,7);
        bst.put(4,4);
        bst.put(5,5);
        bst.put(10,10);

        assertEquals(Integer.valueOf(4), bst.get(6));
    }

}