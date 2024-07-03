import java.util.Scanner;

public class MatrixSumDiagonal_28 {
    private static int DiagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }
    private static int[][] input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so hang & cot: ");
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("a[" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[][] a = input();
        int sum= DiagonalSum(a);
        System.out.println(sum);
    }

}
