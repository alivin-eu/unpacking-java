package pl.alivin.unpackingjava.algorithms;

import java.util.Arrays;

public class SelectingSorting {
    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 4, 2, 1};

        // Selection sort
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
    }
}

