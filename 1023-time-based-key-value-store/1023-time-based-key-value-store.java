
class TimeMap {
HashMap<String,TreeMap<Integer,String>> map;
    public TimeMap() {
        map=new  HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(map.get(key)==null){
map.put(key,new TreeMap<>());
    }
    map.get(key).put(timestamp,value);
    }    
    public String get(String key, int timestamp) {
        if(map.get(key)==null) return "";
        String ans="";
        TreeMap<Integer,String> ds=map.get(key);
Integer t=ds.floorKey(timestamp);
if(t==null) return "";
else{
    ans=ds.get(t);
}
return ans ;
        }

    }


/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */