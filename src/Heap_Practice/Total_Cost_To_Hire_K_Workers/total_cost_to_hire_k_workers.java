package Heap_Practice.Total_Cost_To_Hire_K_Workers;
import java.util.*;
public class total_cost_to_hire_k_workers {
    static  public long totalCost(int[] costs, int k, int candidates) {
long sum=0;
PriorityQueue<Integer> left=new PriorityQueue<>();
PriorityQueue<Integer> right=new PriorityQueue<>();

int i=0;int j= costs.length-1;
while (k>0){

    while (left.size()<candidates&&i<=j){
        left.add(costs[i]);
        i++;
    }

    while (right.size()<candidates&&i<=j){
        right.add(costs[j]);
        j--;
    }

    int val1= left.size()>0?left.peek():Integer.MAX_VALUE;
    int val2= right.size()>0?right.peek():Integer.MAX_VALUE;


    if(val1<=val2){
      sum=sum+val1;
      left.poll();
    }
    else {
        sum=sum+val2;
        right.poll();
    }
k--;

}



return (long)sum;
    }
    public static void main(String[] args) {
        int costs []= {1,2,4,1}; int k = 3, candidates = 3;
    long ans=totalCost(costs,k,candidates);
        System.out.println(ans);
    }
}
