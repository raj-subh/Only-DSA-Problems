package DsaProblems;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();
        int targetIdx = linearSearchMethod(arr, target);

        System.out.println("Target Item Idx: " + targetIdx);

        scanner.close();
    }

    public static int linearSearchMethod(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static boolean linearSearchMethod1(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        for (int item : arr) {
            if (item == target) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchMethod2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int item : arr) {
            if (item == target) {
                return item;
            }
        }
        return -1;
    }
}
