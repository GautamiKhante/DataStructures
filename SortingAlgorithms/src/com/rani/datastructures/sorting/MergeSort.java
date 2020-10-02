package com.rani.datastructures.sorting;

public class MergeSort {

    public static void main(String[] args) {
        int[] intArray = {34, 56, 23, 1, -65, -2, 87};

        mergerSort(intArray, 0, intArray.length);

        for (int j : intArray) {
            System.out.println(j);
        }


    }

    public static void mergerSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int mid = (start + end) / 2;
        mergerSort(input, start, mid);
        mergerSort(input, mid, end);
        merge(input, start, mid, end);

    }

    public static void merge(int[] input, int start, int mid, int end) {
        if (input[mid - 1] <= input[mid]) {
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];

        }
        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);

    }


}
