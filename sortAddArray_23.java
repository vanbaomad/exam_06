import java.util.Scanner;

public class sortAddArray_23 {
    public static void main(String[] args) {
        int[] a = inputArray();
        sortArray(a);

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá trị thực x: ");
        int x = sc.nextInt();

        int[] result = insert_Sort(a, x);

        System.out.println("mang sau khi chen:");
        printArray(result);
    }
    private static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }
    private static void sortArray(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp =a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    private static int[] insert_Sort(int[] a, int x) {
        int[] newArray = new int[a.length + 1];
        int i = 0, j = 0;
        while (i < a.length && a[i] < x) {
            newArray[j++] = a[i++];
        }
        newArray[j++] = x;
        while (i < a.length) {
            newArray[j++] = a[i++];
        }
        return newArray;
    }
    private static void printArray(int[] a) {
        for (int j : a) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
