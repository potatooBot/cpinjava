class MyCircularDeque {
Deque <Integer> dq;

int sz;
    public MyCircularDeque(int k) {
        dq=new ArrayDeque<>();
    sz=k;
    }
    
    public boolean insertFront(int value) {
        if(dq.size()==sz) return false;
        dq.offerFirst(value);
        return true;
    }
    
    public boolean insertLast(int value) {
         if(dq.size()==sz) return false;
        dq.offerLast(value);
        return true;
    }
    
    public boolean deleteFront() {
        if(dq.size()==0) return false;
int val= dq.pollFirst();
return true;
    }
    
    public boolean deleteLast() {
         if(dq.size()==0) return false;
int val= dq.pollLast();
return true;
    }
    
    public int getFront() {
        if(dq.size()==0) return -1;
        return dq.peekFirst();
    }
    
    public int getRear() {
        if(dq.size()==0) return -1;
           return dq.peekLast();
    }
    
    public boolean isEmpty() {
        return dq.size()==0?true:false;
    }
    
    public boolean isFull() {
            return dq.size()==sz?true:false; 
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */