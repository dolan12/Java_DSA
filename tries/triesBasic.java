public class triesBasic {
    static class Node{
            Node[] child=new Node[26];
            Boolean eof=false;//end of word
            Node(){
                for(int i=0;i<child.length;i++){
                    child[i]=null;
                }
            }
        }
        static Node root=new Node();//as in trie root node is empty
        public static void Insert(String s){
            Node curr=root;
            for(int i=0;i<s.length();i++){
                if(curr.child[s.charAt(i)-'a']==null){
                    curr.child[s.charAt(i)-'a']=new Node();
                }
                curr=curr.child[s.charAt(i)-'a'];
            }
            curr.eof=true;
        }

        public static Boolean Search(String s){
            Node curr= root;
            for(int i=0;i<s.length();i++){
                int idx=s.charAt(i)-'a';
                if(curr.child[idx]==null)
                return false;
                curr=curr.child[idx];
            }
            return curr.eof==true;
        }
    


    public static void main(String args[]){
        String[] word={ "i","the","there","thee","any"};
        for(int i=0;i<word.length;i++){
            Insert(word[i]);
        }
        System.out.println(Search("there"));
        
    }
}