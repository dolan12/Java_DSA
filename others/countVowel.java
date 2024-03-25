import java.util.*;
public class countVowel{
    public static int low_vowel(String str)
    {   int count =0;
        for(int i=0;i<str.length();i++)
        {
            char n =str.charAt(i);
            if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u')
            count++;
        }
        return count;
    }
    public static void main(String args[])
    {   Scanner sc=new Scanner (System.in);

        String str=sc.next();
        int ans=low_vowel(str);
        System.out.println(ans);
    }
}