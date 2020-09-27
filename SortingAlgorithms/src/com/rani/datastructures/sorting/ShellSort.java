package com.rani.datastructures.sorting;

public class ShellSort {

    public static void main(String[] args) {
        int[] intArray = {34, 56, 23, 1, -65, -2};

        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < intArray.length; i++) {
                int newElement = intArray[i];
                int j;
                for (j = i; j >= gap && intArray[j - gap] > newElement; j -= gap) {
                    intArray[j] = intArray[j - gap];

                }
                intArray[j] = newElement;
            }
        }
        for (int j : intArray) {
            System.out.println(j);
        }
    }
}
