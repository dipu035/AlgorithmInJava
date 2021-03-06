/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.algorithminjava;

/**
 * @author tibriz Java implementation of recursive Binary Search
 */
public class BinarySearch {

    public int binarySearchRecurtion(int[] arr, int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            // If the element is present at the middle itself
            if (arr[mid] == x) {
                return mid;
            }
            // If element is smaller than mid, then it can only
            // be present in left subarray
            if (arr[mid] > x) {
                return binarySearchRecurtion(arr, l, mid - 1, x);
            }
            // Else the element can only be present in right
            // subarray
            if (arr[mid] < x) {
                return binarySearchRecurtion(arr, mid + 1, r, x);
            }
        }
        return -1;
    }

    public int binarySearchIteration(int[] arr, int x) {
        int l = 0, r = arr.length - 1;
        while (r >= l) {
            int mid = l + (r - l) / 2;
            // If the element is present at the middle itself
            if (arr[mid] == x) {
                return mid;
            }
            // If element is smaller than mid, then it can only
            // be present in left subarray
            if (arr[mid] > x) {
                r = mid - 1;
            } // Else the element can only be present in right
            // subarray
            else {
                l = mid + 1;
            }

        }
        return -1;
    }

    public int binarySearchLoop(int[] arr, int x) {
        int middleIndex = (arr.length - 1) / 2;
        if (arr[middleIndex] == x) {
            System.out.println("Element found at index : " + middleIndex);
            return middleIndex;
        }
        for (int i = 0; i < middleIndex; i++) {
            if (arr[i] == x) {
                System.out.println("Element found at index : " + i);
                return i;
            }
        }
        for (int i = middleIndex; i < arr.length - 1; i++) {
            if (arr[i] == x) {
                System.out.println("Element found at index : " + i);
                return i;
            }
        }
        System.out.println("Element couldn't be found.");
        return -1;

    }

}
