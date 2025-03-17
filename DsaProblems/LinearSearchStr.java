package DsaProblems;

import java.util.Scanner;

public class LinearSearchStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        System.out.println(stringLinearSearch(name, 'S'));
        System.out.println(stringLinearSearch1(name, 'S'));

        scanner.close();
    }

    public static boolean stringLinearSearch(String string, char target) {
        if (string.length() == 0) {
            return false;
        }

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }

    public static boolean stringLinearSearch1(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}
