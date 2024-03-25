public class Prefix{
    static class Node{
        Node[] child=new Node[26];
        Boolean eof=false;
        int freq=1;
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
            if(curr.child[idx]==null){
                curr.child[idx]=new Node();
            }
            else{
                curr.child[idx].freq++;
            }
            
            curr=curr.child[idx];
        }
        curr.eof=true;
    }
    public static void Uniqueprefix(String s){
        Node curr=root;
        for(int i=0;i<s.length();i++){
            if(curr.child[s.charAt(i)-'a'].freq==1){
                System.out.println(s.substring(0,i+1));
                break;
            }
            curr=curr.child[s.charAt(i)-'a'];
        }
    }
    public static void main(String args[]){
        String arr[]={"zebra","dog","duck","dove"};
        for(int i=0;i<arr.length;i++){
            insert(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
           Uniqueprefix(arr[i]); 
        }
        
    }
}