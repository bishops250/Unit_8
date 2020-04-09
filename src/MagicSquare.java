import java.util.ArrayList;
import java.util.Arrays;

/**
 *                                                      MagicSquare-Class
 * Descriptions:
 *  * The Java class "MagicSquare" includes one constructor and no static methods, but 6 methods. "MagicSquare"
 *  * class takes one parameter, which is a 2D Array containing user values. The "MagicSquare" class contains 6 methods
 * @author Aron D. Bishop
 * @version 1.0
 * @since April 6, 2020
 *
 *
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


    /**
     * 
     * @param row
     * @return
     */
    public int rowSum(int row) {

        int total=0;
      for(int column=0; column<grid[row].length;column++) {
          total+=grid[row][column];
            }
      return total;
        }

    /**
     *
     * @param col
     * @return
     */
    public int colSum(int col) {

        int total=0;
        for(int row=0; row<grid.length;row++) {
            total+=grid[row][col];
        }
        return total;
    }

    /**                                         upDiagSum-Method
     *
     * The upDiagSum method assumes all the array and columns are lined up similar to square.
     * This method then finds the diagonal numbers going upwards in the square(Array)
     * and then returns the total.
     *
     * @return  returns the sum of numbers in a diagonal going upwards.
     */
    public int upDiagSum() {

        int total = 0;
        for (int row = 0; row < grid.length; row++) {
            int col = grid.length - row - 1;
            total += grid[row][col];
        }
        return total; //returns the same of the diagonal numbers going upwards.
    }

    /**
     *                                          downDiagSum-Method
     *
     * The downDiagSum method assumes all the array and columns are lined up similar to square.
     * This method then finds the diagonal numbers going downward in the square(Array)
     * and then returns the total.
     *
     * @return returns the sum of numbers in a diagonal going downwards.
     */
    public int downDiagSum() {

        int total=0;
            for (int row = 0; row < grid.length; row++) { //each iteration moves over one column and one row.
                total += grid[row][row];
            }
            return total; //returns the same of the diagonal numbers going downwards.
    }

    /**
     *                                              IsMagicSquare-Method
     *
     * The "IsMagicSquare" method
     *
     * @return "IsMagicSquare method" returns true if array is "MagicSquare" and false if it is not.
     */
    public boolean isMagicSquare() {


       int testNum = upDiagSum(); /* sets "testNum" as value returned from the method "upDiagSum()"
I then use the up diagonal sum to test against sum of rows, diagonals, columns, etc. */

       ArrayList<Integer>resultArray= new ArrayList<>(Arrays.asList(downDiagSum())); /* stores the
       sum of diagonal up, row, and column. Each sum is individually listed with an index.*/

       for(int row=0;row<grid.length;row++) { //adds the rowsum of each row to the array.
           resultArray.add(rowSum(row));
       }

           for(int column=0;column<grid.length;column++) { //adds the column sum of each column to the array.
               resultArray.add(colSum(column));
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

