public class doublyLinked{
    public static class Node{
        int data;
        Node next,prev;
        Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    } 
    public void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println ();
    }
    public void addFirst(int data)
    {   Node newNode=new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        size++;
    }

    public void addLast(int data)
    {   Node newNode=new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
        size++;
    }
    public int removeFirst()
    {   if(head==null)
        {System.out.println("DLL is empty: ");
        return Integer.MIN_VALUE;
        }
        if(size==1)
        {
            int val=head.data;
            head=head.next;
            head.prev=null;
            size=0;
            return val;
        }
        int val=head.data;
        Node temp=head.next;
        head.next.prev=null;
        head.next=null;
        head=temp;
        size--;
        return val;
    }
    
    public int removeLast(){
        if(head==null)
        {System.out.println("DLL is empty: ");
        return Integer.MIN_VALUE;
        }
        if(head==tail)
        {
            int val=head.data;
            head=head.next;
            head.prev=null;
            size=0;
            return val;
        }
        int val=tail.data;
        Node temp=tail.prev;
        temp.next=null;
        tail.prev=null;
        size--;
        tail=temp;
        return val;
    }
    public void reverse()
    {
        Node Prev=null,curr=head;
        tail=head;
        while(curr!=null)
        {
            Node Next=curr.next;
            curr.next=Prev;
            curr.prev=Next;
            Prev=curr;
            curr=Next;
            
        }
        head=Prev;
    }
    
    public static Node head;
    public static Node tail;
    public static int size=0;

    public static void main(String args[])
    {
       doublyLinked dll=new doublyLinked();
       dll.addFirst(5);
       dll.addFirst(4);
       dll.addFirst(3);
       dll.addFirst(2);
       dll.addFirst(1);
       dll.addLast(6);
       dll.print();

       dll.removeFirst();
       dll.removeLast();
       dll.print();
       System.out.println(dll.size);

       dll.reverse();
       dll.print();
       

    }
}