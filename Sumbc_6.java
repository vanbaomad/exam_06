import java.util.Scanner;

public class Sumbc_6 {
    public static void main(String[] args) {
           int[] a = input();
           int sum  = sum(a);
            System.out.println("tong cua cac phan tu la: "+sum);
    }
    private static int[] input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("nhap phan tu thu " + i + ": ");
            a[i] = sc.nextInt();
        }
        return a;
    }
    private static int sum(int[] a){
        int sum =0;
        System.out.print("nhap gt cua b: ");
        int b = new Scanner(System.in).nextInt();
        System.out.print("nhap gt cua c: ");
        int c = new Scanner(System.in).nextInt();
        for (int j : a){
            if (j >= b && j <= c){
                sum += j;
            }
        }
        return sum;
    }
}
