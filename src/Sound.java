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
            } else if (samples[i] < limit * -1) {
                samples[i] = limit * -1;
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

        int zerosToCut = 0;

        for (int i = 0; i < samples.length - 1; i++) {
            if (samples[i] == 0 && samples[i + 1] != 0 || samples[i] != 0 && samples[i + 1] == 0) {
                zerosToCut++;
                break;
            } else if (samples[i] == 0 && samples[i + 1] == 0) {
                zerosToCut++;
            }
        }
        int arrayToBecomeSamples[] = new int[samples.length - zerosToCut];
        for (int i2 = 0; i2 < arrayToBecomeSamples.length; i2++) {
            for (int count = zerosToCut; count < samples.length; count++) {
                arrayToBecomeSamples[i2] = samples[count];
                break;
            }
        }
        samples = arrayToBecomeSamples;
    }

    /**
     * accessor method used for testing purposes - Not part of original program
     */
    public int[] getSamples() {
        return samples;
    }
}
