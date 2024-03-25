import java.util.*;
public class deque{
    public static class Stack{
        static Deque<Integer> deque=new LinkedList<>();
        public static void push(int n)
        {
            deque.addLast(n);
        }
        public static int pop()
        {
            return deque.removeLast();
        }
        public static int peek()
        {
            return deque.getLast();
        }
    }
    public static class Queue{
        static Deque<Integer> deque=new LinkedList<>();
        public static void add(int n)
        {
            deque.addLast(n);
        }
        public static int remove()
        {
            return deque.removeFirst();
        }
        public static int peek()
        {
            return deque.getFirst();
        }
    }

    public static void main(String args[])
    {
        Deque<Integer> deque=new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addLast(4);
        deque.addLast(5);//3 2 1 4 5
        System.out.println(deque);
        deque.removeFirst();
        deque.removeFirst();
        System.out.println(deque);


        // Stack s=new Stack();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // System.out.println(" Stack peek ="+s.peek());

        // Queue q=new Queue();
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // System.out.println(" Queue peek ="+q.peek());
    }
}