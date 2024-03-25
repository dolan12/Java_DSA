import java.util.*;

public class IternaryTickets{
    public static String findStart(HashMap<String,String> map){
        HashMap<String,String> revmap=new HashMap<>();
        for(String key: map.keySet()){
            revmap.put(map.get(key),key);
        }
        for(String key: map.keySet()){
            if(! revmap.containsKey(key))
            return key;
        }
        return null;
    }
    public static void main(String args[]){
        HashMap<String,String> map=new HashMap<>();
        map.put("chennai","bengaluru");
        map.put("mumbai","delhi");
        map.put("goa","chennai");
        map.put("delhi","goa");
        String start=findStart(map);
        System.out.print(start);
        for(String key:map.keySet()){

            System.out.print("->"+map.get(start) );
            start=map.get(start);
        }
    }
}