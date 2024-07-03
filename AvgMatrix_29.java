import java.util.Scanner;

public class AvgMatrix_29 {
    public static void main(String[] args) {
        int[][] a = input();
        double b = avgMatrix(a);
        System.out.println(b);
    }
    private static int[][] input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        int n = sc.nextInt();
        System.out.print("Nhập số cột: ");
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("a[" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }
        return a;
    }
    private static double avgMatrix(int[][] a){
        double sum =0.0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                sum += a[i][j];
            }
        }
        return (double) sum /(a.length*a[0].length);
    }
}
