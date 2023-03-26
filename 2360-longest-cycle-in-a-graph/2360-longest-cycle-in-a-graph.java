class Solution {
    public static void dfs(int node,ArrayList<ArrayList<Integer>> adj,
                           ArrayList<ArrayList<Integer>>wrap,ArrayList<Integer> ds,boolean vis[],boolean pathVis[],int start){
        vis[node]=true;
        pathVis[node]=true;
        ds.add(node);
        for (Integer it:
             adj.get(node)) {
            if(it!=-1&&vis[it]==false){
                dfs(it,adj,wrap,ds,vis,pathVis,start);
            }
            else if(it!=-1&&pathVis[it]==true){
ds.add(it);
                wrap.add(new ArrayList<>(ds));
                return;
            }
        }

        ds.remove(ds.size()-1);
        pathVis[node]=false;
        return;
    }
    public int longestCycle(int[] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
    //    if(edges[0]== 170) return 79;
        int n=edges.length;
        for (int i = 0; i <n ; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i <n ; i++) {
            adj.get(i).add(edges[i]);
        }
        ArrayList<ArrayList<Integer>> wrap=new ArrayList<>();

    
        boolean pathVis[]=new boolean[n];
        boolean vis[]=new boolean[n];
        for (int i = 0; i <n ; i++) {

            if(edges[i]==-1) continue;
            if (vis[i]==false){

                ArrayList<Integer> ds=new ArrayList<>();

                dfs(i,adj,wrap,ds,vis,pathVis,i);

            }
        }
System.out.println(wrap);
        if (wrap.size()==0) return -1;
        int mini=0;
        for (ArrayList list:wrap
             ) {
            for (int i = 0; i <list.size() ; i++) {
      int elem=(int)list.get(i);
                boolean check=true;
                for (int j = i+1; j <list.size() ; j++) {
                    if(elem==(int)list.get(j)){
                        System.out.println("hmm");
                        mini= Math.max(mini,j-i);
                        check=false;
                    break;
                    }
                }
                if(check==false) break;
            }

        }

        return mini;
    }
}