import java.util.Scanner;

public class SwappingNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Code Compiled Successfully...");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        swapMethod(a, b);
        swapWithoutTemp(a, b);
        scanner.close();
    }

    public static void swapMethod(int a, int b) {
        System.out.println("Swapping With Temp...");
        System.out.println("Before Swapping: ");
        System.out.println("a = " + a + " b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping: ");
        System.out.println("a = " + a + " b = " + b);
    }

    public static void swapWithoutTemp(int a, int b) {
        System.out.println("Swapping Without Temp...");
        System.out.println("Before Swapping: ");
        System.out.println("a = " + a + " b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swapping: ");
        System.out.println("a = " + a + " b = " + b);
    }
}