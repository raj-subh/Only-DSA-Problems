package ProblemOnArray.ArrayManipulation;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(secondMaximum(arr));
        scanner.close();
    }

    public static int firstMaximum(int[] arr) {
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (maxVal < arr[i]) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    public static int secondMaximum(int[] arr) {
        int firstMaxVal = firstMaximum(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == firstMaxVal) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMaxVal = firstMaximum(arr);
        return secondMaxVal;
    }
}
