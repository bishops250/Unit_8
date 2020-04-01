public class ArrayCalculations {

    public static int rowSum(int[][] arr, int row) {
        // create a variable to keep track of the total

        int total=0;
        boolean varValid=false;

        /* how could I write the check so It works in all situations. If the one works and the other does'nt It won't
        detect it. Or will It?*/

        for(int i=0; i<arr.length && i!=row;i++) {
            if(row==i) {
                for(int column=0; column<arr[i].length; column++) {
                    total+=arr[i][column];
                    varValid=true;
                }
            }


        }
        return varValid ? total:-1 ;
        // check to see if the given row variable is valid.
// If the row is less than 0 or is greater than
        // the number of rows it is not valid. Return -1 if not valid.



        // if row is valid, create a loop to calculate the sum. hint:
// elements in a 2D array are found like
// this arr[row][column]. If you are finding the sum of a row,
// the [row] number will not change
// only the [column] part will.


// return the total
    }

    public static int columnSum(int[][] arr, int col) {
        // create a variable to keep track of the total

        int total=0;
        boolean varValid=false;

        for(int i=0; i<arr.length; i++) {
            for(int column=0;column<arr[i].length ;column++) {/*&& column!=col I believe this might cause an error
            temp removing the statement.*/
                if(column==col) {
                    total+=arr[i][column];
                    varValid=true;
                }

            }

        }
return varValid ? total: -1 ;//Does this Ternary Operator work?????

        // check to see if the given col variable is valid.
// If col is less than 0 or is greater than
        // the number of columns (the length of one array) it is not valid.
// Return -1 if not valid.



        // if col is valid, create a loop to calculate the sum. hint:
// elements in a 2D array are found like
// this arr[row][column]. If you are finding the sum of a col,
// the [column] number will not change
// only the [row] part will.


// return the total

    }

    public static int diagonalSum(int[][] arr, int direction) {

        int total=0;
        boolean varValid=false;

        if(direction == 1 || direction==0) {
            if(direction==1) { //This is one and it indicated up diagonal
                for(int row=arr.length-1;row>0;row--) { //how can be written when row and column are not equal??????
                    for(int column=row;column>0 ;column--) {

                        if(column==row) {
                            total+=arr[row][column];
                            varValid=true;
                        }
                    }
                }
            }
            /* This whole black of code Contained in the "else statement" I believe can be simplified to only
            for(int row=0; row<arr.length;row++) {
            total+=arr[row][row]

             */
            else { //This is Zero it indicated down diagonal
                for(int row=0;row<arr.length;row++) { //how can be written when row and column are not equal??????
                    for(int column=row;column<arr[row].length ;column++) {

                        if(column==row) {
                            total+=arr[row][column];
                            varValid=true;
                        }
                    }
                }

            }
        }

        return varValid ? total: -1;
    }



}
