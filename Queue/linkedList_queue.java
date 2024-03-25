public class linkedList_queue{
    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    static class Queue{
        static Node head=null;
        static Node tail=null;

        public static boolean isEmpty()
        {
            return head==null&& tail==null;
        }
        public static void add(int n)
        {   Node newNode=new Node(n);
            if(isEmpty())
            {   head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("the queue is empty");
                return -1;
            }
            int front=head.data;
            if(tail==head)
            {
                tail=head=null;
                return front;
            }
            
            head=head.next;
            return front;
        }
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("the queue is empty");
                return -1;
            }
            return head.data;
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