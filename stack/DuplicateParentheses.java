//given a balanced expression, find if it contains duplicate parenthesis or not
// a set of parentheses is duplicate if the same subexpression is surrounded by multiple parentheses
import java.util.*;
public class DuplicateParentheses{
    public static boolean isDuplicate(String str)
    {
        Stack <Character> s=new Stack<>();
        
        for(int i=0;i<str.length();i++)
        {   int count=0;
            char ch=str.charAt(i);
            if((ch==')')||(ch==']')||(ch=='}'))
            {
                while((ch==')')&&( s.peek()!='('))
                {
                    s.pop();
                    count++;
                }
                while((ch=='}')&&( s.peek()!='{'))
                {
                    s.pop();
                    count++;
                }
                while((ch==']')&&( s.peek()!='['))
                {
                    s.pop();
                    count++;
                }
                s.pop();
                if(count==0)
                return true;
            }
            else
            s.push(ch);
        }
        return false;
    }
    public static void main(String args[])
    {
        String str="((a+b)+c)";
        if(isDuplicate(str))
        System.out.println("the expression has duplicate parentheses");
        else
        System.out.println("the expression has no duplicate parentheses");

    }   
}