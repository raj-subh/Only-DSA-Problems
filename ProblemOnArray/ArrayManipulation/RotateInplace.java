package ProblemOnArray.ArrayManipulation;

import java.util.Arrays;
import java.util.Scanner;

public class RotateInplace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int rotationTime = scanner.nextInt();

        System.out.println("Before Rotation: " + Arrays.toString(arr));
        rotateInplace(arr, rotationTime);
        System.out.println("After Rotation: " + Arrays.toString(arr));

        scanner.close();
    }

    public static void rotateInplace(int[] arr, int k) {
        int n = arr.length;
        if (n == 0 || k % n == 0)
            return; // No need to rotate if k is 0 or a multiple of n

        k = k % n; // Ensure k is within bounds

        reverseArr(arr, 0, n - k - 1);
        reverseArr(arr, n - k, n - 1);
        reverseArr(arr, 0, n - 1);
    }

    static void reverseArr(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}