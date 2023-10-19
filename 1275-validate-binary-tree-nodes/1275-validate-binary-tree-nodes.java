class Disjoint{
   List<Integer> parent=new ArrayList<>();
      List<Integer> size=new ArrayList<>();
     
public Disjoint(int n){
   
for(int i=0;i<n;i++){
    parent.add(i);
    size.add(1);
}
}

public  int findUpar(int node){
if(node==parent.get(node)){
    return node;
}
int ulp=findUpar(parent.get(node));
parent.set(node,ulp);
return parent.get(node);
}
public  void unionSize(int u,int v){
    int ulp_u=findUpar(u);
    int ulp_v=findUpar(v);
    if(ulp_u==ulp_v) return;


    if(size.get(ulp_u)<size.get(ulp_v)){
        parent.set(ulp_u,ulp_v);
        size.set(ulp_v,size.get(ulp_v)+size.get(ulp_u));
    }
    else{
        parent.set(ulp_v,ulp_u);
        size.set(ulp_u,size.get(ulp_v)+size.get(ulp_u));
    }
}


}
class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] left, int[] right) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
Disjoint ds = new Disjoint(n);
        for(int i=0;i<left.length;i++){
            adj.add(new ArrayList<>());
        }
   
        for(int i=0;i<n;i++){
            if(left[i]>=0){
                adj.get(i).add(left[i]);
            }
   
            if(right[i]>=0){
           
                   adj.get(i).add(right[i]);
            }
  
    
        }
        for(int i=0;i<n;i++){
            for(int node:adj.get(i)){
                ds.unionSize(i,node);
            }
        }
        int degree[]=new int[n];
          int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (ds.parent.get(i) == i) cnt++;
        }
      
        if(cnt>1) return false;
for(int i=0;i<n;i++){
     for(int node:adj.get(i)){
         degree[node]++;
     }
 }       
System.out.println(cnt);
System.out.println(Arrays.toString(degree));
cnt=0;
 for(int i=0;i<n;i++){
     if(i==left[i]||i==right[i]) return false;
     if(degree[i]>1){
         return false;
     }
     if(degree[i]==0){
         cnt++;
     }
 }
 if(cnt==0) return false;
 if(cnt>1) return false;
    return true;
    }
}