public class permutation{
    public static void findPermutation(String str,String ans){
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        //as all characters is an individual option
        for(int i=0;i<str.length();i++)//
        {
            char curr=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);//remove i
            findPermutation(newStr,ans+curr);
        }
    }
    public static void main(String args[])
    {
        String str="abc";
        findPermutation(str,"");
    }

}