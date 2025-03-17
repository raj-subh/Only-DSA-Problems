package ProblemOnArray;

import java.util.Scanner;

public class TargetSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int targetSum = scanner.nextInt();

        System.out.println(pairSum(arr, targetSum));
        scanner.close();
    }

    public static int pairSum(int[] arr, int targetSum) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) { // first number
            for (int j = i + 1; j < arr.length; j++) { // second number
                if (arr[i] + arr[j] == targetSum) {
                    count++;
                }
            }
        }
        return count;
    }
}
