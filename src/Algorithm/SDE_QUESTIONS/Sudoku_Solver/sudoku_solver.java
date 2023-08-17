package Algorithm.SDE_QUESTIONS.Sudoku_Solver;

public class sudoku_solver {
    static boolean SolveSudoku(int grid[][])
    {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j <9; j++) {
                if(grid[i][j]==0){
                    for (int k = 1; k <=9 ; k++) {
                        if (isValid(grid, i, j,k )) {
                            grid[i][j] = k;

                            if (SolveSudoku(grid) == true) {
                                return true;
                            } else {
                                grid[i][j] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isValid(int grid[][],int row,int col,int val){
        for (int i = 0; i <9 ; i++) {
            if(grid[row][i]==val){
                return false;
            }
            if(grid[i][col]==val){
                return false;
            }
            if(grid[3*(row/3) +i/3][3*(col/3) + i%3]==val){
return false;
            }
        }
        return true;
    }

    //Function to print grids of the Sudoku.
    static void printGrid (int grid[][])
    {
        for (int i = 0; i < grid.length ; i++) {
            for (int j = 0; j <grid[0].length ; j++) {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int grid[][]={{3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}};
      boolean ans=SolveSudoku(grid);
        System.out.println(ans);
        printGrid(grid);

    }
}
