package ProblemOnArray.ArrayManipulation;

import java.util.Scanner;

public class PresentQuery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] arr = new int[size];

        int maxElement = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
            maxElement = Math.max(maxElement, arr[i]); // Track the maximum value
        }

        // Build frequency array dynamically
        int[] frequency = makeFreqArr(arr, maxElement);

        System.out.println("Enter number of queries:");
        int queryCount = scanner.nextInt();

        for (int i = 0; i < queryCount; i++) {
            System.out.println("Enter number to be searched:");
            int num = scanner.nextInt();

            System.out.println(num <= maxElement && frequency[num] > 0 ? "Yes" : "No");
        }
        scanner.close();
    }

    public static int[] makeFreqArr(int[] arr, int maxValue) {
        int[] frequency = new int[maxValue + 1]; // Allocate only necessary space

        for (int num : arr) {
            frequency[num]++;
        }
        return frequency;
    }
}

/*
 * Given Q queries, check if the given number is present in the array or not.
 * Note: Value of all the elements in the array is less than 10 to power 5.
 */