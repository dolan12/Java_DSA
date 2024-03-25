public class backtrackingQs{
    
    public static void printpath(int arr[][])
    {   System.out.println("---printing the path---");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void  findpath(int arr[][],int path [][],int row,int col)
    {
        //base case
        if(row==(arr.length-1)&& col==(arr.length-1))
        {   
            path[row][col]=1;
            printpath(path);
            path[row][col]=0;
            return;
        }
        //going outside block
        if((row<0)||(row>arr.length-1)|| (col<0)||(col>arr.length-1))
        {
            return;
        }
        if(arr[row][col]==0)
        return ;
        //valid path
        if(arr[row][col]==1)
        {
            path[row][col]=1;
            findpath(arr,path,row,col+1);
            findpath(arr,path,row+1,col);
            path[row][col]=0;
        }
        //as in backtracking we are going up 
        // findpath(arr,path,row,col-1);
        // findpath(arr,path,row-1,col);
       
    }
    static int num=0,count=0;
    
    public static void Combination(String str,String ans)
    {
         if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        //as all characters is an individual option
        for(int i=0;i<str.length();i++)//
        {
            char curr=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);//remove i
            Combination(newStr,ans+curr);
        }
    }

    public static void findCombination(String str)
    {
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++)
        {
            char num = str.charAt(i);
            switch (num)
            {
            case '2':
                    {
                        sb.append("abc");
                        break;
                    }
            case '3':
                    {
                        sb.append("def");
                        break;
                    }
            case '4':
                    {
                        sb.append("ghi");
                        break;
                    }
            case '5':
                    {
                        sb.append("jkl");
                        break;
                    }
            case '6':
                    {
                        sb.append("mno");
                        break;
                    }
            case '7':
                    {
                        sb.append("pqrs");
                        break;
                    }
            case '8':
                    {
                        sb.append("tuv");
                        break;
                    }
            case '9':
                    {
                        sb.append("wxyz");
                        break;
                    }
            }
          

           
        }
        String newStr=sb.toString();
        System.out.println(newStr);
        String ans=new String("");
        Combination(newStr,ans);
    }

    
    public static void main(String args[])
    {   
        // 1

        // int arr[][]={ {1,1,0,0},
        //               {1,1,0,1},
        //               {0,1,0,1},
        //               {1,1,1,1}
        //               };
        // int path[][]=new int [arr.length][arr.length];
        // findpath(arr,path,0,0);
        
      

    //3
    //   String keypadNum="23";
    //   findCombination(keypadNum);


    }
}