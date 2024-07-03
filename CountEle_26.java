import java.util.Scanner;

public class CountEle_26 {
    private static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    private static int countEle(int[] a, int x) {
        int count = 0;
        for (int num : a) {
            if (num == x) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = inputArray();
        System.out.print("nhap gt tri x: ");
        int x = new Scanner(System.in).nextInt();
        int count = countEle(a,x);
        System.out.println(count);
    }
}
