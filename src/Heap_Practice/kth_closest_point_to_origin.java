package Heap_Practice;

//Time: O(NlogK), where N <= 10^4 is number of points.
//        Extra Space (don't count output as space): O(K), it's size of maxHeap.
import java.util.PriorityQueue;

public class kth_closest_point_to_origin {
    public static void kClosest(int[][] points, int k) {
        PriorityQueue <int[]> maxHeap=new PriorityQueue<>((n1,n2)->(n2[0]*n2[0]+n2[1]*n2[1])-(n1[0]*n1[0]+n1[1]*n1[1]));
        for (int [] p:points
             ) {
            maxHeap.offer(p);
            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        }
        int res[][]=new int[maxHeap.size()][2];
        int i=0;
        while (!maxHeap.isEmpty()){
            res[i++]=maxHeap.poll();
        }
        for (int j = 0; j < res.length ; j++) {
            for (int l = 0; l < res[0].length ; l++) {
                System.out.println(res[j][l]);
            }
        }
    }
    public static void main(String[] args) {
        int arr[][]={{2,3},{0,1},{1,4},{3,5}};
    kClosest(arr,2);
    }
}
