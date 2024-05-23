package org.example;


import java.util.Random;

class BubbleSortTest {
    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // Random numbers between 0 and 99
        }
        return array;
    }
}