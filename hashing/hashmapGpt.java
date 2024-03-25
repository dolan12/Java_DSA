import java.util.LinkedHashSet;
public class hashmapGpt{
        static class MyHashMap<K, V> {
        private static final int INITIAL_CAPACITY = 16;
        private LinkedHashSet<Node<K, V>>[] table;
        private int size;

        public MyHashMap() {
            this.table = new LinkedHashSet[INITIAL_CAPACITY];
            this.size = 0;
        }

        public void put(K key, V value) {
            int index = hash(key) % table.length;

            if (table[index] == null) {
                table[index] = new LinkedHashSet<>();
                table[index].add(new Node<>(key, value));
                size++;
            } else {
                LinkedHashSet<Node<K, V>> set = table[index];
                for (Node<K, V> node : set) {
                    if (node.key.equals(key)) {
                        node.value = value; // Update existing key's value
                        return;
                    }
                }
                set.add(new Node<>(key, value));
                size++;
            }
        }

        public V get(K key) {
            int index = hash(key) % table.length;
            LinkedHashSet<Node<K, V>> set = table[index];

            if (set != null) {
                for (Node<K, V> node : set) {
                    if (node.key.equals(key)) {
                        return node.value;
                    }
                }
            }

            return null;
        }

        public void remove(K key) {
            int index = hash(key) % table.length;
            LinkedHashSet<Node<K, V>> set = table[index];

            if (set != null) {
                for (Node<K, V> node : set) {
                    if (node.key.equals(key)) {
                        set.remove(node);
                        size--;
                        return;
                    }
                }
            }
        }

        public int size() {
            return size;
        }

        private int hash(K key) {
            return key == null ? 0 : Math.abs(key.hashCode());
        }

        private static class Node<K, V> {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }
    }

    public static void  main(String args[]){
        MyHashMap<String,Integer> hm=new MyHashMap<>();
        hm.put("banana",10);
        hm.put("apple",50);
        hm.put("litchi",80);
        hm.put("guava",30);
        System.out.println(hm.get("banana"));

    }
    
}
