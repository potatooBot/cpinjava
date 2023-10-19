class MyLinkedList {
ArrayList<Integer> ds;
    public MyLinkedList() {
        ds=new ArrayList<>();
    }
    
    public int get(int index) {
        
        if(index>ds.size()-1) return -1;
        return ds.get(index);
    }
    
    public void addAtHead(int val) {
    
        if(ds.size()==0){
            ds.add(val);
        }
        else
        ds.add(0,val);
         // System.out.println(ds);
    }
    
    public void addAtTail(int val) {
        ds.add(val);
         //  System.out.println(ds);
    }
    
    public void addAtIndex(int index, int val) {
      if(index>ds.size()) return;
        ds.add(index,val);
          //  System.out.println(ds);
    }
    
    public void deleteAtIndex(int index) {
        if(index>=0&&index<=ds.size()-1)
        ds.remove(index);
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */