import java.util.Scanner;

public class SumArray_27 {
    public static void main(String[] args) {
        int n = inputSize();
        int[] a = inputArray(n, "a");
        int[] b = inputArray(n, "b");
        int[] result = sumArrays(a, b);
        printArray(result, "Resulting array");
    }

    private static int inputSize() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của các mảng: ");
        return sc.nextInt();
    }

    private static int[] inputArray(int n, String arrayName) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[n];
        System.out.println("Nhập các phần tử của mảng " + arrayName + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(arrayName + "[" + i + "]: ");
            array[i] = sc.nextInt();
        }
        return array;
    }

    private static int[] sumArrays(int[] a, int[] b) {
        int n = a.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = a[i] + b[n - 1 - i];
        }
        return result;
    }

    private static void printArray(int[] array, String arrayName) {
        System.out.println(arrayName + ":");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
