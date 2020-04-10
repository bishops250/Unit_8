import java.util.ArrayList;
import java.util.Arrays;

/**
 *                                                      MagicSquare-Class
 *
 * Descriptions:
 *
 * The Java class "MagicSquare" includes one constructor and no static methods, but 6 methods.
 * The "MagicSquare" class takes one parameter, which is a 2D Array containing user values.
 * The "MagicSquare" class contains methods to determine sum of the rows, columns, diagonals, or whether
 * the 2D array itself is a Magic square. A magic square is defined as an arrangement of names in a
 * square grid. The square most have the same number of rows and columns. Furthermore, each row, column,
 * and the numbers in the up and down main diagonals most have the same sum. A magic square has the
 * same number of rows as it has columns.
 *
 *
 * @author Aron D. Bishop
 * @version 1.0
 * @since April 6, 2020
 *
 *
 */
public class MagicSquare {
    private int[][] grid; // private instance variable containing the 2D Array that is supposedly a "MagicSquare"

    /**
     *                                              MagicSquare-Constructor
     *
     *This is one MagicSquare constructor. It requires one 2D Array as a parameter. The constructor passes
     *the parameter to a private instance variable.
     *
     *
     * @param g g is the local parameter storing the user entered 2D Array. This Value is then passed to
     *          instant variable called "grid".
     */
    public MagicSquare(int[][] g) {
        grid = g;
    }


    /**
     *                                              rowSum-Method
     *
     * The rowSum method requires one parameter called "row". The row parameter determines which row(array)
     * we will be finding the sum of all the numbers in the row. All numbers in the specified row(array)
     * will be added to a variable called total and then returned.
     *
     * @param row the row parameter determines which row(array) we will finding the sum of numbers of.
     *
     * @return returns the variable total, which stores the sum of numbers in specified array(row).
     */
    public int rowSum(int row) {

        int total=0; //stores the sum of all numbers in specified array.
      for(int column=0; column<grid[row].length;column++) { //iterates through all the columns in a given row.
          total+=grid[row][column];
            }
      return total; //returns the sum of the row specified.
        }

    /**
     *                                              colSum-Method
     *
     *The colSum method requires one parameter called "column". The column parameter determines, which
     * index to we will be finding the sum of all the numbers. All numbers in column will be added to
     * a variable called total and then returned.
     *
     *
     * @param col the col parameter determines which column(index) we will be finding the sum of.
     *
     * @return returns the variable total, which stores the sum of numbers in specified column.
     */
    public int colSum(int col) {

        int total=0;
        for(int row=0; row<grid.length;row++) { //iterates through all the rows.
            total+=grid[row][col];
        }
        return total; //returns the sum of column specified.
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
     * The "IsMagicSquare" method determines whether a 2D array meets a criteria to be a "Magic Square".
     * A "Magic Square" is considered an arrangment of number in a square. Whose diagonal sum, row sum,
     * and column sum equal the same number. Furthermore, there must be the same amount of rows and columns
     * to be a "Magic Square" if 2D array meets all the criteria then 2D array is a MagicSquare. This method
     * will return true if 2D array is a "Magic Square" and false if not.
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

