class Solution {
    public boolean isNStraightHand(int[] hand, int group) {
           TreeMap<Integer,Integer> map=new TreeMap<>();
        ArrayList<Integer> ds=new ArrayList<>();
        for(int ele:hand){
            map.put(ele,map.getOrDefault(ele,0)+1);
            ds.add(ele);
        }
        int cur=-1;
        Collections.sort(ds);

        for(int i=0;i<ds.size();i++){
            cur=ds.get(i);
            int cnt=1;
           // System.out.println(ds);
            while(cnt<=group){
                if(map.get(cur)!=null){
                    cnt++;
                   // System.out.println(cur);
                    map.put(cur,map.get(cur)-1);
                    if(map.get(cur)==0){
                        map.remove(cur);

                        //System.out.println(map);
                    }
                    ds.remove(Integer.valueOf(cur));
                    // System.out.println(ds);
                    cur++;
                }
                else{
                    return false;
                }

            }
            i--;
        }
        return true;
    }
}