/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.algorithminjava;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author tibriz
 */
public class AlgorithmTest {

    @Test
    public void binarySearchTest() {
        BinarySearch binarySearch = new BinarySearch();
        int arr[] = {2, 3, 4, 10, 15, 20, 34};
        int x = 15;
        int y = 20;
        Assert.assertEquals("Element should be at index 4", 4, binarySearch.binarySearchIteration(arr, x));
        System.out.println("Start of Binary Search Loop >>>");
        Assert.assertEquals("Element should be at index 5", 5, binarySearch.binarySearchLoop(arr, y));
        System.out.println("<<< End of Binary Search Loop.");
    }

    @Test
    public void selectionSortTest() {
        SelectionSort selectionSort = new SelectionSort();
        int arr[] = {64, 25, 12, 22, 11, 2, 46, 25, 123};
        int[] result = {2, 11, 12, 22, 25, 25, 46, 64, 123};
        Assert.assertArrayEquals("Element didn't sorted properly", result, selectionSort.sort(arr));
    }
    
     @Test
    public void bubbleSortTest() {
        BubbleSort bubbleSort = new BubbleSort();
        int arr[] = {64, 25, 12, 22, 11, 2, 46, 25, 123};
        int[] result = {2, 11, 12, 22, 25, 25, 46, 64, 123};
        Assert.assertArrayEquals("Element didn't sorted properly", result, bubbleSort.sort(arr));
    }
}
