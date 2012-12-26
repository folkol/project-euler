import java.util.*;

public class Prime {
    public static List<Integer> factorize(int n) {
        List<Integer> primes = generatePrimes(n);
        List<Integer> factors = new ArrayList<Integer>();
        for(Integer p : primes) {
            while((n % p) == 0) {
                n /= p;
                factors.add(p);
            }
        }
        return factors;
    }

    private static List<Integer> generatePrimes(int n) {
        List<Integer> primes = new ArrayList<Integer>();
        BitSet sieve = new BitSet((int)n + 1);

        for(int c = 2; c <= n; c++) {
            if(sieve.get(c)) {
                continue;
            }
            primes.add(c);
            int i = c + c;
            while(i <= n) {
                if((i % c) == 0) {
                    sieve.set(i);
                }
                i += c;
            }
        }
        return primes;
    }
}