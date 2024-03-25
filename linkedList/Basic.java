public class Basic{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void print()
    {
        if(head==null)
        {
            System.out.println("null");
        }
        else{
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.print("null");
        }
        System.out.println();
       
    }
    public int remove(int idx)
    {   if(idx==0)
        return removeFirst();
        else if(idx==size-1)
        return removeLast();
        else
        {   int i=0,num;
            Node temp=head;
            while(i<idx-1)
            {
                temp=temp.next;
                i++;
            }
            num=temp.next.data;
            temp.next=temp.next.next;
            size--;
            return num;
        }
        
    }

    public int  removeLast()
    {int num=0;
        if(head==null)
        System.out.println("null");
        
        else if(size==1)
        {   
            num=head.data;
            head=tail=null;
            size=0;
            
        }
        else
        {
            Node temp=head;
            int i=0;
            while(i<size-2)
            {
                temp=temp.next;
                i++;
            }
            num=(temp.next).data;
            temp.next=null;
            size--;
            
        }
        return num;
    }
    public int removeFirst()
    {
        if(head==null)
        System.out.println("null");
        else if(size==1)
        {   int num=head.data;
            head=tail=null;
            size=0;
            return num; 
        }
        else{
            Node temp=head;
            head=head.next;
            temp.next=null;
            size--;
            return temp.data;
        }
        return -1;
    }

    public void add(int idx,int data)
    {   if(idx==0)
        addFirst(data);
        else if(idx==size-1)
        addLast(data);
        else
        {
         Node newNode=new Node(data);
         Node temp=head;
         int i=0;
        while(i<idx-1)
        {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        size++;
        }
        return;
    }

    public void addLast(int data)
    {
         Node newNode=new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            size=1;
        }
        else
        {tail.next=newNode;
        tail=newNode;
        size++;}
    }
    //no need to be static 
    public void addFirst(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            size=1;
        }
        else
        {
            newNode.next=head;
            head=newNode;
            size++;
            
        }
        return;
    }
    public int helper(Node head,int key)
    {
        if(head==null)
        return -1;
        if(head.data==key)
        return 0;
        int idx=helper( head.next,key);
        if(idx==-1)
        return -1;

        return idx+1;
    }
    public int recSearch(int key)
    {   //as here only parameter is key
        //thet's why we need an helper method
        return helper( head, key);

    }
  

    //reverse a linked list
    public void reverse()
    {
        
        Node curr=tail=head;//as head should be tail in reverse
        Node prev=null;
        
        while(curr!=null)
        {  Node Next=curr.next;
           curr.next=prev;
           prev=curr;
           curr=Next;
        }
       head=prev;
       
    }

    //remove N'th node from tail
    public void removeLastNth(int n)
    {   //we have to delete (size-n+1)'th node
        int  n1=size-n;//from the first
        Node prev=head;
        int i=1;//if we are starting from index 0 then while(i<n1-1)
        while(i<n1)
        {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        size--;
    }
    //find mid of any node
    public Node  mid(Node head)
        {   //slow-fast technique
            Node slow=head;Node fast=head;
            while(fast==null &&fast.next!=null)
            {
                slow=slow.next;//slow
                fast=fast.next.next;//fast
            }
            return slow;
        }

    public boolean isPalindrome()
    {   
        if(head==null||head.next==null)
        return true;
         
        //find mid
        Node middle=mid(head);

        //reverse half
        Node temp=head;
        while(temp!=middle)
        {
            temp=temp.next;
            
        }
        Node curr=temp.next;
        Node prev=temp;
        prev.next=null;
        while(curr!=null)
        {
            Node Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        //compare first half and second half
        Node left=head;
        Node right=prev;
        while(right!=null)
        {
            if((left.data!=right.data))
            return false;
            left=left.next;
            right =right.next;
        }
        return true;
        
    }
    public static Node head;
    public static Node tail;
    public static int size=0;
    public static void main(String args[])
    {
        // Basic ll=new Basic();//create object of the current class
        // ll.addFirst(3);
        // ll.addFirst(4);
        // ll.addFirst(5);
        // ll.addFirst(6);
        // ll.addFirst(7);
        // ll.addLast(2);
        // ll.print();

        // ll.removeFirst();
        // ll.removeLast();
        // ll.remove(2);
        // ll.print();
        // int key=5;
        // System.out.println(ll.recSearch(key));

        Basic ll2=new Basic();
        ll2.addFirst(5);
        ll2.addFirst(4);
        ll2.addFirst(3);
        ll2.addFirst(2);
        ll2.addFirst(1);
        //before reverse
        ll2.print();
        
        //after reverse
        ll2.reverse();
        ll2.print();
        ll2.removeLastNth(2);
        ll2.print();
        ll2.addLast(3);
        ll2.addLast(4);
        ll2.addLast(5);
        ll2.addLast(6);
        ll2.print();
        System.out.println(ll2.isPalindrome());
    }
}