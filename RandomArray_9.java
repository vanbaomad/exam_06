import java.util.*;

public class RandomArray_9 {
    public static void main(String[] args) {
        int[] a = input();
        printArray(a);
        printUniqueElements(a);

    }
    private static int[] input(){
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = new Scanner(System.in).nextInt();
        Random rd = new Random();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = rd.nextInt(100);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        return a;
    }
    private static void printArray(int[] a) {
        System.out.print("Mang duoc tao ngau nhien:");
        for (int j : a) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    private static void printUniqueElements(int[] a) {
        Set<Integer> uniqueElements = new HashSet<>();
        for (int num : a) {
            uniqueElements.add(num);
        }

        System.out.print("Cac phan tu khac nhau trong mang: ");
        for (int num : uniqueElements) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
