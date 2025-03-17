package LoopsProblem;

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int reverseNum = 0;

        while (n > 0) {
            reverseNum = reverseNum * 10 + n % 10;
            n /= 10;
        }

        System.out.println("Reverse Number: " + reverseNum);
        scanner.close();
    }
}

// Reverse the digits of a number