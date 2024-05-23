package org.example;


public class Main {
    public static void main(String[] args) {
        int[] smallSizes = {20, 50, 100, 150};
        int[] largeSizes = {10000, 20000, 30000};

        System.out.println("Bubble Sort Performance Test");

        // Test with small input sizes
        System.out.println("\nSmall Input Sizes:");
        for (int size : smallSizes) {
            RunTest.runTest(size);
        }

        // Test with large input sizes
        System.out.println("\nLarge Input Sizes:");
        for (int size : largeSizes) {
            RunTest.runTest(size);
        }
    }
}