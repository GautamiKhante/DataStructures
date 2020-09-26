package com.rani.datastructures;

public class BubbleSort {

    public static void main(String[] args) {
        //Bubble Sort
        int []intArray = {34, 56,23 ,1 ,-65,-2};

        for (int lastUnsortedIndex = intArray.length -1; lastUnsortedIndex>0; lastUnsortedIndex-- ){
            for (int i= 0; i<lastUnsortedIndex ; i++){
                if(intArray[i]>intArray[i+1]){
                    swap(intArray, i, i+1);
                }
            }
        }
        for (int i =0 ; i< intArray.length-1; i ++){
            System.out.println(intArray[i]);
        }
    }

    private static void swap(int []intArray, int i, int j){
        if(i == j){
            return;
        }
        int temp= intArray[i];
        intArray[i] = intArray[j];
        intArray[j]=temp;
    }
}
