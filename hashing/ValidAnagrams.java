import java.util.*;
public class ValidAnagrams{
    public static boolean isAnagram(String s1,String s2){
            if(s1.length()!=s2.length())
                return false;
            HashMap<Character,Integer> hm=new HashMap<>();
            for(int i=0;i<s1.length();i++){
                hm.put(s1.charAt(i),hm.getOrDefault(s1.charAt(i),0)+1);
            }
            for(int i=0;i<s2.length();i++){
                if(hm.get(s2.charAt(i))!=null){
                    if(hm.get(s2.charAt(i))==1){
                        hm.remove(s2.charAt(i));
                    }
                    else{
                        hm.put(s2.charAt(i),hm.get(s2.charAt(i))-1);
                    }
                }
                else return false;
                
            }
            return hm.isEmpty();
    }
    public static void main(String args[]){
        String s1="knee";
        String s2="keen";
        System.out.println(isAnagram(s1,s2));
    }
}