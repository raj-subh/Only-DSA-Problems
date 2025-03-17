package DsaProblems;

public class FindEvenDigitNos {
    public static void main(String[] args) {
        int[] arr = { 12, 345, 2, 6, 7896, 44 };
        System.out.println("Numbers with even digits: " + findNumbers(arr));
    }

    public static int findNumbers(int[] arr) {
        int count = 0;

        for (int num : arr) {
            if (containEvenNoDigits(num)) {
                count++;
            }
        }

        return count;
    }

    public static boolean containEvenNoDigits(int num) {
        int countDigit = 0;
        num = Math.abs(num); // Handling negative numbers

        while (num > 0) {
            num /= 10;
            countDigit++;
        }

        return countDigit % 2 == 0;
    }
}
