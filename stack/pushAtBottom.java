//there are already some elements in the stack.we have to push another element in this stack
import java.util.*;
public class pushAtBottom{
    public static void pushBottom(Stack<Integer> s,int data)
    {
        if(s.isEmpty())
       { s.push(data);
        return;}
        int top=s.peek();
        s.pop();
        pushBottom(s,data);
        s.push(top);
    }
    public static void main(String args[])
    {
        Stack<Integer> s =new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        pushBottom(s,6);
        
        while(!s.isEmpty())
        {
             System.out.println(s.peek());
             s.pop();
        }
        

    
       

    }
}