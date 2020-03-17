import org.junit.Test;

import static org.junit.Assert.*;

public class TwoDArraysTest {

    @org.junit.Test
    public void sumAllPositive() {
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        assertEquals(45, TwoDArrays.sumAll(arr));
    }

    @org.junit.Test
    public void sumAllNegative() {
        int[][] arr = {{-1,-2,-3}, {-4,-5,-6}, {-7,-8,-9}};
        assertEquals(-45, TwoDArrays.sumAll(arr));
    }

    @org.junit.Test
    public void sumAllMixed() {
        int[][] arr = {{-1,-2,3}, {-4,5,-6}, {-7,-8,9}};
        assertEquals(-11, TwoDArrays.sumAll(arr));
    }


    @Test
    public void maxValuePositive() {
        int[][] arr = {{21, -4, 89}, {65, 33, 1}, {8, 3, 99}, {-2, 3, 1}};
        assertEquals(99, TwoDArrays.maxValue(arr));
    }

    @Test
    public void maxValueNegative() {
        int[][] arr = {{-21, -4, -89}, {-65, -33, -1}, {-8, -3, -99}, {-2, -3, -1}};
        assertEquals(-1, TwoDArrays.maxValue(arr));
    }

}