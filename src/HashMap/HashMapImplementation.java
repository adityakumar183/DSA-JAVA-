package HashMap;
import java.util.*;

public class HashMapImplementation {
    static class MyHashMap<K, V>{    // K & V are data type which we are not showing
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;

        private class Node{
            K  key;
            V value;
            Node(K key,V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n;    // the number of entries in map
        private LinkedList<Node>[] buckets;

        private void initBuckets(int N){   // N - capacity/size of buckets array
            buckets = new LinkedList[N];
            for(int i = 0; i < buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }
        }

        private int HashFunc(K key){
            int hc = key.hashCode();
            return (Math.abs(hc)) % buckets.length;
        }

        // Traverse the ll and looks for a node with key, if found it return it's index otherwise it returns null
        private int searchInBucket(LinkedList<Node> ll, K key){
            for(int i = 0; i < ll.size(); i++){
                if(ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }

        public MyHashMap(){   // constructor
            initBuckets(DEFAULT_CAPACITY);
        }

        public int capacity(){
            return buckets.length;
        }

        public float loadFactor(){
            return (n*1.0f)/buckets.length;
        }

        private void rehash(){
            LinkedList<Node>[] oldBuckets = buckets;
            initBuckets(oldBuckets.length * 2);
            n = 0;
            for(var bucket : oldBuckets){
                for(var node : bucket){
                    put(node.key, node.value);
                }
            }
        }

        public int size(){     // return the number of entries in map
            return n;
        }

        public void put(K key,V value){     // insert/update
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket,key);
            if(ei == -1){  // key doesn't exist, we have to insert a new node
                Node node = new Node(key,value);
                currBucket.add(node);
                n++;
            }
            else{  // update case
                Node currNode = currBucket.get(ei);
                currNode.value = value;
            }

            if(n >= buckets.length * DEFAULT_LOAD_FACTOR){
                rehash();
            }
        }

        public V get(K key){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket,key);
            if(ei != -1){   // key exists
                Node currNode = currBucket.get(ei);
                return currNode.value;
            }
            // key doesn't exist
            return null;
        }

        public V remove(K key){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket,key);
            if(ei != -1){     // key exist
                Node currNode = currBucket.get(ei);
                V val = currNode.value;
                currBucket.remove(ei);
                n--;
                return val;
            }
            // key doesn't exist
            return null;
        }
    }

    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        System.out.println("Testing put");
        map.put("a", 1);
        map.put("b", 2);

        System.out.println("CAPACITY : " + map.capacity());   // 4
        System.out.println("LOAD FACTOR : " + map.loadFactor());  // 0.5 < 0.75

        map.put("c", 3);
        map.put("x", 61);
        map.put("y", 72);
        map.put("c", 30);
        System.out.println("Testing size : " + map.size() );   // 5

        // testing get
        System.out.println(map.get("x"));  // 61
        System.out.println(map.get("y"));  // 72
        System.out.println(map.get("c"));  // 30

        System.out.println("CAPACITY : " + map.capacity());   // 8
        System.out.println("LOAD FACTOR : " + map.loadFactor());  // 0.625  < 0.75
    }
}
