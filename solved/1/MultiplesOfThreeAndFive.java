public class MultiplesOfThreeAndFive {
    public static void main(String[] args) {
        int max = Integer.parseInt(args[0]);
        int sum = 0;
        for(int c = 0; c < max; c++) {
            if ( (c % 3) == 0 || (c % 5) == 0 ) {
                sum += c;
            }
        }
        System.out.println("The sum is: " + sum);
    }
}
