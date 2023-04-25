class Node{
    Node prev,next;
    int key,val;
    Node(int key,int val ){
        this.key=key;
        this.val=val;
    }
}
class LRUCache {
Node head=new Node(0,0);
Node tail=new Node(0,0);
int cap=0;
HashMap<Integer,Node> map=new HashMap<>();
    public LRUCache(int capacity) {
        cap=capacity;
        head.next=tail;
        tail.prev=head;
    }

    public int get(int key) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            remove(node);
            insert(node);
            return node.val;
        }
        else {
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
           Node node=map.get(key);
            remove(node);
        }
        if(cap==map.size()){
            remove(tail.prev);
        }
        insert(new Node(key,value));
    }
    public void remove(Node node){
        map.remove(node.key);
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    public void insert(Node node){
        map.put(node.key,node);
        Node headNext=head.next;
        head.next=node;
        node.prev=head;
        node.next=headNext;
        headNext.prev=node;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */