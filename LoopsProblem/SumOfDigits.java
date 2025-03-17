package LoopsProblem;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int original_n = n;
        int sumOfDigits = 0;

        while (original_n > 0) {
            int lastDigit = original_n % 10;
            sumOfDigits += lastDigit;
            original_n = original_n / 10;
        }

        System.out.println("Sum of Digits in " + n + " is: " + sumOfDigits);
        scanner.close();
    }
}

// Sum of digits in a given number