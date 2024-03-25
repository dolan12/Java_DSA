import java.util.*;
public class reverse{
    public static String reverse(String str)
    {   StringBuilder sb=new StringBuilder();
        Stack <Character> s=new Stack<> ();
        int i=0;
        while(i<str.length())
        {
            s.push(str.charAt(i));
            i++;
        }
        while(!s.isEmpty())
        {
            sb.append(s.peek());
            s.pop();
        }
        return sb.toString();
    }
    
    public static void main(String args[])
    {
        
        String str="helloWorld";
        String rev=reverse(str);
        System.out.println(rev);
        
    }
}