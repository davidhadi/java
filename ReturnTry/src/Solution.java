
public class Solution {
    private static boolean isNumberRow(int[][] board, int number, int row){
        for(int i = 0; i<GRID_VALUE; i++){
            if(board[row][i] == number){
                return true;
            }
        }
        return false;
    }

    private static boolean isNumberColumn(int[][] board, int number, int Column){
        for(int i = 0; i<GRID_VALUE; i++){
            if(board[i][Column] == number){
                return true;
            }
        }
        return false;
    }

    private static boolean isNumberBox(int[][] board, int number, int row, int Column){
        int RowNum = row - row%3;
        int ColNum = Column - Column%3;

        for(int i = RowNum; i < RowNum+3; i++){
            for(int j = ColNum; j < ColNum+3; j++){
                if(board[i][j] == number){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isValidPlace(int[][] board, int number, int row, int Column){
        return !isNumberRow(board, number, row) &&
               !isNumberColumn(board, number, Column) &&
               !isNumberBox(board, number, row, Column);

    }

    private static  boolean SolveSudoku(int[][] board){
        for(int row = 0; row < GRID_VALUE; row++){
            for(int column = 0; column < GRID_VALUE; column++){
                if(board[row][column] == 0){
                    for(int numToTry = 1; numToTry <= GRID_VALUE; numToTry++){
                        if(isValidPlace(board, numToTry, row, column)){
                            board[row][column] = numToTry;

                            if(SolveSudoku(board)){
                                return true;
                            }
                            else{
                                board[row][column] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static void printBoard(int[][] board){
        for (int row = 0; row < GRID_VALUE; row++){
            if(row%3 == 0){
                System.out.println("=============");
            }
            for(int column = 0; column < GRID_VALUE; column++){
                if(column%3 == 0){
                    System.out.print("|");
                }
                System.out.print(board[row][column]);
            }
            System.out.println();
        }
    }

    private static final int GRID_VALUE = 9;

    public static void main(String[] args){
        int[][] board = {
                {7, 0, 2, 0, 5, 0, 6, 0, 0},
                {0, 0, 0, 0, 0, 3, 0, 0, 0},
                {1, 0, 0, 0, 0, 9, 5, 0, 0},
                {8, 0, 0, 0, 0, 0, 0, 9, 0},
                {0, 4, 3, 0, 0, 0, 7, 5, 0},
                {0, 9, 0, 0, 0, 0, 0, 0, 8},
                {0, 0, 9, 7, 0, 0, 0, 0, 5},
                {0, 0, 0, 2, 0, 0, 0, 0, 0},
                {0, 0, 7, 0, 4, 0, 2, 0, 3}
        };

     printBoard(board);

      if(SolveSudoku(board)) {
          System.out.println("Sudoku Solved Successfully !");
      }
      else{
          System.out.println("Oops Sudoku Not solved !!! ");
      }
      printBoard(board);


    }
}
