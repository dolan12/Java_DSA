public class removeDuplicate{
    public static void recursion_way(String str,int idx,StringBuilder newStr,boolean map[])
    {
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true)//if its duplicate
        recursion_way(str,idx+1,newStr,map);
        else {
            map[currChar-'a']=true;
            recursion_way(str,idx+1,newStr.append(currChar),map);//most imporatant concept in this prog
        }

    }

    public static void main(String args[])
    {
        String str="apnacollege";
        StringBuilder str1=new StringBuilder("");
        recursion_way(str,0,str1,new boolean[26]);
        System.out.println();
    }
   
}