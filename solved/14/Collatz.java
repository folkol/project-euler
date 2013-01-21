import java.util.*;

public class Collatz {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        long maxLength = 0;
        int j = 0;
        for(int i = 1; i <= n; i++) {
            long size = chainLength(i);
            if(size > maxLength) {
                j = i;
                maxLength = size;
            }
        }
        System.out.println("Max length is: " + maxLength + ", produced by j = " + j);
    }

    static long chainLength(long n) {
        if(n == 1) return 1;

        if((n % 2) == 0) {
            return 1 + chainLength(n / 2);
        } else {
            return 1 + chainLength((n * 3) + 1);
        }
    }
}