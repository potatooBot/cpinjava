//Given a value V, if we want to make a change for V Rs, and we have an infinite supply of each of the denominations in Indian currency, i.e., we have an infinite supply of { 1, 2, 5, 10, 20, 50, 100, 500, 1000} valued coins/notes, what is the minimum number of coins and/or notes needed to make the change?
//
//
//
//
//
//        Examples:
//
//
//
//        Input: V = 70
//        Output: 2
//        We need a 50 Rs note and a 20 Rs note.
//
//        Input: V = 121
//        Output: 3
//        We need a 100 Rs note, a 20 Rs note and a 1 Rs coin.
//
//        Solution: Greedy Approach.
//        Approach: A common intuition would be to take coins with greater value first. This can reduce the total number of coins needed. Start from the largest possible denomination and keep adding denominations while the remaining value is greater than 0.


//Algorith  (Greedy):
//        Algorithm:
//
//
//
//        Sort the array of coins in decreasing order.
//        Initialize result as empty.
//        Find the largest denomination that is smaller than current amount.
//        Add found denomination to result. Subtract value of found denomination from amount.
//        If amount becomes 0, then print result.
//        Else repeat steps 3 and 4 for new value of V.

        package Greedy;

import java.util.ArrayList;
import java.util.List;

public class minimum_number_of_coins {
    static void minPartition(int n)
    {
        int  curency[]={ 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
        List <Integer> list=new ArrayList<>();
        for (int i = 0; i < curency.length ; i++) {
            if(n<=0) break;
            if(n>curency[curency.length-1]){

n=n-curency[curency.length-1];
list.add(curency[curency.length-1]);
i=0;
            }


            if(n<curency[i]){
                n=n-curency[i-1];
                list.add(curency[i-1]);
                i=0;
            }
            if(n==curency[i]){
                n=n-curency[i];
                list.add(curency[i]);
                i=0;
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
    int n=11;
    minPartition(n);
    }
}


//Geeks for geeks solution
//static int deno[] = {1, 2, 5, 10, 20,
//        50, 100, 500, 1000};
//    static int n = deno.length;
//
//    static void findMin(int V)
//    {
//        // Initialize result
//        Vector<Integer> ans = new Vector<>();
//
//        // Traverse through all denomination
//        for (int i = n - 1; i >= 0; i--)
//        {
//            // Find denominations
//            while (V >= deno[i])
//            {
//                V -= deno[i];
//                ans.add(deno[i]);
//            }
//        }
//
//        // Print result
//        for (int i = 0; i < ans.size(); i++)
//        {
//            System.out.print(
//                    " " + ans.elementAt(i));
//        }
//    }