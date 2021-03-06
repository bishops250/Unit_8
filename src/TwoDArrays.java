

public class TwoDArrays {

    public static int maxValue(int[][] list) {
        int maxNum = list[0][0];
        for(int row=0; row<list.length;row++) {
            for(int column=0;column<list[row].length;column++) {
                if(maxNum<list[row][column]) {
                    maxNum=list[row][column];
                }
            }
        }
        return maxNum;
    }

    public static int sumAll(int[][] arr) {
        int sum=0;
        for(int[]row:arr) {
            for(int column: row) {
                sum +=column;
            }
        }
        return sum;
    }

    public static boolean isSquare(int[][] arr) {
        int rowLength= arr.length;
        for(int row = 0; row<arr.length;row++) {
            for(int column=0; column<arr[row].length;column++) {
                if(rowLength!=arr[row].length) {
                    return false;
                }
            }
        }
        return true;
    }


}
