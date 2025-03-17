package PrintPattern;

import java.util.Scanner;

public class RectanglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt();
        int col = scanner.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
