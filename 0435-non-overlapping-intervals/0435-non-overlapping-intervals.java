class interval{
    int start;
    int end;
    public interval(int s,int e){
         this.start=s;
         this.end=e;
    }
}
class mycompareforintervals implements Comparator<interval>{
    @Override
    public int compare(interval o1, interval o2) {
          if (o1.end != o2.end) return o1.end - o2.end;  //first sort by end
                return o2.start - o1.start; 

    }
}
class Solution {
     public int eraseOverlapIntervals(int[][] inter) {
int start[]=new int[inter.length];
int end[]=new int[inter.length];
        for (int i = 0; i <inter.length ; i++) {
            start[i]=inter[i][0];
        }
        for (int i = 0; i <inter.length ; i++) {
            end[i]=inter[i][1];
        }
        ArrayList <interval> list=new ArrayList<>();
        for (int i = 0; i <end.length ; i++) {
            list.add(new interval(start[i],end[i]));
        }
        int count=0;
       mycompareforintervals my_custom=new mycompareforintervals();
        Collections.sort(list,my_custom);
        int size= list.size();
        for (int i = 0; i <list.size()-1 ; i++) {
  if(list.get(i).end>list.get(i+1).start){
      list.remove(i+1);
      count++;
      i=i-1;
  }
        }
        return count;
    }
}