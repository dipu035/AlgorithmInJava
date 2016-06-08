/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.algorithminjava;

/**
 *
 * @author tibriz
 */
public class BubbleSort {

    /**
     * The method that sorts the given array using bubble sort algorithm.
     *
     * @param arr is the input array that needs to be sorted.
     * @return The sorted array.
     */
    public int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    // the swapping between two elements.
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array (Bubble Sort) : ");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        return arr;
    }
}
