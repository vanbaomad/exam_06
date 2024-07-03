import java.util.Scanner;

public class MatrixCV_11 {
    public static void main(String[] args) {
        int[][] a = input();
        System.out.println("Ma trận gốc:");
        printMatrix(a);
        System.out.println("Ma trận chuyển vị:");
        printMatrix(TranSpose(a));
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

    private static int[][] TranSpose(int[][] a) {
        int[][] b = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                b[j][i] = a[i][j];
            }
        }
        return b;
    }

    private static void printMatrix(int[][] a) {
        for (int[] row : a) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
