import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TwoDArraysTestDay2 {

    @Test
    public void isASquare() {
        int[][] arr = {{1, 2, 3, 4}, {6, 2, 5, 3}, {9, 0, 1, 7}, {3, 1, 8, 6}};

        assertEquals(true, TwoDArrays.isSquare(arr));
    }

    @Test
    public void isNotASquare() {
        int[][] arr = {{1, 6, 4}, {6, 2, 1}};
        assertEquals(false, TwoDArrays.isSquare(arr));
    }
}
