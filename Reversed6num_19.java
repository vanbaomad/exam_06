public class Reversed6num_19 {
    public static void main(String[] args) {
        for (int i = 100000; i <= 999999; i++) {
            if (isPalindrome(i) && sumOfDigitsDivisibleBy10(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPalindrome(int n) {
        int reversed = 0, original = n;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return original == reversed;
    }
    private static boolean sumOfDigitsDivisibleBy10(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum % 10 == 0;
    }
}
