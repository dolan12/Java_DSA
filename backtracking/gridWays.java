public class gridWays{
    //didi's approach 
    public static int gridWays(int i,int j,int n,int m){
        if(i==n-1&&j==m-1){
            return 1;
        }
        else if(i==n||j==m){
            return 0;
        }
        int w1=gridWays(i+1,j,n,m);
        int w2=gridWays(i,j+1,n,m);
        return w1+w2;
    }
    public static void countWays(int[][] arr,int row ,int col){
        if(row==arr.length||col==arr.length){//boundary value
            return;
        }
        //destination
        if(row==(arr.length-1)&&col==(arr.length-1)){
            ways++;
            return;
        }
        //right
        countWays(arr,row,col+1);
        //down
        countWays(arr,row+1,col);
    }
    static int ways=0;
    public static void main(String args[]){
        //didi's approach for n*m matrix
        // int n=3,m=4;
        // System.out.println(gridWays(0,0,n,m));
        int n2=3;
        int arr[][]=new int [n2][n2];
        countWays(arr,0,0);
        System.out.println(ways);
    }
}