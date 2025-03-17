package DsaProblems;

import java.util.Scanner;

public class SearchItemIn2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] arr = new int[rows][cols];

        // Input elements into the 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int target = scanner.nextInt();

        int[] result = searchItemIn2DArr(arr, target);
        if (result[0] == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at: (" + result[0] + ", " + result[1] + ")");
        }

        scanner.close();
    }

    // Function to search for an item in a 2D array
    public static int[] searchItemIn2DArr(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) { // Corrected loop condition
                if (arr[row][col] == target) {
                    return new int[] { row, col }; // Return the found position
                }
            }
        }
        return new int[] { -1, -1 }; // Return (-1, -1) if element is not found
    }
}
