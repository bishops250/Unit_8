public class SpinnerGame {
    /** Precondition: min < max
     * Simulates a spin of a spinner by returning a random integer
     * between min and max, inclusive.
     */
    public int spin(int min, int max)

    {
        int result=(int)(Math.random()*(max-min+1)+min);

        return result;
    }
    /** Simulates one round of the game as described in part (b).
     */
    public void playRound() {

        int playerSpin = spin(1, 10);
        int computerSpin = spin(2, 8);
        int spinDifference = playerSpin - computerSpin;

        if (playerSpin > computerSpin) {
            System.out.println("You win! " + spinDifference + " points"); // all this code can simplified I can create
            // a string variable for winning or just a whole string.
        } else if (playerSpin < computerSpin) {
            System.out.println("You lose. " + spinDifference + " points");
        } else {

            int playerSpin2 = spin(1, 10);
            int playerSpinTotal = playerSpin + playerSpin2;
            int computerSpin2 = spin(2, 8);
            int computerSpinTotal = computerSpin + computerSpin2;
            int spin2Difference = playerSpinTotal - computerSpinTotal;
            if (playerSpinTotal > computerSpinTotal) {
                System.out.println("You win! " + 1 + " points");
            } else if (playerSpinTotal < computerSpinTotal) {
                System.out.println("You Lose! " + -1 + " points");
            } else {
                System.out.println("Tie. " + spin2Difference + " points");
            }

        }

    }
}
