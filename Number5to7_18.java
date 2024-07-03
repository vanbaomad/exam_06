public class Number5to7_18 {
    public static void main(String[] args) {
        for (int i = 10000; i <= 9999999; i++) {
            if (isPrime(i) && isPalindrome(i) && Not4(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
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

    private static boolean Not4(int n) {
        while (n != 0) {
            int digit = n % 10;
            if (digit == 4) return false;
            n /= 10;
        }
        return true;
    }
}
