import java.util.*;
public class validParenthese{
    public static boolean checkValid(String str)
    {   Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char curr=str.charAt(i);
            //open parentheses
            if((curr=='(')||(curr=='{')||(curr=='['))
            s.push(curr);
            
            //close parentheses
            else{

            //at the first index if there is a close parentheses
            // the stack will be empty .then return false 
            if(s.isEmpty())
            return false;

            if(( curr==')' && s.peek()== '(' ) ||
                ( curr=='}' && s.peek()== '{' )||
                ( curr==']' && s.peek()== '[' ))
                {
                    s.pop();
                }
            else 
            return false;
            }

        }
        //check if there is any left parentheses left in the stack
        if(s.isEmpty())
        return true;
        else 
        return false;
    }
    public static void  main(String args[])
    {
        String str="(){{}[]}";
        if(checkValid(str))
        System.out.println("the parentheses is valid");
        else
        System.out.println("the parentheses is not valid");
    }
}