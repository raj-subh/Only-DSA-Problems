package PrintPattern;

import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= (row + 1 - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
