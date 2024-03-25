import java.util.*;
public class WordBreak{
    static class Node {
        Node[] child=new Node[26];
        Boolean eof=false;
        Node(){
            for(int i=0;i<child.length;i++){
                child[i]=null;
            }
        }
    }
    static Node root=new Node();
    public static void insert(String s){
        Node curr=root;
        for(int i=0;i<s.length();i++){
            int idx=s.charAt(i)-'a';
            if(curr.child[idx]==null)
                curr.child[idx]=new Node();
            curr=curr.child[idx];
        }
        curr.eof=true;
    }

    public static Boolean Search(String s){
        Node curr=root;
        for(int i=0;i<s.length();i++){
            int idx=s.charAt(i)-'a';
            if(curr.child[idx]==null)
                return false;
            curr=curr.child[idx];
        }
        return curr.eof==true;
    }

    public static Boolean Wordbreak(String s){
        if(s.length()==0)
        return true;
        for(int i=1;i<=s.length();i++){ 
            if(Search(s.substring(0,i)) && Wordbreak(s.substring(i)))
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        String word[]={"i","like","sam","samsung","what"};
        for(int i=0;i<word.length;i++){
            insert(word[i]);
        }
        String s="ilikesamsung";
        System.out.println( Wordbreak(s));
        
    }
}