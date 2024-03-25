import java.util.LinkedList;
public class stackImpLinkedList{
    public static class Node {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static class stack{
        static Node head=null;
        public static void push(int data)
        {
            Node newNode =new Node(data);
            if(isEmpty())
            {
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public static boolean isEmpty()
        {
            return head==null;
        }
        public static int pop()
        {
            if(isEmpty())
            return -1;
            int top=head.data;
            head=head.next;
            return top;
        }
        public static int peek()
        {
            if(isEmpty())
            return -1;
            return head.data;
        }

    }
    public static void main(String args[])
    {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.push(4);
        ll.push(5);
        while(!ll.isEmpty())
        {
            System.out.println(ll.peek());
            ll.pop();
        }
    }

}