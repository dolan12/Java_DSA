public class circularQueueArray{

    static class Queue{
        static int arr[];
        static int rear;
        static int front;
        static int size;
        Queue(int n)
        {
            arr=new int[n];
            front=-1;
            rear=-1;
            size=n;
        }
        public static boolean isEmpty()
        {
            return rear==-1&&front==-1;
        }
        public static void add(int n)
        {
            if(isEmpty())
            {
                front=rear=0;
                arr[rear]=n;
                return;
            }
            rear=(rear+1)%size;
            arr[rear]=n;
            
        }
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue is full");
                return -1;
            }
            if(rear==front)//if there is only one element left
            {
               int result=arr[front];
               rear=front=-1;
               return result;
            }
            int result=arr[front];
            front=(front+1)%size;
            return result;
        }
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue is full");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String args[])
    {
        Queue q=new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        //1 2 3
        q.remove();//4 2 3
        q.add(4);
        while(!q.isEmpty()) //as 2 is front and 4 is rear
        {
            System.out.println(q.remove());
        }
    }
}