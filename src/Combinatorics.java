public class Combinatorics {

    /**
     * Precondition: n is between 1 and 12, inclusive.
     * Returns the factorial of n, as described in part (a).
     */
    public static int factorial(int n) { /* to be implemented in part (a) */

        if (n == 1) {
            return n;
        } else {
            return n = n * factorial(n - 1);  //this can be done much easier with recursive. Got it to work
            // Is there another way to do this. Also is this more efficient.
        }
    }


    /**
     * Precondition: n and r are between 1 and 12, inclusive. * Determines the number of ways r items can be selected
     * from n choices and prints the result, as described in part
     * (b).
     */
    public static void numCombinations(int n, int r) { /* to be implemented in part (b) */
        int factorialNum = factorial(n);

        int possibleCombinations = 0;

        if (r > factorialNum) {
            possibleCombinations = 0;
        } else if (r <= factorialNum) {
            possibleCombinations = (int) (Math.abs(n) / Math.abs(Math.abs(r) * (factorialNum - r)));
        }

        System.out.println("There are " + possibleCombinations + " items from " + r + " choices.");

    }
}
