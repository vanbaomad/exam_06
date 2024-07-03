public class SumNumDivisor7MinN_15 {
    public static int sum(int n){
        int s = 0;
        for (int i = 0; i <= n; i++) {
            if(i % 7 == 0){
                s += i;
            }
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.print("tong cac so chia het cho 7 la: "+sum(21));
    }
}
