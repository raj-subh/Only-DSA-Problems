package ProblemOnArray.ArrayManipulation;

import java.util.Scanner;

public class FindUniqueNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(uniqueItem(arr));
        scanner.close();
    }

    public static int uniqueItem(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        int unique = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                unique = arr[i];
            }
        }
        return unique;
    }
}
