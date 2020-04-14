public class Hailstone {

    /** Returns the length of a hailstone sequence that starts with n,
     * as described in part (a).
     * Precondition: n > 0
     */
    public static int hailstoneLength(int n) {
        /* to be implemented in part (a) */
        int count = 0;
        int currentNum = n;
        while (true) { //could I possibly say if n!=1 or maybe I could use a do while

            if (currentNum == 1) {
                count++;
                break;
            } else if (currentNum % 2 == 0) {
                currentNum/=2;
                count++;

            } else if (currentNum % 1 == 0) {
                currentNum*=3;
                currentNum+=1;
                count++;
            }
        }
        return count;

    }


    /** Returns true if the hailstone sequence that starts with n is considered long
     * and false otherwise, as described in part (b).
     * Precondition: n > 0
     */
    public static boolean isLongSeq(int n) {
        /* to be implemented in part (b) */
        int results=hailstoneLength(n);
        return results > n; // is this necessary could i just say results>=n

    }


    /** Returns the proportion of the first n hailstone sequences that are considered long,
     * as described in part (c).
     * Precondition: n > 0
     */
    public static double propLong(int n) {
        /* to be implemented in part (c) */

        int totalTrue=0;

        for(int i=1;i<n;i++) {
            if(isLongSeq(i)) {
                totalTrue++;
            }
        }
        //This before was the it was doing integer division. Just cast double
        return ((double)totalTrue/n);
    }


    // There may be instance variables, constructors, and methods not shown.
}
