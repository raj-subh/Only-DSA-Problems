package LoopsProblem;

import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sumOfSeries = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sumOfSeries -= i;
            } else {
                sumOfSeries += i;
            }
        }

        System.out.println("Sum of Series is: " + sumOfSeries);
        scanner.close();
    }
}

// Find the sum of the following series: Series = 1 - 2 + 3 - 4 + 5