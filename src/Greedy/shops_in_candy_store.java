package Greedy;

import java.util.ArrayList;
import java.util.Arrays;

public class shops_in_candy_store {
    static void candyStore(int candies[],int n,int k){
        Arrays.sort(candies);
       int count=0;
       int sum=0;
        ArrayList <Integer> lst=new ArrayList<>();
        System.out.println();
        for (int i = 0; i <candies.length ; i++) {

            if(count<n){
                sum=sum+candies[i];
                count=count+k+1;
            }
            else {
                break;
            }
        }
     lst.add(sum);
        int count2=0;
        int sum2=0;
        for (int i = candies.length-1; i >=0; i--) {

            if(count2<n){
                sum2=sum2+candies[i];
                count2=count2+k+1;
            }
            else {
                break;
            }
        }
lst.add(sum2);
        System.out.println(lst);
    }
    public static void main(String[] args) {
        int n= 10;
        int k = 0;
       int candies[] = {1,2,3,4,5,6,7,8,9,10};
       candyStore(candies,n,k);
    }
}
