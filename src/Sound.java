public class Sound {

    /**
     * the array of values in this sound; guaranteed not to be null
     */
    private int[] samples;

    /**
     * constructor created for testing purposes
     * Not part of original problem
     */
    public Sound(int[] samples) {
        this.samples = samples;
    }

    /**
     * Changes those values in this sound that have an amplitude greater than limit.
     * Values greater than limit are changed to limit.
     * Values less than -limit are chhanged to -limit.
     *
     * @param limit the amplitude limit
     *              Precondition limit >= 0
     * @return the number of values in this sound that this method changed.
     */
    public int limitAmplitude(int limit) {

        int numChanged = 0;

        for (int i = 0; i < this.samples.length; i++) {
            if (samples[i] > limit) {
                samples[i] = limit;
                numChanged++;
            } else if (samples[i] < limit) {
                samples[i] = limit;
                numChanged++;
            }
        }
        return numChanged;
    }

    /**
     * Removes all silence from the beginning of this sound.
     * Silence is represented by a value of 0;
     * Precodition: samples contains at least one nonzero value
     * Postcondition: the length of samples reflects the removal of starting silence
     */
    public void trimSilenceFromBeginning() {


        // How do we do things you can't delete an array we must create a new array
 /*       for(int i= samples.length;i>0;i--) {
            if(samples[i]==0) {

            }
        }
*/
        int numOfZeros=0;
        for(int i=0;i<samples.length;i++) {
            if(samples[i]==0) {
                numOfZeros++;
            }
        }
        int arrayToBecomeSamples[]=new int[samples.length-numOfZeros];
        int indexOfNewNum=0;
        for(int i2=0;i2<samples.length && indexOfNewNum!=arrayToBecomeSamples.length-1;i2++) {

            if(samples[i2]!=0) {
                arrayToBecomeSamples[indexOfNewNum]=samples[i2];
                indexOfNewNum++;
            }
        }
        this.samples=arrayToBecomeSamples;
    }

    /**
     * accessor method used for testing purposes - Not part of original program
     */
    public int[] getSamples() {
        return samples;
    }
}
