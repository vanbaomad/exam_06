public class Number7sto9s_1 {
    public static void main(String[] args) {
        for (int i = 1000000; i <= 999999999; i++) {
            if (isPalindrome(i) && only680(i) && sumDivisibleBy10(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean sumDivisibleBy10(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum % 10 == 0;
    }

    private static boolean only680(int n) {
        while (n > 0) {
            int digit = n % 10;
            if (digit != 6 && digit != 8 && digit != 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    private static boolean isPalindrome(int n) {
        int reversedNum = 0;
        int original = n;
        while (n > 0) {
            int digit = n % 10;
            reversedNum = reversedNum * 10 + digit;
            n /= 10;
        }
        return original == reversedNum;
    }
}
