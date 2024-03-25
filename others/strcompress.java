//unidentified error
import java.util.*;
public class strcompress{
    public static String compress(String str)
    {  
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++)
        { int count=1; 
            
            while( i<str.length()-1 && str.charAt(i)==(str.charAt(i+1)))
            {
                count++;
                i++;
            }
             sb.append(str.charAt(i));
            if(count>1)
            {
                sb.append(count);
            }
           
        }
        return sb.toString();
    }
    public static void main (String args[])
    {
        String str="aaabbbcccdde";
        String com_str=compress(str);
        System.out.println(com_str);
    }
}