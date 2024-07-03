import java.util.Scanner;

public class MovetoArray_22 {

    public static void main(String[] args) {
        int[] a = inputArray();
        System.out.print("nhap vi tri can xoa: ");
        int k = new Scanner(System.in).nextInt();
        if (k < 0 || k > a.length) {
            System.out.println("Vi tri khong hop le!");
        } else {
            int[] newArray = moveElement(a, k);
            System.out.println("Mang moi:");
            printArray(newArray);
        }
    }
    private static int[] moveElement(int[] a, int k) {
        int[] newArray = new int[a.length - 1];
        for (int i = 0, j = 0; i < a.length; i++) {
            if (i != k) {
                newArray[j++] = a[i];
            }
        }
        return newArray;
    }
    private static void printArray(int[] a) {
        for (int j : a) {
            System.out.print(j + " ");
        }
        System.out.println();
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
}
