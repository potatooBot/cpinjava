class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        
        TreeMap<String,Integer> map=new TreeMap<>();
        int maxi=Integer.MIN_VALUE;
        for (int i = 0; i < messages.length ; i++) {
            String splitted[]=messages[i].split(" ");
            if(map.containsKey(senders[i])){
                maxi= Math.max(map.get(senders[i])+splitted.length,maxi);
                map.put(senders[i],map.get(senders[i])+splitted.length);
            }
            else {
                map.put(senders[i],splitted.length);
                maxi=Math.max(maxi, splitted.length);
            }
        }
        String ans="";
        for (Map.Entry<String,Integer> entry:
             map.entrySet()) {
            if(entry.getValue()==maxi){
                ans=(String) entry.getKey();
            }
        }
return ans;
    }
}