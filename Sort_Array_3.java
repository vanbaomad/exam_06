import java.util.Arrays;
import java.util.Scanner;

public class Sort_Array_3 {
    public static void main(String[] args) {
        int[] mang = input();
        sortArray(mang);
        System.out.println("Mang sau khi sap xep: "+ Arrays.toString(mang));
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

    private static int[] input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }


}
