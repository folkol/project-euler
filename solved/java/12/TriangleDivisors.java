public class TriangleDivisors {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = 1;
        int nextTriangularNumber = 1;
        while(numDivisors(nextTriangularNumber) < n) {
            k++;
            nextTriangularNumber += k;
        }
        System.out.println("Numvidisors of " + nextTriangularNumber + " is " + numDivisors(nextTriangularNumber));
    }

    static int numDivisors(int n) {
        int sqrt = (int)Math.sqrt((double)n);
        int numDivs = 0;
        for(int c = 1; c < sqrt; c++) {
            if ((n % c) == 0) {
                numDivs += 2; // n = c * x, add c and x
            }
        }
        return numDivs;
    }
}