//Given a number N. The task is to generate and print all binary numbers with decimal values from
// 1 to N.
import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;
public class QueueQs{
static void generatePrintBinary(int n)
{
    Queue<String> q = new LinkedList<String>();
    q.add("1");//initial 1
    while (n-- > 0)//runs n-1 times
    {
        String s1 = q.peek();//stores peek
        q.remove();
        System.out.println(s1);//print string(a total binary number)
        //there are two possible choices 0 or 1
        String s2 = s1;
        q.add(s1 + "0");
        q.add(s2 + "1");
    }
}


//5
static void printMax(int arr[], int n, int k)
{
    Deque<Integer> Qi = new LinkedList<Integer>();
    int i;
    for (i = 0; i < k; ++i)
    {
        while (!Qi.isEmpty() && arr[i] >=arr[Qi.peekLast()])//compare with the last inserted element
        Qi.removeLast();
        Qi.addLast(i);
    }
    for (; i < n; ++i) 
    {
        System.out.print(arr[Qi.peek()] + " ");
        while ((!Qi.isEmpty()) && Qi.peek() <=i - k)//remove the previous elements
        Qi.removeFirst();
        while ((!Qi.isEmpty()) && arr[i] >= arr[Qi.peekLast()])
        Qi.removeLast();
        Qi.addLast(i);
    }
    System.out.print(arr[Qi.peek()]);
}
public static void main(String[] args)
{
    // int n = 10;
    // generatePrintBinary(n);

    //5
    int n=9,k=3;
    int arr[]={1,2,3,1,4,5,2,3,6};
    printMax(arr,n,k);

}
}