//print all ways to place n bishops in n*n chess board
public class nBishops{
    public static void printArr(char[][] arr)
    {   System.out.println("------printing board-------");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(char[][] arr,int row,int col){
        for(int i=row,j=col;i>=0&&j>=0;i--,j--){
            if(arr[i][j]=='B')
            return false;

        }
         for(int i=row,j=col;i>=0&&j<arr.length;i--,j++){
            if(arr[i][j]=='B')
            return false;

        }
        return true;

    }
    public static void nBishops(char[][] arr,int row)
    {
        if(row==arr.length)
        {
            printArr(arr);
            return;
        }
        for(int j=0;j<arr.length;j++){
           if( isSafe(arr,row,j))
            {
                arr[row][j]='B';
                nBishops(arr,row+1);
                arr[row][j]='x';
            }
        }
    }
    public static void main(String args[])
    {
        int n=4;
        char board[][]=new char[n][n];
        //initialization
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='x';
            }

        }
        nBishops(board,0);
      
    }
}