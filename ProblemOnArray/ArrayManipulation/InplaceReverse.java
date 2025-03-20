package ProblemOnArray.ArrayManipulation;

import java.util.Scanner;

public class InplaceReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        reverseInplace(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        scanner.close();
    }

    public static void reverseInplace(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swapArrItem(arr, start, end);
            start++;
            end--;
        }
    }

    public static void swapArrItem(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}