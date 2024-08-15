package Algorithm.Recursion;
import java.util.*;
public class print_all_sum_of_subsequence {
    /*public static void getSum(ArrayList<Integer> ds,int sum,int idx,List<Integer> arr,int N) {
        if (idx >= N) {
            ds.add(sum);
        }
        else{
            sum=sum+arr.get(idx);
            getSum(ds,sum,idx+1,arr,N);
            sum=sum- arr.get(idx);
            getSum(ds,sum,idx+1,arr,N);
        }
    }*/

    public static void getSum(ArrayList<Integer> ds, List<Integer> arr, int N) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0); // Start with the empty subset sum (0)

        for (int i = 0; i < N; i++) {
            int currentElement = arr.get(i);
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                int currentSum = queue.poll();
                // Add the current sum and the new subset sum including the current element
                queue.add(currentSum);
                queue.add(currentSum + currentElement);
            }
        }

        // Transfer all sums from the queue to the ds list
        ds.addAll(queue);
    }
    public static int findXor(int N, List<Integer> arr){
        ArrayList<Integer> ds=new ArrayList<>();
        getSum(ds,arr,N);
    int ans=0;

    HashSet<Integer> set=new HashSet<>();
       for (int ele:ds){
           set.add(ele);
       }
        for (int ele:set) {
            ans=ans^ele;
        }
    return ans;
    }
    public static void main(String[] args) {
List<Integer> ds=new ArrayList<>();
ds.add(1);
ds.add(2);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
ds.add(1);
        System.out.println(findXor(ds.size(),ds));
    }
}
