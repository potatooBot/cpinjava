package Graph.Disjoint_Set.Bridge_Edge_In_Graph;
import java.util.*;
class DisjointSet{
    List<Integer> parent=new ArrayList<>();
    List<Integer> size=new ArrayList<>();

    public DisjointSet(int n){
        for(int i=0;i<=n;i++){
            size.add(1);
            parent.add(i);
        }
    }


    public int findUpar(int node){
        if(node==parent.get(node)){
            return node;
        }
        int ulp=findUpar(parent.get(node));
        parent.set(node,ulp);
        return parent.get(node);
    }

    public void unionBySize(int u,int v){
        int ulp_u=findUpar(u);
        int ulp_v=findUpar(v);
        if (ulp_u == ulp_v) return;
        if(size.get(ulp_u)<size.get(ulp_v)){
            parent.set(ulp_u,ulp_v);
            size.set(ulp_v,size.get(ulp_u)+size.get(ulp_v));
        }
        else{
            parent.set(ulp_v,ulp_u);
            size.set(ulp_u,size.get(ulp_u)+size.get(ulp_v));
        }

    }

}
public class bridge_edge_in_graph {
   static int isBridge(int V, ArrayList<ArrayList<Integer>> adj,int c,int d)
    {
        DisjointSet ds=new DisjointSet(V+1);
        System.out.println(adj);
        for(int i=0;i<V;i++){
            int u=adj.get(i).get(0);
            int v=adj.get(i).get(1);
            if((u==c&&v==d)||(u==d&&v==c)){
                continue;
            }
            ds.unionBySize(u,v);

        }
        int cnt=0;
        for(int i=0;i<V;i++){
            if(ds.parent.get(i)==i){
                cnt++;
            }
        }

        if(cnt>1){
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int v=3;
        for (int i = 0; i <v ; i++) {
            adj.add(new ArrayList<>());
        }
        int arr[][]={{0,1},{1,2},{2,3}};
        for (int i = 0; i <arr.length ; i++) {
            adj.get(i).add(arr[i][0]);
            adj.get(i).add(arr[i][1]);
        }
   int ans=isBridge(v,adj,1,2);
        System.out.println(ans);
    }
}
