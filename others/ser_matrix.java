public class ser_matrix{
    public static boolean staircasesearch2(int matrix[][],int key)

    {   //start searching from lower stair
        int i=matrix.length-1,j=0;
        while(i>=0&&j<matrix[0].length)
    {
        if(key==matrix[i][j])
        {
            System.out.println("key found at index ("+i+","+j+")");
            return true;
        }
        else if(key<matrix[i][j])
            i--;
        else
            j++;
    }
    System.out.println("key not found");
    return false;
    }
    public static boolean staircasesearch1(int  matrix[][],int key)
    {//start searching from upper stair
        int row=0,col=matrix[0].length-1;
        while(row<matrix.length&&col>=0)
        {
            if(key==matrix[row][col])
            {
                 System.out.println("key found at index ("+row+","+col+")");
            return true;
            }
            else if(key<matrix[row][col])
            col--;
            else
             row++;
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String args[])
    {
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        staircasesearch2(matrix,30);//lower stair
        // staircasesearch1(matrix,33);//upper stair

    }
}