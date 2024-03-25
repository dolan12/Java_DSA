public class transpose{
    public static int[][]  myappraoch(int arr[][])
    {   int m=arr.length,n=arr[0].length;
        int arr2[][]=new int[n][m];
        for(int j=0;j<arr2[0].length;j++)
        {for(int i=0;i<arr2.length;i++)
        {
            arr2[i][j]=arr[j][i];
        }
        }
        return arr2;
    }
    public static void main(String args[])
    {
        int arr[][]={{45,2,3},{34,6,7},{33,5,7},{23,34,78}};
        int newarr[][]=myappraoch(arr);
        for(int i=0;i<newarr.length;i++)
        {{for(int j=0;j<newarr[0].length;j++)
         System.out.print(newarr[i][j]+" ");}
         System.out.println("");}
       
    }
}