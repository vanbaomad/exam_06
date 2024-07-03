import java.util.Scanner;

public class AddtoArray_21 {
    public static void main(String[] args) {
        int[] a = inputArray();
        System.out.print("nhap gia tri can chen: ");
        int x = new Scanner(System.in).nextInt();
        System.out.print("nhap vi tri can chen: ");
        int k = new Scanner(System.in).nextInt();
        if (k < 0 || k > a.length) {
            System.out.println("Vị trí chèn không hợp lệ!");
        } else {
            int[] newArray = addElement(a, x, k);
            System.out.println("Mang moi:");
            printArray(newArray);
        }
    }
    private static int[] addElement(int[] a, int x, int k) {
        int[] newArray = new int[a.length + 1];
        for (int i = 0; i < k; i++) {
            newArray[i] = a[i];
        }
        newArray[k] = x;
        for (int i = k; i < a.length; i++) {
            newArray[i + 1] = a[i];
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
