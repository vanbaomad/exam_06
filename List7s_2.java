public class List7s_2 {
    public static void main(String[] args) {
        for (int i = 1000000; i < 9999999 ; i++) {
            if (isPrime(i) && reversedPrime(i) && allPrime(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean allPrime(int i) {
        int n = i ;
        while ( n >0 ){
            int digit = n % 10;
            if (!isPrime(digit)){
                return false;
            }
            n /= 10;
        }
        return true;
    }

    private static boolean reversedPrime(int n) {
        int reversed = 0;
        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return isPrime(reversed) ;
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        double m = Math.sqrt(n);
        for (int i = 2; i <= m; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
