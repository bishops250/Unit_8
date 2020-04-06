import java.util.ArrayList;
import java.util.Arrays;

public class MagicSquare {
    private int[][] grid;

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
            for (int row = 0; row < grid.length; row++) { //how can be written when row and column are not equal??????
                total += grid[row][row];
            }
            return total;
    }


    public boolean isMagicSquare() {
        // <<< Complete the code >>>

       int testNum = upDiagSum();
       ArrayList<Integer>resultArray=new ArrayList<Integer>(Arrays.asList(downDiagSum()));

       for(int row=0;row<grid.length;row++) {
           resultArray.add(rowSum(row));
       }
       for(int row2=0;row2<grid.length;row2++) {
           for(int column=0;column<grid[row2].length;column++) {
               resultArray.add(grid[row2][column]);
           }
       }

       for(int traverse:resultArray) {
           if(testNum!=traverse) {
               return false;
           }
       }
       return true;
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

