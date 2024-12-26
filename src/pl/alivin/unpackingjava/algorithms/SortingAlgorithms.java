package pl.alivin.unpackingjava.algorithms;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortingAlgorithms {
    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        for(int i : arr) {
            System.out.print(i + " ");
        }*/


        int[] arr = {5, 3, 8, 4, 2, 1};
        int[] arr2 = {5, 3, 8, 4, 2, 1};
        int[] arr3 = {5, 3, 8, 4, 2, 1};

        //Selection sort
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                System.out.println(Arrays.toString(arr));
                count++;
            }
        }
        System.out.println("Selection Sort, number of passes: " + count);

        count = 0;

        //Bubble sort
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr2[i] > arr2[i + 1]) {
                    int temp = arr2[i + 1];
                    arr2[i + 1] = arr2[i];
                    arr2[i] = temp;
                    isSorted = false;
                }
                System.out.println(Arrays.toString(arr2));
                count++;
            }
        }
        System.out.println("Bubble sort, number of passes: " + count);
    }
}

