package PrintPattern;

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt();

        for (int i = 1; i <= row; i++) {
            // print r-i spaces
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }

            // print 2*i-1
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
