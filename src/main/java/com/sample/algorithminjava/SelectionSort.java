/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.algorithminjava;

/**
 *
 * @author tibriz 
 * Java program for implementation of Selection Sort
 */
public class SelectionSort {

    /**
     * Prints the array
     *
     * @param arr is the sorted array that needs to be printed.
     */
    public void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * The method that sorts the given array using insertion sort algorithm.
     *
     * @param arr is the input array that needs to be sorted.
     * @return The sorted array.
     */
    public int[] sort(int[] arr) {
        int n = arr.length;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Sorted Array (Selection Sort) : ");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        return arr;
    }
}
