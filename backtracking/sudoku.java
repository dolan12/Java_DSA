public class sudoku{
    public static boolean isSafe(int arr[][],int row,int col,int digit){
       for(int i=0;i<=8;i++){//check columnwise
        if(arr[i][col]==digit){
            return false;
        }
       } 
        for(int j=0;j<=8;j++){//check rowwise
        if(arr[row][j]==digit){
            return false;
        }
        }
        //check grid 
        int sr=(row/3)*3;//row of the grids first cell 
        int sc=(col/3)*3;//grids first cells column
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(arr[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudokuSolver(int sudoku[][],int row,int col)
    {
        //base case
        if(row==9 )
        {
            return true;
        }
        
        //recursion
        int nextRow=row,nextcol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextcol=0;
        }
        if(sudoku[row][col]!=0){
            return sudokuSolver(sudoku,nextRow,nextcol);
        }
        else
        for(int digit=1;digit<=9;digit++){
            if(isSafe(sudoku,row,col,digit))
            {
                sudoku[row][col]=digit;
                if(sudokuSolver(sudoku,nextRow,nextcol))
                {return true;
                }
                sudoku[row][col]=0;//backtracking
            }
        }
        return false;
    }
    public static void main( String args[]){
        int sudoku[][]={{0,0,8,0,0,0,0,0,0},
                     {4,9,0,1,5,7,0,0,2},
                     {0,0,3,0,0,4,1,9,0},
                     {1,8,5,0,6,0,0,2,0},
                     {0,0,0,0,2,0,0,6,0},
                     {9,6,0,4,0,5,3,0,0},
                     {0,3,0,0,7,2,0,0,4},
                     {0,4,9,0,3,0,0,5,7},
                     {8,2,7,0,0,9,0,1,3}
                     };
        if(sudokuSolver(sudoku,0,0 )){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
        }
        else 
        System.out.println("the solution is not possible");
    }
}