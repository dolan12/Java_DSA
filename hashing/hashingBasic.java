import java.util.*;
public class hashingBasic{
        static class HashMap<K,V>{//k ans v is generic 
        private class Node{
            K key;
            V val;
            public Node(K key,V value){
                this.key=key;
                this.val=value;
            }  
        }
        private int n;//size of the linkedList
        private int N;//bucket size
        private LinkedList<Node> buckets[];// size N

        @SuppressWarnings("unchecked")//to make this warning ignore
        public HashMap(){
            this.N=4;
            //create an array of linkedList
            this.buckets=new LinkedList[4];//warning as linkedList type is needed
            for(int i=0;i<4;i++){
                this.buckets[i]=new LinkedList<>();//to make a linkedlist in every bucket
            }

        }
        private int hashFunuction(K key){//it creates a bi for key
            int hc=key.hashCode();//it can returns neg or pos value
            return Math.abs(hc)% N ;
        }
        private int SearchInLL(K key,int bi){
            LinkedList<Node> ll=buckets[bi];//reach the array linkedList
            int di=0;//linkedList position
            for(int i=0;i<ll.size();i++){
                Node node=ll.get(i);
                if(node.key==key){
                    return di;
                }
                di++;
            }
            return -1;//if key not found
        }
        public void put(K key,V value){
            int bi=hashFunuction(key);//stores bucket index
            int di=SearchInLL(key,bi);//location where the element is possibly exist

            if(di!=-1){
                Node node=buckets[bi].get(di);//as buckets[bi] is an linkedlist
                node.val=value;
            }
            else{//if elem  not found
                buckets[bi].add(new Node(key,value));
                n++;
            }
            double lamda=(double) n/N;
            if(lamda>2.0){
                rehash();
            }
        }
        @SuppressWarnings("unchecked")
        public void rehash(){
            LinkedList<Node> oldBuck[]=buckets;
            buckets=new LinkedList[N*2];
            N=2*N;
            for(int i=0;i<buckets.length;i++){
                buckets[i]=new LinkedList<>();
            }
            
            //Nodes add in the new bucket
            for(int i=0;i<oldBuck.length;i++){
                LinkedList<Node> ll=oldBuck[i];
                for(int j=0;j<ll.size();i++){
                    Node node=ll.remove();
                    put(node.key,node.val);
                }
            }
        }
        
        public boolean containsKey(K key){
            int bi=hashFunuction(key);
            int di=SearchInLL(key,bi);

            if(di!=-1){
                return true;
            }
            else{
                return false;
            }
        }
        
        public V get(K key){
            int bi=hashFunuction(key);
            int di=SearchInLL(key,bi);

            if(di!=-1){
                Node node=buckets[bi].get(di);//as buckets[bi] is an linkedlist
                return node.val;
            }
            else{
                return null;
            }

        }

        
        public ArrayList<K> keyset(){
            ArrayList<K> keys=new ArrayList<>();

            for(int i=0;i<buckets.length;i++){
                LinkedList<Node> ll=buckets[i];

                for(Node node: ll){
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n==0;
        }

        public V remove(K key){
            int bi=hashFunuction(key);
            int di=SearchInLL(key,bi);

            if(di!=-1){
                Node node=buckets[bi].remove(di);//as buckets[bi] is an linkedlist
                n--;
                return node.val;
            }
            else{
                return null;
            }

            
            
        }
    }


    public static void main(String args[]){
        HashMap<String,Integer> hm=new HashMap<>();//not an inbuilt function
        hm.put("India",100);
        hm.put("china",120);
        hm.put("pakistan",20);
        hm.put("nepal",10);

        ArrayList<String> keys=hm.keyset();
        for(int i=0;i<keys.size();i++){
            System.out.println(keys.get(i));
        }
        System.out.println(hm.get("India"));
        System.out.println(hm.remove("nepal"));
        System.out.println(hm.containsKey("india"));


    }
}