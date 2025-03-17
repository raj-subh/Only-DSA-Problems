package DsaProblems;

import java.util.Scanner;

public class MinMaxNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(minimumNo(arr));
        System.out.println(maximumNo(arr));

        scanner.close();
    }

    public static int minimumNo(int[] arr) {
        int minVal = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
        }
        return minVal;
    }

    public static int maximumNo(int[] arr) {
        int maxVal = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
