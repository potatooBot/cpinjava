package Math_problem;

import java.util.ArrayList;

public class divisor_3 {
    public static boolean isPrime(int num){
        if(num==3||num==2) return true;
        if(num%2!=0&&num%3!=0) {
            return true;
        }
        return false;
    }

    static ArrayList<Integer> threeDivisors(ArrayList<Long> query, int q){
        ArrayList<Integer> ans=new ArrayList<>();
        for (Long ele:
             query) {
            int count=0;
            for (int i = 2; i <=ele ; i++) {
                if(isPrime(i)==true&&Math.pow(i,2)<ele) {
                    count++;
                }
            }
            if(count>0) ans.add(count);
        }
        return ans;
    }
    public static void main(String[] args) {
        boolean check=isPrime(3);
        ArrayList<Long> query=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        query.add(6L);
        query.add(6L);
        query.add(1000000L);

        ans=threeDivisors(query, query.size());
        System.out.println(ans);

    }
}
