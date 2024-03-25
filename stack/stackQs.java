import java.util.*;
public class stackQs{
    public static boolean isPalindrome(LinkedList<Character> ll)
    {   Stack<Character> s=new Stack<>();
        LinkedList temp=Head;
        int llSize=ll.size();
        int i=0;
        while(i<llSize/2)
        {
            s.push(temp.data);
            temp=temp.next;    
        }
        if(llSize%2!=0)
        {
            temp=temp.next;
        }
        while(temp!=null)
        {
            if(temp.data!=s.peek())
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        LinkedList<Character> ll=new LinkedList<>();
        ll.addFirst('A');
        ll.addFirst('B');
        ll.addFirst('C');
        ll.addFirst('B');
        ll.addFirst('A');
        System.out.println(isPalindrome(ll));
    }
}