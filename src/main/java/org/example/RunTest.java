package org.example;

class RunTest {
    public static void runTest(int size) {
        int numberOfRuns = 10;
        long totalTime = 0;

        for (int i = 0; i < numberOfRuns; i++) {
            int[] array = BubbleSortTest.generateRandomArray(size);
            long start = System.nanoTime();
            BubbleSortPerformance.bubbleSort(array);
            long end = System.nanoTime();
            long timeTaken = end - start;
            totalTime += timeTaken;
            System.out.println("Run " + (i + 1) + " for size " + size + ": " + timeTaken / 1_000_000.0 + " ms");
        }

        double averageTime = totalTime / (numberOfRuns * 1_000_000.0);
        System.out.println("Average time for size " + size + ": " + averageTime + " ms");
    }
}
