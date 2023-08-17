package Shivam_QUes.Qb;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
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

public class qb{
    static ArrayList<Integer> shortestPath(int s, ArrayList<ArrayList<Node>> adj, int N)
    {
        ArrayList <Integer> dist = new ArrayList();

        for(int i = 0;i<N;i++) dist.get(100000000);
        dist.set(s,0);

        PriorityQueue<Node> pq = new PriorityQueue<Node>(N, (Comparator<? super Node>) new Node());
        pq.add(new Node(s, 0));

        while(pq.size() > 0) {
            Node node = pq.poll();

            for(Node it: adj.get(node.getV())) {
                if(dist.get(node.getV()) + it.getWeight() < dist.get(it.getV())) {
                    dist.set(it.getV() ,dist.get(node.getV()) + it.getWeight());
                    pq.add(new Node(it.getV(), dist.get(it.getV())));
                }
            }
        }

  return dist;
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
        int mini=Integer.MAX_VALUE;
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
        ArrayList<Integer>  temp=  shortestPath(1, adjList, n);
           boolean flag=false;
            for (int j = 0; j <temp.size() ; j++) {
                if(temp.get(i)==100000000){
                    flag=true;
                    break;
                }
            }
            int sum=0;
            if(flag==false){

                for (int j = 0; j <temp.size() ; j++) {
                    sum=sum+temp.get(i);
                }
                mini=Math.min(sum,mini);
            }
        }
        if(mini==Integer.MAX_VALUE) {
            System.out.println(0);
        }
        else {
            System.out.println(mini);
        }
    }




}
