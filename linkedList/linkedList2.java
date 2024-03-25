public class linkedList2{
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
    public void print()
    {   
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public void removeLoop()
    {   
        Node slow=head;
        Node fast=head;
        Node prev=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                slow=head;
                 while(slow!=fast)
                 {   prev=fast;
                    slow=slow.next;
                    fast=fast.next;
                 }
                 prev.next=null;
                 break;
            }
            
        }
        System.out.println("the linkedlist is un-loopped now:");
        }
    

    public boolean isLoop()
    {   
        //slow-fast technique
        Node slow=head;Node fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            return true;
        }
        return false;
    }

    public Node getMid(Node head)//return the mid-1 value for even no of nodes 
    {
        Node slow=head;
        Node fast =head.next;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public Node merge(Node left,Node right)
    {
        Node newNode=new Node(-1);
        Node temp=newNode;
        while(left!=null&&right!=null)
        {
            if(left.data<right.data)
            {
                temp.next=left;
                left=left.next;
            }
            else
            {
                temp.next=right;
                right=right.next;
            }
            temp=temp.next;
        }
        while(left!=null)
        {
            temp.next=left;
            left=left.next;
            temp=temp.next;
        }
        while(right!=null)
        {
            temp.next=right;
            right=left.next;
            temp=temp.next;
        }
        return newNode.next;
        
    }

    public Node mergeSort(Node head) 
    {
        if(head==null|| head.next==null)
        return head;
        Node newMid=getMid(head);
        Node rightHead=newMid.next;
        newMid.next=null;
         Node left=mergeSort(head);
        Node right=mergeSort(rightHead);
       
        return merge(left, right);

    }

    public void zigZag()
    {
        Node mid=getMid(head);
        //revese the second half
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node Next;
        while(curr!=null)
        {
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
    
        }
        //alternate merging
        Node left=head;
        Node right=prev;
        Node nextL,nextR;
        while(left!=null&&right!=null)
        {
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            left=nextL;
            right=nextR;
        }

    }
    public static Node head;
    public static Node tail;
    public static int size=0;

    public static void main(String args[])
    {
     linkedList2 ll=new linkedList2();//object creation of the same class
    //  head= new Node(1);
    //  Node temp=new Node(2);
    //  head.next=temp;
    //  head.next.next=new Node(3);
    //  head.next.next.next=new Node(4);
    //  head.next.next.next.next=temp;//1->2->3->4->2

//CHECK LOOP  
    // //  System.out.println(ll.isLoop());
//REMOVE LOOP
    // ll.removeLoop();
    // ll.print();

//MERGE SORT
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(3);
    ll.addFirst(4);
    ll.addFirst(5);
    ll.print();
    
    // ll.head=ll.mergeSort(ll.head);
    // System.out.println("AFTER MERGESORT: ");
    // ll.print();

//convert a linked list in a zig zag format
    ll.zigZag();
    ll.print();
    
    }

     

}
