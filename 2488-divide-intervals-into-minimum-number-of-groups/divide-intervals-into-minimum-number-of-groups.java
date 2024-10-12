class Solution {
    public int minGroups(int[][] intervals) {
       /* long idx=0;
        Arrays.sort(inte,(a,b)->Integer.compare(a[0],b[0]));
        HashMap<Long,ArrayList<ArrayList<Integer>>> map=new HashMap<>();
for(int i=0;i<inte.length;i++){
     int a=inte[i][0];
     int b=inte[i][1];
     long cnt=0;
     boolean glob=false;
        for(Map.Entry<Long,ArrayList<ArrayList<Integer>>> entry :map.entrySet()){

            boolean flag=true;
            ArrayList<ArrayList<Integer>> ds=entry.getValue();
           // Collections.sort(ds,(c,d)->Integer.compare(c.get(0),d.get(0)));
            for(int j=0;j<ds.size();j++){
if((ds.get(j).get(0)<=a&&ds.get(j).get(1)>=a)||(ds.get(j).get(0)<=b&&ds.get(j).get(1)>=b) ||(ds.get(j).get(0)==a)||(ds.get(j).get(1)==a)||(ds.get(j).get(0)==b)||ds.get(j).get(1)==b   ){
    flag=false;
    break;
}
if(flag==false) break;
            }
            if(flag==true){
if(map.get(cnt)!=null){
    ArrayList<ArrayList<Integer>> val=map.get(cnt);
    ArrayList<Integer> pt=new ArrayList<>();
    pt.add(a);
    pt.add(b);
    val.add(new ArrayList<>(pt));
    map.put(cnt,val);
    glob=true;
    break;
}
    }


            cnt++; 
           }
        
 if(glob==false){
    ArrayList<ArrayList<Integer>> val=new ArrayList<>();
    ArrayList<Integer> pt=new ArrayList<>();
    pt.add(a);
    pt.add(b);
    val.add(new ArrayList<>(pt));
    map.put(idx,val);
    idx++;
 }
}
//System.out.println(map);
    return (int)idx;*/


   
  
        int n = intervals.length;
        int[] start_times = new int[n];
        int[] end_times = new int[n];

       
        for (int i = 0; i < n; i++) {
            start_times[i] = intervals[i][0];
            end_times[i] = intervals[i][1];
        }

    
        Arrays.sort(start_times);
        Arrays.sort(end_times);

        int end_ptr = 0, group_count = 0;

      
        for (int start : start_times) {
            if (start > end_times[end_ptr]) {
                end_ptr++;
            } else {
                group_count++;
            }
        }

        return group_count;
   

    }       
 
    
    
}