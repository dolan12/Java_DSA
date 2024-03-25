//tiling problem
// given a"2 x n" board using and tiles od size "2 x 1",count the number of ways to tile
// the given board using these tiles.( a tile can be placed horizontally or vertically.)

public class Tiling{
    public static int tilingProblem(int n){
        if(n==0||n==1)
        return 1;
        //vertical choice
        int fnm1=tilingProblem(n-1);

        //horizontal choice
        int fnm2=tilingProblem(n-2);
        int totways=fnm1+fnm2;
        return totways;
    }
    public static void  main(String args[])
    {
        int n=4;
        System.out.println(tilingProblem(n));
    }
} 