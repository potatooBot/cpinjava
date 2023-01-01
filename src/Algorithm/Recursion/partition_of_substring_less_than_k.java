package Algorithm.Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class partition_of_substring_less_than_k {

    public static int[] closestPrimes(int a, int b) {

        int j, flag;
        List<Integer> res = new ArrayList<>();
        for (int i = a; i <= b; i++) {


            if (i == 1 || i == 0)
                continue;


            flag = 1;

            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }

            // flag = 1 means i is prime
            // and flag = 0 means i is not prime
            if (flag == 1)
                res.add(i);
        }
        Collections.sort(res);
        System.out.println(res);
        int ans[] = new int[2];
        if (res.size() <= 1) {
            ans[0] = -1;
            ans[1] = -1;
            return ans;
        }
        int ini = res.get(1) - res.get(0);
        int ini2 = res.get(res.size() - 1) - res.get(res.size() - 2);
        if (ini<=ini2){

                ans[0] =res.get(0);
                ans[1] = res.get(1);
return ans;

    }

        if (ini>=ini2){
            ans[1] = res.get(res.size()-2);
            ans[0] =res.get(res.size()-1);
return ans;

        }

return ans;
    }
    public static void main(String[] args) {

       int [] res=closestPrimes(4,6);
        for (int i = 0; i < res.length ; i++) {
            System.out.println(res[i]);
        }

    }
}
