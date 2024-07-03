import java.util.Scanner;

public class ReversedArray_7 {
    public static void main(String[] args) {
            int[] a = input();
            if (checkArray(a)){
                System.out.println("ham doi xung");
            }else {
                System.out.println("ham khong doi xung");
            }
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
    private static boolean checkArray(int[] a){
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i] != a[n-i-1]) return false;
        }
        return true;
    }

}
