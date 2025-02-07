package pl.alivin.unpackingjava.examples.eckel.chapter5.task17_18;

public class Array {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = array1;

        for (int i :
                array1) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i :
                array2) {
            System.out.print(i + " ");
        }

        array1[2] = 0;
        array2[3] = 0;
        
        System.out.println();

        for (int i :
                array1) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i :
                array2) {
            System.out.print(i + " ");
        }
    }
}
