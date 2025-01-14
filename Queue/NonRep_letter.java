// First non-repeating letter in a stream of characters
import java.util.*;
public class NonRep_letter{
    public static void NonRep(String str)
    {   Queue<Character> q=new LinkedList<>();
        int freq[]=new int[26];//a-z
        for(int i=0;i<str.length();i++)
        {   
            char ch=str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
            while(!q.isEmpty()&& freq[q.peek()-'a']>1)
            q.remove();
            if(q.isEmpty())
            System.out.print("-1 ");
            else
            System.out.print(q.peek()+" ");
        }
    }
    public static void main(String args[])
    {
        String str="aabccxb";
        NonRep(str);
    }
}