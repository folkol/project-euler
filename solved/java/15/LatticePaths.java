public class LatticePaths {
    static long[][] cache;
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        cache = new long[n+1][n+1];
        System.out.println("Ans: " + numRoutes(n, n));
    }

    static long numRoutes(int j, int k) {
        if(cache[j][k] != 0) {
            return cache[j][k];
        }
        if(j == 1) return k + 1;
        if(k == 1) return j + 1;
        long num = numRoutes(j-1, k) + numRoutes(j, k-1);
        cache[j][k] = num;
        return num;
    }
}