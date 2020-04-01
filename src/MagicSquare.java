public class MagicSquare {
    private int[][] grid;

    public MagicSquare(int[][] g) {
        grid = g;
    }


    public int rowSum(int row) {
        // <<< Complete the code >>>
        int total=0;
        for(int rowIteration=0;rowIteration<row;rowIteration++) {
            if(rowIteration!>grid[row].length) {

            }
        }
    }


    public int colSum(int col) {
        // <<< Complete the code >>>
    }


    public int upDiagSum() {
        // <<< Complete the code >>>
    }


    public int downDiagSum() {
        // <<< Complete the code >>>
    }


    public boolean isMagicSquare() {
        // <<< Complete the code >>>
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
            System.out.println("");
        }
    }
}

