//print all ways to place n queens in n*n chess board
public class nQueens{
    public static void printBoard(char[][] board)
    {   System.out.println("-----------board----------");
         for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    public static boolean isSafe(char board[][],int row,int col){
        //vertical up
        for(int i=row;i>=0;i--)
        {
            if(board[i][col]=='Q')
            return false;
        }
        //diag left
        for(int i=row,j=col;i>=0&&j>=0;i--,j--)
        {
            if(board[i][j]=='Q')
            return false;
        }
        //diag right
        for(int i=row,j=col;i>=0&&j<board.length;i--,j++)
        {
            if(board[i][j]=='Q')
            return false;
        }
        return true;
    }
    public static void placeQueen(char[][] board,int row)
    {
        if(row==board.length)
        {
            printBoard(board);
            return;//during return process the queens are unspaced,so we can't get any answer in main func
        }
        for(int j=0;j<board.length;j++)
        {
            if(isSafe(board,row,j))
            {
                board[row][j]='Q';
                placeQueen(board,row+1);//func call
                board[row][j]='x';//backtracking step
            }
        }

    }
    public static void main(String args[])
    {
        int n=5;

        char board[][]=new char[n][n];
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                board[i][j]='x';
            }
        }
        placeQueen(board,0);
        

    }
}