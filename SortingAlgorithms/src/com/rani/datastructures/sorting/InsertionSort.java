package com.rani.datastructures.sorting;

public class InsertionSort {
    public static void main(String[] args) {

        int[] intArray = {34, 56, 23, 1, -65, -2};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {

            int newElement = intArray[firstUnsortedIndex]; // saving the unsorted element before replacing
            int i;
            for (i = firstUnsortedIndex; i > 0 && intArray[i] > intArray[i - 1]; i--) {
                intArray[i] = intArray[i - 1]; // replacing smaller element to the left
            }
            intArray[i] = newElement; // putting back the element in the position of the first unsorted index

        }
        for (int j : intArray) {
            System.out.println(j);
        }
    }
}
