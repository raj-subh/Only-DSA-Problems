package DsaProblems;

import java.util.Scanner;

public class MinMax2DArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println(findMinimumNoIn2DArr(arr));
        System.out.println(findMaximumNoIn2DArr(arr));

        scanner.close();
    }

    public static int findMinimumNoIn2DArr(int[][] arr) {
        int minVal = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < minVal) {
                    minVal = arr[i][j];
                }
            }
        }
        return minVal;
    }

    public static int findMaximumNoIn2DArr(int[][] arr) {
        int maxVal = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > maxVal) {
                    maxVal = arr[i][j];
                }
            }
        }
        return maxVal;
    }
}
