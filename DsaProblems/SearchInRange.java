package DsaProblems;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();
        System.out.println(searchItemInRange(arr, target, 1, 4));

        scanner.close();
    }

    public static int searchItemInRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int idx = start; idx <= end; idx++) {
            if (arr[idx] == target) {
                return idx;
            }
        }
        return -1;
    }
}
