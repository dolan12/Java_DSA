import java.util.*;
public class patterns
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner (System.in);

        //1 print star pattern
        // int line=sc.nextInt();//enter the line
        // for(int i=1;i<=line;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }

        //2 print inveret star pattern
        // int line=sc.nextInt();
        // for(int i=line;i>=1;i--)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }

        //3 half pyramid pattern
        // int line=sc.nextInt();
        // for(int i=1;i<=line;i++)
        // {
        //     for (int j=1;j<=i;j++)
        //     {
        //         System.out.print(j);
        //     }
        //     System.out.print("\n");
        // }

        //4 character pattern
        // int line=sc.nextInt();
        // char ch='A';
        // for(int i=1;i<=line;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }
        
        //5 inverted and rotated half pyramid
        // int line=sc.nextInt();
        // for(int i=1;i<=line;i++)
        // {
        //     for (int j=line;j>=1;j--)
        //     {
        //         if(j>i)
        //         {System.out.print(" ");}
        //         else
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        //6 inverted half pyramid with number pattern
        // int line=sc.nextInt();
        // for(int i=line;i>=1;i--)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print(j);
        //     }
        //     System.out.println("");
        // }

        //7 floyeds traingular pattern
        // int line=sc.nextInt();
        // int num=1;
        // for(int i=1;i<=line;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print(num+" ");
        //         num++;
        //     }
        //     System.out.println("");
        // }

        //8 solid rhombus pattern
        // int line=sc.nextInt();
        // int col=line*2-1;
        // int f=line,l=1;
        // for(int i=1;i<=line;i++)
        // {
        //     for(int j=col;j>=1;j--)
        //     {
        //         if(j<=f&&j>=l)
        //         {
        //             System.out.print("*");
        //         }
        //         else
        //         System.out.print(" ");
        //     }
        //     System.out.println(" ");
        //     f++;l++;
        // }
    
        //ADVANCE PATTERNS

        // 9 hollow pattern
        // int row=sc.nextInt();
        // int col=sc.nextInt();
        // for(int i=1;i<=row;i++)
        // {
        //     for(int j=1 ;j<=col;j++)
        //     {
        //         if((i==1)||(i==row)||(j==1)||(j==col))
        //            {System.out.print(" * ");} 
        //         else
        //             {System.out.print(" ");}
        //     }
        //      System.out.println("");
        // }

        //10. 01 traingular pattern
        // int line=sc.nextInt();
        // for (int i=1;i<=line;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         if((i+j)%2==0)
        //             System.out.print("1 ");
        //         else 
        //             System.out.print("0 ");
        //     }
        //     System.out.println();
        // }
       
       //11 butterfly pattern
    //    int line=sc.nextInt();
    //    int f=1;int l=2*line;
    //    for(int i=1;i<=line;i++)
    //    {
    //     for(int j=1;j<=2*line;j++)
    //     {
    //         if(j<=f||j>=l)
    //         {
    //             System.out.print("*");
    //         }
    //         else
    //             System.out.print(" ");
    //     }
    //     f++;l--;
    //     System.out.println();
    //    }
    //    //downside
    //    f=line;l=line+1;//or f--;l++;
    //     for(int i=1;i<=line;i++)
    //    {
    //     for(int j=1;j<=2*line;j++)
    //     {
    //         if(j<=f||j>=l)
    //         {
    //             System.out.print("*");
    //         }
    //         else
    //             System.out.print(" ");
    //     }
    //     f--;l++;
    //     System.out.println();
    //    }

    //12 hollow rhombus
   //  int n=sc.nextInt();
   //  for(int i=1;i<=n;i++)
   //  { //print spaces
   //    for(int j=1;j<=n-i;j++)
   //    {
   //       System.out.print(" ");
   //    }
         //print *
   //    for(int j=1;j<=n;j++)
   //    { if(i==1||i==n||j==1||j==n)
   //          System.out.print("*");
   //       else
   //          System.out.print(" ");
   //    }
   //    System.out.println();
   //  }
    
    //13 diamond pattern
   //  int n=sc.nextInt();
   //  //upper row
   //  for(int i=1;i<=n;i++)
   //  {
   //    //print n-i spaces
   //    for(int j=1;j<=(n-i);j++)
   //  {
   //    System.out.print(" ");
   //  }
   //  //print 2i-1 *
   //  for(int j=1;j<=((2*i)-1);j++)
   //  {
   //    System.out.print("*");
   //  }
   //  System.out.println();
   //  }
   //  //lower row
   //  for(int i=n;i>=1;i--)
   //  {
   //    for(int j=1;j<=(n-i);j++)
   //  {
   //    System.out.print(" ");
   //  }
   //  for(int j=1;j<=((2*i)-1);j++)
   //  {
   //    System.out.print("*");
   //  }
   //  System.out.println();
   //  }

//14  number pyramid pattern
// int n=sc.nextInt();
// int num=1;
// for(int i=1;i<=n;i++)
// {
//    //spaces
//    for(int j=1;j<=(n-i);j++)
//    {
//       System.out.print(" ");
//    }
//    //print numbers
//    for(int j=1;j<=2*i-1;j++)
//    {
//       System.out.print(num);
//    }
//    System.out.println();
//    num++;
// }

//15 palindromic pattern with numbers
// int n=sc.nextInt();
// for(int i=0;i<=n;i++)
// {
//    //spaces
//    for(int j=1;j<=(n-i);j++)
//    {
//       System.out.print(" ");
//    }
//    //descending
//    for(int j=i;j>=1;j--)
//    {
//       System.out.print(j);
//    }
//    //ascending
//    for(int j=2;j<=i;j++)
//    {
//       System.out.print(j);
//    }
//    System.out.println();
// }

//16




     }

    
}