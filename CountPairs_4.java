import java.util.Scanner;

public class CountPairs_4 {
    public static void main(String[] args) {
        int[] a = input();
        int count = countPairs(a);
        System.out.println("so cap phan tu lien tiep la: "+count);

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
    private static int countPairs(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i+1]) count++;
        }
        return count;
    }
}
