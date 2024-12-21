class Solution {
    public int buttonWithLongestTime(int[][] events) {
        HashMap<Integer,Integer> map=new HashMap<>();
    int time=0;
        for(int arr[]:events){
int cal=arr[1]-time;
time=arr[1];
if(map.containsKey(cal)==true)
{
    if(map.get(cal)>arr[0])
    map.put(cal,arr[0]);
}
else{
    map.put(cal,arr[0]);
}
        }

//System.out.println(map);
        int ans=0;
        int tm=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
       tm=Math.max(tm,entry.getKey());
 
 
        }
 return map.get(tm);
    }
}