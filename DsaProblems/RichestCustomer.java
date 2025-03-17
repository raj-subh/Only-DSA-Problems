package DsaProblems;

import java.util.Scanner;

public class RichestCustomer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of customers: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of banks/accounts per customer: ");
        int cols = scanner.nextInt();

        int[][] accounts = new int[rows][cols];

        System.out.println("Enter the wealth values:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                accounts[i][j] = scanner.nextInt();
            }
        }

        int richest = maximumWealth(accounts);
        System.out.println("The richest customer has a wealth of: " + richest);

        scanner.close(); 
    }

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int[] customer : accounts) { // Enhanced for-loop for better readability
            int sum = 0;
            for (int account : customer) {
                sum += account;
            }
            maxWealth = Math.max(maxWealth, sum); // Using Math.max() for better readability
        }
        return maxWealth;
    }
}
