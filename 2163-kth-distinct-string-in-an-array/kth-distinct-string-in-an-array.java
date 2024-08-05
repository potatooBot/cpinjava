class Solution {
    public String kthDistinct(String[] arr, int k) {
        LinkedHashMap<String,Integer> set=new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            set.put(arr[i],set.getOrDefault(arr[i],0)+1);
        }
        int cnt=0;
        for(Map.Entry<String,Integer> entry:set.entrySet()){
            if(entry.getValue()==1){
            cnt++;
            if(cnt==k) return entry.getKey();
            }
        }
        
        return ""; 
    }
}