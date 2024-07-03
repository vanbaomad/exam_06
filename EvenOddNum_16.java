import java.util.Scanner;

public class EvenOddNum_16 {
    public static void isOdd(int n){
        for (int i = 1; i <= n ; i+=2) {
            System.out.print(i+" ");
        }
    }
    public static void isEven(int n){
        for (int i = 0; i <= n ; i+=2) {
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        System.out.print("nhap gt n: ");
        int n = new Scanner(System.in).nextInt();
        isEven(n);
        System.out.println();
        isOdd(n);
    }
}
