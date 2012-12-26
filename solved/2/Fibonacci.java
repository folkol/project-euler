public class Fibonacci {
    public static void main(String[] args) {
        int max = Integer.parseInt(args[0]);
        int[] terms = new int[3];
        terms[0] = 1;
        terms[1] = 2;
        int sum = 2; // 2
        while(true) {
            terms[2] = terms[0] + terms[1];
            if (terms[2] > max) break;
            if ( (terms[2] % 2) == 0) {
                // if term is even, add it to sum
                sum += terms[2];
            }
            terms[0] = terms[1];
            terms[1] = terms[2];
            System.out.print(terms[2] + " ");
        }
        System.out.println("The Fibonacci sum is: " + sum);
    }
}