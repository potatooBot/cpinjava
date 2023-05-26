package HashTable_Pract;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class sender_with_largest_word_count {
    static public String largestWordCount(String[] messages, String[] senders) {

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
        System.out.println(map);
return ans;
    }
    public static void main(String[] args) {
        String[] messages = {"p mmV","Lb WE u H x f YT","Rey","q","Y R","Ng","mP lo oA l jd y","CP y r N wHA","Bt l",
                "Y S xv MNS","WG vz","S pl l Dz fX D TpI","zGq","z S D"};
        String []senders = {"QMnVn","QMnVn","nkq","o","EEM","QMnVn","o","nkq","Gd","Gd","nkq","o","EEM","EEM"};
    String ans=largestWordCount(messages,senders);
        System.out.println(ans);
    }
}
