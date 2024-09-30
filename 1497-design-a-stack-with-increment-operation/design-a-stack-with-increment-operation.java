class CustomStack {
ArrayList<Integer> ds;
int sz;
    public CustomStack(int maxSize) {
  ds=new ArrayList<>();      
    sz=maxSize;
    }
    
    public void push(int x) {
        
        if(ds.size()>=sz) return;
        ds.add(x);
        //System.out.println(ds);
    }
    
    public int pop() {
        if(ds.size()==0) return -1;
        int val=ds.get(ds.size()-1);

        ds.remove(ds.size()-1);
               // System.out.println(ds);

        return val;
    }
    
    public void increment(int k, int val) {
        if(k>ds.size()){
            for(int i=0;i<ds.size();i++){
                ds.set(i,ds.get(i)+val);
            }
        }
        else{
             for(int i=0;i<k;i++){
                ds.set(i,ds.get(i)+val);
            }
        }
               // System.out.println(ds);

    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */