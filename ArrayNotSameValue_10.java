import java.util.Scanner;

public class ArrayNotSameValue_10 {
    public static void main(String[] args) {
            input();
    }
    private static void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int count = 0;
        while (count < n){
            System.out.print("nhap phan tu thu "+(count+1)+":");
            int num = sc.nextInt();
            if (contains(a,count ,num)){
                System.out.println("so da ton tai. Yeu cau nhap lai!");
            }else {
                a[count] =num;
                count++;
            }
        }
        System.out.println("day so co cac phan tu la");
        for (int j : a){
            System.out.print(j+" ");
        }
        System.out.println();
    }
    private static boolean contains(int[] a, int count, int num){
        for (int i = 0; i < count; i++) {
            if (a[i] == num) return true;
        }
        return false;
    }
}
