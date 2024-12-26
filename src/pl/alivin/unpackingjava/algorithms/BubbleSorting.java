package pl.alivin.unpackingjava.algorithms;

import java.util.Arrays;

public class BubbleSorting {

    public int[] BubbleSortingWithoutFlag(int[] arr) {

        // 1. without sorting check flag

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                System.out.println(Arrays.toString(arr));
            }
            System.out.println("Iteration " + i);
        }
        return arr;

    }

    public int[] BubbleSortingWithFlagFor(int[] arr) {

        // 2. with flag isSorted

        boolean isSorted = false;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    isSorted = true;
                }
                System.out.println(Arrays.toString(arr));
            }
            System.out.println("Iteration " + i);

        }
        System.out.println(isSorted);
        return arr;
    }

    public int[] BubbleSortingWithFlagWhile(int[] arr) {

        //3. Bubble sort with test flag and while

        boolean isSorted = false;
        int count = 0;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    isSorted = false;
                }
                System.out.println(Arrays.toString(arr));
                count++;
            }
        }
        System.out.println("Bubble sort, number of passes: " + count);

        return arr;
    }

}
