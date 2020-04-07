import java.util.ArrayList;
import java.util.Arrays;

/**
 *                                                      MagicSquare-Class
 * @author Aron D. Bishop
 * @version 1.0
 * @since April 6, 2020
 *
 *Descriptions:
 * The Java class "MagicSquare" includes one constructor and no static methods, but 6 methods. "MagicSquare"
 * class takes one parameter, which is a 2D Array containing user values. The "MagicSquare" class contains 6 methods
 */
public class MagicSquare {
    private int[][] grid; //Instance variable containing the 2D Array that is supposedly a "MagicSquare"

    /**
     *                                              MagicSquare-Constructor
     *
     * @param g g is the local parameter storing the user entered 2D Array. This Value is then passed to
     *          instant variable called "grid".
     */
    public MagicSquare(int[][] g) {
        grid = g;
    }


    public int rowSum(int row) {
        // <<< Complete the code >>>
        int total=0;
      for(int column=0; column<grid[row].length;column++) {
          total+=grid[row][column];
            }
      return total;
        }


    public int colSum(int col) {
        // <<< Complete the code >>>
        int total=0;
        for(int row=0; row<grid.length;row++) {
            total+=grid[row][col];
        }
        return total;
    }

    /** upDiagSum-Method
     *
     * @return
     */
    public int upDiagSum() {
        // <<< Complete the code >>>
        int total = 0;
        for (int row = 0; row < grid.length; row++) {
            int col = grid.length - row - 1;
            total += grid[row][col];
        }
        return total;
    }


    public int downDiagSum() {
        // <<< Complete the code >>>
        int total=0;
            for (int row = 0; row < grid.length; row++) { 
                total += grid[row][row];
            }
            return total;
    }


    public boolean isMagicSquare() {
        // <<< Complete the code >>>

       int testNum = upDiagSum(); /* sets "testNum" as value returned from the method "upDiagSum()"
I then use the up diagonal sum to test against sum of rows, diagonals, columns, etc. */

       ArrayList<Integer>resultArray=new ArrayList<Integer>(Arrays.asList(downDiagSum())); /* stores the
       sum of diagonal up, row, and column. Each sum is individually listed with an index.*/

       for(int row=0;row<grid.length;row++) { //adds the rowsum of each row to the array.
           resultArray.add(rowSum(row));
       }
       for(int row2=0;row2<grid.length;row2++) {
           for(int column=0;column<grid[row2].length;column++) { //adds the column sum of each column to the array.
               resultArray.add(grid[row2][column]);
           }
       }

       for(int traverse:resultArray) { //traverses the "resultArray"
           if(testNum!=traverse) { //returns false if testNum does not equal the traverse variable.
               return false;
           }
       }
       return true; //returns true if testNum equals all the values of the "resultArray".
    }


    /**
     * This method is complete. You do not need to provide additional
     * comments here.
     */
    public void printGrid() {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println();
        }
    }
}

