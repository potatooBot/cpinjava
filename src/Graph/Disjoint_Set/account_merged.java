package Graph.Disjoint_Set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.*;
public class account_merged {
    public  static List<List<String>> accountsMerge(List<List<String>> accounts) {

int n=accounts.size();
DisjoinSet ds=new DisjoinSet(n);
        HashMap<String,Integer> map=new HashMap<>();
        for (int i = 0; i <n ; i++) {
            for (int j = 1; j <accounts.get(i).size() ; j++) {
                String mail=accounts.get(i).get(j);
                if(map.containsKey(mail)==false){
                    map.put(accounts.get(i).get(j),i);
                }
                else {
                    ds.unionBysize(i,map.get(mail));
                }
            }
        }List <String>[] merge=new ArrayList[n];
        List<List<String>> ans=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            merge[i]=new ArrayList<>();
        }
        for (Map.Entry<String, Integer> entry:map.entrySet()
             ) {
String mail= entry.getKey();
int node=ds.findUlp(entry.getValue());
merge[node].add(mail);
        }


        for (int i = 0; i <n; i++) {
            if(merge[i].size()==0) continue;
            Collections.sort(merge[i]);
            List<String> temp=new ArrayList<>();
            temp.add(accounts.get(i).get(0));
            for (String it:
                 merge[i]) {
                temp.add(it);
            }
            ans.add(temp);
        }



        return ans;
    }
    public static void main(String[] args) {
        String [][] accounts = {{"John","johnsmith@mail.com","john_newyork@mail.com"},{"John","johnsmith@mail.com","john00@mail.com"},
                {"Mary","mary@mail.com"},{"John","johnnybravo@mail.com"}};

        List<List<String>> acc=new ArrayList<>();
        for (int i = 0; i <accounts.length ; i++) {
            acc.add(new ArrayList<>(List.of(accounts[i])));
        }
    List<List<String>> ans=accountsMerge(acc);
        System.out.println(ans);
    }
}
