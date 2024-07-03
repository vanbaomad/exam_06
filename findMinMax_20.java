import java.util.Scanner;

public class findMinMax_20 {
    public static void main(String[] args) {
        int[] a = inputArray();
        sortArray(a);
        System.out.println("-------");
        sortArray2(a);

    }
    private static int[] inputArray() {
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
    private static void sortArray(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("so min: "+a[0]);
        System.out.println("so max: "+a[a.length-1]);
    }
    private static void sortArray2(int[] a) {
        int max = a[0], min=a[0];
        for (int j : a){
            if (j>max){
                max = j;
            }
            if (j<min){
                min = j;
            }
        }
        System.out.println("so min: "+min);
        System.out.println("so max: "+max);
    }
}
