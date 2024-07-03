public class SumCalculationList_14 {
    public static double sum(int n){
        double s =0;
        if (n == 0){
            return  0;
        }
        for (int i = 1; i < n; i++) {
            s += (double) 1 /i;
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println(sum(8));
    }
}
