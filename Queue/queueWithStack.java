import java.util.Stack;
public class queueWithStack{
    // static class Queue
    // {   
    //     static Stack<Integer> s1=new Stack<>();//stores actual queue elem
    //     static Stack<Integer> s2=new Stack<>();//used for adding 
    //     public static boolean isEmpty()
    //     {
    //         return s1.isEmpty();
    //     }
    //     public static void add(int n)
    //     {
    //         while(!s1.isEmpty())
    //         {
    //             s2.push(s1.pop());
    //         }
    //         s1.push(n);
    //          while(!s2.isEmpty())
    //         {
    //             s1.push(s2.pop());
    //         }
    //     }
    //     public static int remove()
    //     {
    //         if(s1.isEmpty())
    //         {
    //             System.out.println("the queue is empty()");
    //             return -1;
    //         }
    //         return s1.pop();
    //     }
    //     public static int peek()
    //     {
    //         if(isEmpty())
    //         {
    //             System.out.println("the queue is empty()");
    //             return -1;
    //         }
    //         return s1.peek();
    //     }
    // }


    // ANOTHER APPROACH
    // pop=O(n);push=O(1);peek
    public static class Queue{
        static Stack<Integer> s1=new Stack<>();
        static Stack<Integer> s2=new Stack<>();

        public static boolean isEmpty()
        {
            return s1.isEmpty();
        } 
        public static void add(int n)
        {
            s1.push(n);
        }
        public static int remove()
        {
            while(!s1.isEmpty())
            {
                s2.push(s1.pop());
            }
            int front=s2.pop();
            while(!s2.isEmpty())
            {
                s1.push(s2.pop());
            }
            return front;
        }
        public static int peek()
        {
            while(!s1.isEmpty())
            {
                s2.push(s1.pop());
            }
            int front=s2.peek();
            while(!s2.isEmpty())
            {
                s1.push(s2.pop());
            }
            return front;
        }
    }
    public static void main(String args[])
    {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}