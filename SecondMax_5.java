import java.util.Scanner;

public class SecondMax_5 {
    public static void main(String[] args) {
        int[] a = input();
        if (check(a)) {
            System.out.println("Không có số lớn thứ 2");
            return;
        }
        int max = findMax(a);
        findSecond(a, max);
    }

    private static int[] input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }

    private static int findMax(int[] a) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    private static void findSecond(int[] a, int max) {
        int second = Integer.MIN_VALUE;
        int place = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > second && a[i] != max) {
                second = a[i];
                place = i;
            }
        }
        if (place == -1) {
            System.out.println("Không có số lớn thứ 2");
        } else {
            System.out.println("Số lớn thứ 2 là: " + second + " tại vị trí thứ: " + place);
        }
    }

    private static boolean check(int[] a) {
        int first = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] != first) {
                return false;
            }
        }
        return true;
    }
}
