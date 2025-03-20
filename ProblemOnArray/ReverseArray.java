package ProblemOnArray;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] tempArr = reverseArr(arr);
        for (int i = 0; i < tempArr.length; i++) {
            System.out.print(tempArr[i] + " ");
        }
        scanner.close();
    }

    public static int[] reverseArr(int[] arr) {
        int[] ans = new int[arr.length];
        int j = 0;

        // traverse original array in reverse direction
        for (int i = arr.length - 1; i >= 0; i--) {
            ans[j++] = arr[i];
        }
        return ans;
    }
}