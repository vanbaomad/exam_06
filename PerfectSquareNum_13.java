import java.util.Scanner;

public class PerfectSquareNum_13 {
    public static boolean isPerfeectSquare(int n){
        int sqrt = (int) Math.sqrt(n);
        return sqrt*sqrt == n;
    }
    public static void main(String[] args) {
        System.out.print("nhap n: ");
        int n = new Scanner(System.in).nextInt();

        System.out.print("nhap m(m<n): ");
        int m = new Scanner(System.in).nextInt();
        int count = 0;
        for (int i = m; i <= n; i++) {
            if (isPerfeectSquare(i)){
                System.out.print(i+ " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("so luong thoa man la: "+ count);
    }
}
