 class DisjointSet{
    List<Integer> parent=new ArrayList<>();
    List<Integer> size=new ArrayList<>();
 public DisjointSet(int n){
for(int i=0;i<n;i++){

    parent.add(i);
    size.add(0);
}
}



int findUpar(int node){
    if(node==parent.get(node)){
return node;
    }
    int ulp=findUpar(parent.get(node));
parent.set(node,ulp);
return parent.get(node);
}
public  void unionBySize(int u,int v){
    int ulp_u=findUpar(u);
    int ulp_v=findUpar(v);
if(ulp_u==ulp_v) return ;

if(size.get(ulp_u)<size.get(ulp_v)){

    parent.set(ulp_u,ulp_v);
    size.set(ulp_v,size.get(ulp_u)+size.get(v));
}
else {
        parent.set(ulp_v,ulp_u);
    size.set(ulp_u,size.get(ulp_u)+size.get(v));
}

}



}


class Solution {
    public int makeConnected(int n, int[][] connections) {
        DisjointSet ds=new DisjointSet(n);
int extraEdge=0;
for(int i=0;i<connections.length;i++){

if(ds.findUpar(connections[i][0])==ds.findUpar(connections[i][1])){
extraEdge++;
}else{
ds.unionBySize(connections[i][0],connections[i][1]);

}
}
int nc=0;
for(int i=0;i<n;i++){
    if(i==ds.parent.get(i)){
nc++;
    }
}

int ans=nc-1;
if(extraEdge>=ans)
{
    return ans;
}
return -1;


    }
}