package Graph;
import java.util.*;
class Pair{
    int distance;
    int node;
    public Pair(int distance,int node){
       this.distance=distance;
       this.node=node;
    }
}
public class dijkatra_algorithm {
    public static int[] dijkstra(int V,ArrayList <ArrayList<ArrayList<Integer>>>adj,int src){
        // Create a priority queue for storing the nodes as a pair {dist, node
        // where dist is the distance from source to the node.
PriorityQueue <Pair> pq=new PriorityQueue<>((x,y)-> x.distance -y.distance);
int distArr[]=new int[V];
Arrays.fill(distArr,100000);
distArr[src]=0;
pq.add(new Pair(0,src));
while (!pq.isEmpty()){
    int dis=pq.peek().distance;
    int node=pq.peek().node;
pq.remove();
    for (int i = 0; i <adj.get(node).size() ; i++) {
int edgWeight=adj.get(node).get(i).get(1);
int adjNode=adj.get(node).get(i).get(0);


if(dis +edgWeight<distArr[adjNode]){
    distArr[adjNode]=dis+edgWeight;
    pq.add(new Pair(dis+edgWeight,adjNode));
}
    }
}
return distArr;
    }
    public static void main(String[] args) {
        int V = 3, E=3,src=2;
        ArrayList<Integer> node1 = new ArrayList<Integer>() {{add(1);add(1);}};
        ArrayList<Integer> node2 = new ArrayList<Integer>() {{add(2);add(6);}};
        ArrayList<Integer> node3 = new ArrayList<Integer>() {{add(2);add(3);}};
        ArrayList<Integer> node4 = new ArrayList<Integer>() {{add(0);add(1);}};
        ArrayList<Integer> node5 = new ArrayList<Integer>() {{add(1);add(3);}};
        ArrayList<Integer> node6 = new ArrayList<Integer>() {{add(0);add(6);}};

        ArrayList<ArrayList<Integer>> inter1 = new ArrayList<ArrayList<Integer>>(){
            {
                add(node1);
                add(node2);
            }
        };
        ArrayList<ArrayList<Integer>> inter2 = new ArrayList<ArrayList<Integer>>(){
            {
                add(node3);
                add(node4);
            }
        };
        ArrayList<ArrayList<Integer>> inter3 = new ArrayList<ArrayList<Integer>>(){
            {
                add(node5);
                add(node6);
            }
        };
        ArrayList<ArrayList<ArrayList<Integer>>> adj= new ArrayList<ArrayList<ArrayList<Integer>>>(){
            {
                add(inter1); // for 1st node
                add(inter2); // for 2nd node
                add(inter3); // for 3rd node
            }
        };
        //add final values of adj here.

         int result[]=dijkstra(V,adj,src);

        for(int i=0;i<V;i++){
            System.out.print(result[i]+" ");
        }
        System.out.println();
    }
}
