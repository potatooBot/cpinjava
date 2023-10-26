class Solution {
    public int minJumps(int[] arr) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
    int n=arr.length;
    for(int i=0;i<n;i++){
        if(map.containsKey(arr[i])){
            ArrayList<Integer> ds=map.get(arr[i]);
            ds.add(i);
            map.put(arr[i],ds);
        }
        else{
            ArrayList<Integer> ds=new ArrayList<>();
            ds.add(i);
            map.put(arr[i],ds); 
        }
    }


int steps=0;
    Queue<Integer> q=new LinkedList<>();
boolean vis[]=new boolean[n];
q.add(0);
vis[0]=true;
while(!q.isEmpty()){
    int size=q.size();
    for(int i=0;i<size;i++){

int node=q.peek();
q.remove();
if(node==n-1) return steps;
 ArrayList<Integer> ds=map.get(arr[node]);
ds.add(node-1);
ds.add(node+1);
   
for(int adjNode:ds){
    if(adjNode>=0&&adjNode<n&&vis[adjNode]==false){
        vis[adjNode]=true;
        q.add(adjNode);
    }
}
ds.clear();


    
    }
    steps++;
}

return steps;
    }

}