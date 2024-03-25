import java.util.*;
public class linearsearch{
    public static int search(String a[],String k)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i].equals(k))
                {
                    return i;
                }
                
        }
       return -1;  
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String arr[]={"dolan","sweta","hero","ram","ravan","sri krishna"};
        String key=sc.nextLine();
        int input=search(arr,key);
        if(input==-1)
        {System.out.println("not found");}
        else 
         System.out.println("the item is in index :"+input);
       

    }
}