class MyCalendar {
ArrayList<ArrayList<Integer>> ds;
    public MyCalendar() {
        ds=new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        Collections.sort(ds,(a,b)->Integer.compare(a.get(1),b.get(1)));
      //  System.out.println(start+" "+end+" "+ds);
        for(int i=0;i<ds.size();i++){
            if((ds.get(i).get(0)<=start&&ds.get(i).get(1)>=start) || (ds.get(i).get(0)<=end-1&&ds.get(i).get(1)>=end-1) ||(ds.get(i).get(0)>start &&ds.get(i).get(0)<end-1)) 
            return false;

        }

/*for(int i=0;i<ds.size()-1;i++){
    if(ds.get(i).get(1)<=end &&start<ds.get(i+1).get(0)){
        ds.get(i).set(1,end-1);
        return true;
    }
}*/

    ArrayList<Integer> list=new ArrayList<>();

        list.add(start);
        list.add(end-1);
        ds.add(new ArrayList<>(list));

        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */