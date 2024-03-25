import java.util.Arrays;
public class anagrams{
    public static boolean check_anagram(String str1,String str2)//by me
    {   
        if(str1.length()!=str2.length())
        return false;
        boolean match=false;
        for(int i=0;i<str1.length();i++)
        {
            for(int j=0;j<str2.length();j++)
            {
                if(str1.charAt(i)==str2.charAt(j))
                match=true;
            }
            if(match==false)
            return false;
        }
        return match;
    }
    //by shradha didi
    public static void anagram(String str1,String str2)
    {   if(str1.length()==str2.length())
        {
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        char[] str1chararray=str1.toCharArray();
        char[] str2chararray=str2.toCharArray();
        Arrays.sort(str1chararray);
        Arrays.sort(str2chararray);
        boolean ans=Arrays.equals(str1chararray,str2chararray);
        if(ans)
        System.out.println(str1 +" "+ str2 +" is anagrams");
        else
        System.out.println(str1 +" "+ str2 +"is not anagrams");}
        else
        System.out.println(str1 + " "+ str2 +"is not anagrams");
       
    }

    public static void main(String args[])
    {
        String str1="reca";String str2="care";
        // System.out.println(check_anagram(str1,str2));
        anagram(str1,str2);
    }
}