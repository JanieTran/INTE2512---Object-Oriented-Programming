package Week2_Loop_Array;

public class Lab2Ex4 {
    public static void main(String[] args) {
        int n = 50000;
        float sum = 0;

        for(int i = 1; i <= n; i++) {
            sum += 1.0/i;
        }
        System.out.println("From left to right: " + sum);

        sum = 0;
        for(int i = n; i >= 1; i--) {
            sum += 1.0/i;
        }
        System.out.println("From right to left: " + sum);
    }
}
