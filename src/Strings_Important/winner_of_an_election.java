package Strings_Important;
import java.util.*;
public class winner_of_an_election {
    public static String[] winner(String arr[], int n)
    {
        // add your code
        HashMap <String,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
int maxi=Integer.MIN_VALUE;
        for (Map.Entry<String,Integer> entry:
             map.entrySet()) {
            maxi=Math.max(maxi, entry.getValue());
        }
List<String> list=new ArrayList<>();;
String ans[]=new String[2];
        for (Map.Entry<String,Integer> entry:map.entrySet()
             ) {
            if(entry.getValue()==maxi){
            list.add(String.valueOf(entry.getKey()));
            }
        }

        Collections.sort(list);
    String str=list.get(0);

        for (Map.Entry<String,Integer> entry:
             map.entrySet()) {
            if(String.valueOf(entry.getKey())==str){
                ans[0]=entry.getKey();
                ans[1]=String.valueOf(entry.getValue());
            }
        }
        System.out.println(ans[0]);
        System.out.println(ans[1]);
        return ans;

    }
    public static void main(String[] args) {
        String Votes[] ={"john","johnny","jackie","johnny","john","jackie","jamie","jamie","john","johnny","jamie",
                "johnny","john"};
winner(Votes, Votes.length);
    }
}
