import java.util.Scanner;

public class CoprimeNum_17 {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static boolean areCoprime(int m, int n) {
        return gcd(m, n) == 1;
    }

    public static void main(String[] args) {
        System.out.print("nhap gia tri n: " );
        int n = new Scanner(System.in).nextInt();
        System.out.print("nhap gia tri m: " );
        int m = new Scanner(System.in).nextInt();
        if (areCoprime(n,m)){
            System.out.println("2 so la 2 so nguyen to cung nhau");
        }else {
            System.out.println("khong la 2 so nguyen to cung nhau");
        }
    }
}
