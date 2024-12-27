package pl.alivin.unpackingjava.algorithms.test;

import pl.alivin.unpackingjava.algorithms.BubbleSorting;

public class BubbleSortingFlagWhileTest {
    public static void main(String[] args) {
        int[] testArray1 = {5, 3, 8, 4, 2, 1};
        int[] testArray2 = {1, 2, 3, 4, 5, 8};

        BubbleSorting bubbleSorting = new BubbleSorting();

        bubbleSorting.BubbleSortingWithFlagWhile(testArray1);
        bubbleSorting.BubbleSortingWithFlagWhile(testArray2);
    }
}
