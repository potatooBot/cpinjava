package Leetcode_Daily;

import java.util.Arrays;

public class maximum_ice_creambars_1833 {
    public static int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int sum=0;
        for(int i=0;i<costs.length;i++){
            if(coins<costs[i]){
                return sum;
            }
              coins=coins-costs[i];
            sum++;
if(coins==0) return sum;
        }
        return sum;
    }
    public static void main(String[] args) {
        int []costs = {10,6,8,7,7,8};
//        int []costs = {1,3,2,4,1};
        int coins =5;
        int res=maxIceCream(costs,coins);
        System.out.println(res);

    }
}
