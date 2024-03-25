import java.util.*;
public class StackWithQueue{
    static class Stack{
        static Queue<Integer> q1=new LinkedList<>();   
        static Queue<Integer> q2=new LinkedList<>(); 
        public static boolean isEmpty()
        {
            return q1.isEmpty()&&q2.isEmpty();
        }  
        public static void push(int n)
        {
            if(q1.isEmpty())
            {
                q2.add(n);
            }
            else
            q1.add(n);
        }
        public static int pop()
        {   int top=-1;
            if(q1.isEmpty())
            {
                while(!q2.isEmpty())
                {
                    top=q2.remove();//remove front and stores in top var
                    if(q2.isEmpty())
                    break;
                    q1.add(top);
                }
            }
            else
            {
                while(!q1.isEmpty())
                {
                    top=q1.remove();//remove front and stores in top var
                    if(q1.isEmpty())
                    break;
                    q2.add(top);
                }
            }
            return top;
        }
        public static int peek()
        {   int top=-1;
            if(q1.isEmpty())
            {
                while(!q2.isEmpty())
                {
                    top=q2.remove();//remove front and stores in top val
                    q1.add(top);
                }
            }
            else
            {
                while(!q1.isEmpty())
                {
                    top=q1.remove();//remove front and stores in top var
                    q2.add(top);
                }
            }
            return top;
        }
        }
        public static void main(String[] args)
        {
            Stack s=new Stack();
            s.push(1);
            s.push(2);
            s.push(3);
            while(!s.isEmpty())
            {
                System.out.println(s.pop());
            }
        }
    

}