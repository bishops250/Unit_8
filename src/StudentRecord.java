public class StudentRecord {

    private int[] scores; // contains scores.length values. scores.length > 1

    public StudentRecord(int[] scores) {
        this.scores = scores;
    }

    /**
     * Returns the average (arithmetic mean) of the values in scores
     * whose subscripts are between first and last, inclusive
     * precondition: 0 <= first <= last < scores.length
     * Method is marked public for testing purposes.
     */
    public double average(int first, int last) {
        /* to be implemented in part (a) */
        double total = 0;
        int totalElements = 0;
        for (int i = first; i <= last; i++) {
            total += scores[i];
            totalElements++;
        }
        return total /= totalElements;
    }

    /**
     * Returns true if each successive value in scores is greater
     * than or equal to the previous value;
     * otherwise, returns false
     * Method marked public for testing purposes.
     */
    public boolean hasImproved() {
        /* to be implemented in part (b) */
        int testNum = scores[0];
        for (int i = 0; i < scores.length - 1; i++) { //THIS MIGHT BE AN ISSUE WITH ITERATING
            if (testNum <= scores[i + 1]) {
                testNum = scores[i + 1];
            } else if (testNum > scores[i + 1]) { // this is redudent?cause if its not equal to or less than it has to be greater
                return false;
            }

        }
        return true;
    }

    /**
     * If the values in scores have improved, returns the average of the elements in scores
     * with indexes greater than or equal to scores.length/2;
     * otherwise, returns the average of all the values in scores
     */
    public double finalAverage() {
        /* to be implemented in part (c) */
        if (hasImproved()) {
            return average(scores.length / 2, scores.length - 1);
        }
        return average(0, scores.length - 1);
    }
}
