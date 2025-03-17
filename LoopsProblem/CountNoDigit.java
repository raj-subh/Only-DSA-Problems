package LoopsProblem;

import java.util.Scanner;

public class CountNoDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int original_n = n;
        int countDigit = 0;

        while (n > 0) {
            n = n / 10;
            countDigit++;
        }

        System.out.println("No of Digits in " + original_n + ":" + countDigit);
        scanner.close();
    }
}

// Count no of digit from given no