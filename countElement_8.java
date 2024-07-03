import java.util.Arrays;
import java.util.Scanner;

public class countElement_8 {
    public static void main(String[] args) {
        int[] a = input();
        count(a);

    }
    private static int[] input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("nhap phan tu thu " + i + ": ");
            a[i] = sc.nextInt();
        }
        return a;
    }
    private static void count(int[] a) {
        Arrays.sort(a);
        int max_count = 1;
        int count = 1;
        int same_element = a[0];
        int element = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] == element) {
                count++;
            } else {
                if (count > max_count) {
                    max_count = count;
                    same_element = element;
                }
                element = a[i];
                count = 1;
            }
        }

        if (count > max_count) {
            max_count = count;
            same_element = element;
        }

        System.out.println("Giá trị xuất hiện nhiều nhất là: " + same_element + " với số lần xuất hiện là " + max_count);
    }
}
