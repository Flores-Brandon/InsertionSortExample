
package com.mycompany.insertionsortexample;
import java.util.Arrays;
public class InsertionSortExample {


        public static void main(String[] args) {
        int[] array = { 12, 11, 13, 5, 6 };

        long startTime = System.nanoTime();
        insertionSort(array);
        long endTime = System.nanoTime();

        System.out.println(Arrays.toString(array));
        System.out.println("El tiempo de ejecucion fue de = " + (endTime - startTime) + " nanosegundos");
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            // Mover los elementos del array[0..i-1] que son mayores que key
            // a una posición adelante de su posición actual
            while (j >= 0 && array[j] < key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
}
