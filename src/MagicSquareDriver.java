public class MagicSquareDriver {

    public static void main(String[] args) {
        MagicSquare m1 = new MagicSquare( new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,17}});
        System.out.println("-------- magic square example 1 --------");
        m1.printGrid();
        System.out.println("row sum 0 = " + m1.rowSum(0));
        System.out.println("row sum 1 = " + m1.rowSum(1));
        System.out.println("row sum 2 = " + m1.rowSum(2));
        System.out.println("row sum 3 = " + m1.rowSum(3));
        System.out.println("col sum 0 = " + m1.colSum(0));
        System.out.println("col sum 1 = " + m1.colSum(1));
        System.out.println("col sum 2 = " + m1.colSum(2));
        System.out.println("col sum 3 = " + m1.colSum(3));
        System.out.println("up diagonal sum = " + m1.upDiagSum());
        System.out.println("down diagonal sum = " + m1.downDiagSum());
        System.out.println("Magic Square: " + m1.isMagicSquare() + "\n"); // Should be False

        MagicSquare m2 = new MagicSquare( new int[][] {{7,12,1,14},{2,13,8,11},{16,3,10,5},{9,6,15,4}});
        System.out.println("-------- magic square example 2 --------");
        m2.printGrid();
        System.out.println("row sum 0 = " + m2.rowSum(0));
        System.out.println("row sum 1 = " + m2.rowSum(1));
        System.out.println("row sum 2 = " + m2.rowSum(2));
        System.out.println("row sum 3 = " + m2.rowSum(3));
        System.out.println("col sum 0 = " + m2.colSum(0));
        System.out.println("col sum 1 = " + m2.colSum(1));
        System.out.println("col sum 2 = " + m2.colSum(2));
        System.out.println("col sum 3 = " + m2.colSum(3));
        System.out.println("up diagonal sum = " + m2.upDiagSum());
        System.out.println("down diagonal sum = " + m2.downDiagSum());
        System.out.println("Magic Square: " + m2.isMagicSquare() + "\n"); // Should be True

        System.out.println("-------- magic square example 3 --------");
        MagicSquare m6 = new MagicSquare( new int[][] {{8,58,59,5,4,62,63,1}, {49, 15, 14, 52, 53, 11, 10, 56},
                {41, 23, 22, 44, 45, 19, 18, 48}, {32, 34, 35, 29, 28, 38, 39, 25},
                {40, 26, 27, 37, 36, 30, 31, 33}, {17, 47, 46, 20, 21, 43, 42, 24},
                {9, 55, 54, 12, 13, 51, 50, 16}, {64, 2, 3, 61, 60, 6, 7, 57 }});
        m6.printGrid();
        System.out.println("Magic Square: " + m6.isMagicSquare() + "\n"); // Should be True

        System.out.println("-------- magic square example 4 --------");
        MagicSquare m7 = new MagicSquare( new int[][] {{8,58,59,5,4,62,63,1}, {49, 15, 14, 52, 53, 11, 10, 56},
                {41, 23, 22, 44, 45, 19, 18, 48}, {32, 34, 35, 29, 28, 38, 39, 25},
                {40, 26, 27, 37, 36, 30, 31, 33}, {17, 47, 46, 20, 21, 43, 42, 57},
                {9, 55, 54, 12, 13, 51, 50, 16}, {64, 2, 3, 61, 60, 6, 7, 24 }});
        m7.printGrid();
        System.out.println("Magic Square: " + m7.isMagicSquare() + "\n"); // Should be False
    }
}
