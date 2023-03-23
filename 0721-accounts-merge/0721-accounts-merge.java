class DisjoinSet{
    List <Integer> rank=new ArrayList<>();
    List <Integer> parent=new ArrayList<>();
    List <Integer> size=new ArrayList<>();
    public DisjoinSet(int n){
        for (int i = 0; i <=n ; i++) {
            rank.add(0);
            parent.add(i);
            size.add(1);
        }
    }
    public int findUlp(int node){
        if(parent.get(node)==node){
            return node;
        }
        int ulp=findUlp(parent.get(node));
        parent.set(node,ulp);
return parent.get(node);
        }
        public void unionByRank(int u,int v) {
int ulp_u=findUlp(u);
int ulp_v=findUlp(v);
if(ulp_u==ulp_v) return;
if(rank.get(ulp_u)<rank.get(ulp_v)){
    parent.set(ulp_u,ulp_v);
}
else if(rank.get(ulp_v)<rank.get(ulp_u)){
    parent.set(ulp_v,ulp_u);
}
else {
    parent.set(ulp_v,ulp_u);
    int rankU=rank.get(ulp_u);
    rank.set(ulp_u,rankU+1);
}
        }
         public void unionBysize(int u,int v){
        int ulp_u=findUlp(u);
        int ulp_v=findUlp(v);
        if(rank.get(ulp_u)<rank.get(ulp_v)){
            parent.set(ulp_u,ulp_v);
size.add(ulp_v, size.get(ulp_u)+ size.get(ulp_v));
        }

        else {
            parent.set(ulp_v,ulp_u);
            size.add(ulp_u, size.get(ulp_u)+ size.get(ulp_v));
        }
    }

    }
class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        
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
}