import java.util.Scanner;

public class Matrixmultiplication_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Nhập số hàng của ma trận A: ");
        int m = sc.nextInt();
        System.out.print("Nhập số cột của ma trận A (và số hàng của ma trận B): ");
        int n = sc.nextInt();
        System.out.print("Nhập số cột của ma trận B: ");
        int k = sc.nextInt();

        // Input matrices
        int[][] A = inputMatrix(sc, m, n, "A");
        int[][] B = inputMatrix(sc, n, k, "B");

        // Calculate the product matrix
        int[][] C = multiplyMatrices(A, B, m, n, k);

        // Print the result
        System.out.println("Ma trận tích C:");
        printMatrix(C);
    }

    private static int[][] inputMatrix(Scanner sc, int rows, int cols, String name) {
        int[][] matrix = new int[rows][cols];
        System.out.println("Nhập các phần tử của ma trận " + name + ":");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(name + "[" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }

    private static int[][] multiplyMatrices(int[][] A, int[][] B, int m, int n, int k) {
        int[][] C = new int[m][k];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                for (int l = 0; l < n; l++) {
                    C[i][j] += A[i][l] * B[l][j];
                }
            }
        }
        return C;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
