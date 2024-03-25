public class queenOneWay{
    public static boolean isSafe(char arr[][],int row,int col){
        for(int i=row;i>=0;i--){
            if(arr[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row,j=col;i>=0&&j>=0;i--,j--){
            if(arr[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row,j=col;i>=0&&j<arr.length;i--,j++){
            if(arr[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static boolean oneWay(char board[][],int row)
    {
        if(row== board.length){
            return true;
        }
        for(int j=0;j<board.length;j++)
        {
            if(isSafe(board,row,j)){
               board[row][j]='Q';
                
                if(oneWay(board,row+1)){
                   return true;
                }
                board[row][j]='x';
            }
        }
        return false;
    }
public static void main(String args[]){
    int n=4;
    char board[][]=new char[n][n];
    for(int i=0;i<board.length;i++)
    {for(int j=0;j<board.length;j++){
       board[i][j]='x';}
    }
    if(oneWay(board,0)){
    for(int i=0;i<board.length;i++)
    {
        for(int j=0;j<board.length;j++)
        {
        System.out.print(board[i][j]);
        }
        System.out.println();
    }
    }
    else
    System.out.println("there is no possible way");
}
}