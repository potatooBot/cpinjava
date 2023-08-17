package Oracle;

import java.util.*;

class Node implements Comparator<Node>
{
    private int v;
    private int weight;

    Node(int _v, int _w) { v = _v; weight = _w; }

    Node() {}

    int getV() { return v; }
    int getWeight() { return weight; }


    public int compare(Node node1, Node node2)
    {
        if (node1.weight < node2.weight)
            return -1;
        if (node1.weight > node2.weight)
            return 1;
        return 0;
    }
}
public class shivam_ques {
    static void shortestPath(int s, ArrayList<ArrayList<Node>> adj, int N)
    {
        int dist[] = new int[N];

        for(int i = 0;i<N;i++) dist[i] = 100000000;
        dist[s] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<Node>(N, (Comparator<? super Node>) new Node());
        pq.add(new Node(s, 0));

        while(pq.size() > 0) {
            Node node = pq.poll();

            for(Node it: adj.get(node.getV())) {
                if(dist[node.getV()] + it.getWeight() < dist[it.getV()]) {
                    dist[it.getV()] = dist[node.getV()] + it.getWeight();
                    pq.add(new Node(it.getV(), dist[it.getV()]));
                }
            }
        }

     if(dist[N]== 100000000){
         System.out.println("NOT POSSIBLE");
     }
     else {
         System.out.println(dist[N]);
     }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        ArrayList<ArrayList<Node>> adjList=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            ArrayList<ArrayList<Node>> temp=new ArrayList<>();

        }
        for (int i = 0; i <r ; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
    adjList.get(a).add(new Node(b,c));
    adjList.get(b).add(new Node(a,c));
        }
        shortestPath(1,adjList,n);
    }
}
