package DSA.Stacks.Sum_of_subarray;

import java.util.ArrayList;

public class sum_of_subarray {
    public static long subarrayRanges(int N, int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i; j <arr.length ; j++) {
                list.add(arr[j]-arr[i]);
            }
        }
       long sum=0;
        for (int i = 0; i <list.size() ; i++) {
            sum=sum+list.get(i);
        }

    return sum;    // code here
    }
    public static void main(String[] args) {
        int n = 4;
       int arr[ ] = {-233, -366, -200, -531, 24, -222, -342, 262, -236, 5, -555,
               -419, 127, 261, -209, 295, 242, 127, -264, -309, -96, 202, -547, -408, -318, -279,
               16, 18, 195, -253, 26, 71, -162, 169, 212, -33, -401, -665, 194, 3, 111, -378};
       long ans=subarrayRanges(n,arr);
        System.out.println(ans
        );

    }
}
