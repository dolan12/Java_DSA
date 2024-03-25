public class linkedLIstQs
{
    public static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(int data)
    {   Node newNode =new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            size++;return;
        }
        
        newNode.next=head;
        size++;
        head=newNode;
    }
    public void print()
    {
        if(head==null)
        {System.out.println("null");
        return;}
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void removeN(int m,int n)
    {
        int i=1;
        Node temp=head;
        while(i<m)
        {
            temp=temp.next;
            i++;
        }
        Node left=temp;
        while(i<(m+n))
        {
            temp=temp.next;
            i++;
        }
        Node right=temp;
        left.next=right.next;
    }
    public void swap(int key1,int key2)
    {   Node prev=head;//track the prev node of temp 
         Node val1=null,val2=null,preVal1=null,preVal2=null;
        Node temp=head;
        while(temp!=null)
        {   if(val1!=null && val2!=null)
            break;
            else if(temp.data==key1)
            {val1=temp;
            preVal1=prev;}
            else if(temp.data==key2)
            {val2=temp;
            preVal2=prev;}
            prev=temp;
            temp=temp.next;
        }
        //swap
        temp=val1.next;
        val1.next=val2.next;
        preVal1.next=val2;
        val2.next=temp;
        preVal2.next=val1;
    }

    public void oddEvenLinkedList()
    {
        Node temp=head.next,prev=head,next=null;
        Node insert=null;
        while(temp!=null)
        {   
            if(temp.data%2 ==0)
            {   next=temp.next;
                prev.next=prev.next.next;
                if(insert==null)//add first;
                {   
                    temp.next=head;
                    head=temp;
                    insert=head;
                    temp=next;
                }
                else
                {   
                    temp.next=insert.next;
                    insert.next=temp;
                    insert=temp;
                    temp=next;
                }
            }
            else
            {
                prev=temp;
                temp=temp.next;
            }
                
               
        }
    }

    public static Node head;
    public static int size=0;
    public static Node tail;
    public static void main(String args[])
    {
        linkedLIstQs ll=new linkedLIstQs();
        ll.addFirst(8);
        ll.addFirst(7);
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
    // 2
        //retain M nodes then delete next N nodes,
        // int m=3,n=2;
        // ll.removeN(m,n);
        // ll.print();
    //3
        //swap for two given keys;
        // int key1=3,key2=8;
        // ll.swap(key1,key2);
        // ll.print();

    //4 oddeven linked list
        ll.oddEvenLinkedList();
        ll.print();

    }
}
