package Greedy;
//Given weights and values of N items, we need to put these items in a knapsack of capacity W to get the maximum total value in the knapsack.
//        Note: Unlike 0/1 knapsack, you are allowed to break the item.
//
//
//
//        Example 1:
//
//        Input:
//        N = 3, W = 50
//        values[] = {60,100,120}
//        weight[] = {10,20,30}
//        Output:
//        240.00
//        Explanation:Total maximum value of item
//        we can have is 240.00 from the given
//        capacity of sack.
//        Example 2:
//
//        Input:
//        N = 2, W = 50
//        values[] = {60,100}
//        weight[] = {10,20}
//        Output:
//        160.00
//        Explanation:
//        Total maximum value of item
//        we can have is 160.00 from the given
//        capacity of sack.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
 class ItemValue {

    int value, weight;

    // Item value function
    public ItemValue(int val, int wt)
    {
        this.weight = wt;
        this.value = val;
    }
}
class Mycompare implements Comparator<ItemValue>{
     @Override
     public int compare(ItemValue item1,ItemValue item2){
         double compr1= (double) (item1.value)/(double) (item1.weight);
         double compr2= (double) (item2.value)/(double) (item2.weight);

         if(compr1<compr2) return 1;
         else return -1;
     }
}
public class fractional_knapsack {

    public static void getMaxValue(ItemValue [] arr, int capacity){
        Mycompare mc_for_knap=new Mycompare();
        Arrays.sort(arr,mc_for_knap);
        double total=0d;
        for (ItemValue ele:
             arr) {
int currWe= ele.weight;
int currPro= ele.value;

if(capacity-currWe>=0){
    capacity=capacity-currWe;
    total=total+currPro;
}
else {
    double fraction=(double)capacity/(double) currWe;
    total=total +fraction*currPro;
    capacity=(int)(capacity- (fraction*currWe));
}
        }
        System.out.println(total);
    }

    // Driver code
    public static void main(String[] args)
    {

        ItemValue[] arr = { new ItemValue(60, 10),
                new ItemValue(100, 20),
                new ItemValue(120, 30) };

        int capacity = 50;

       getMaxValue(arr, capacity);

        // Function call
//        System.out.println(maxValue);
    }
}

