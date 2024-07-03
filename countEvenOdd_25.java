import java.util.Scanner;

public class countEvenOdd_25 {
    public static void main(String[] args) {
        int[] a = inputArray();
        int[] counts = countOddEven(a);
        System.out.println("Số lượng số chẵn: " + counts[0]);
        System.out.println("Số lượng số lẻ: " + counts[1]);

    }
    private static int[] countOddEven(int[] a) {
        int countEven = 0;
        int countOdd = 0;
        for (int num : a) {
            if (num % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        return new int[]{countEven, countOdd};
    }
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
}
