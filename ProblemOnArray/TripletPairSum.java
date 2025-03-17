package ProblemOnArray;

import java.util.Scanner;

public class TripletPairSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int targetSum = scanner.nextInt();

        System.out.println(tripletsPairSum(arr, targetSum));
        scanner.close();
    }

    public static int tripletsPairSum(int[] arr, int targetSum) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == targetSum) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
