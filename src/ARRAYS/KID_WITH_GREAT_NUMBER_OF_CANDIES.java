package ARRAYS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class KID_WITH_GREAT_NUMBER_OF_CANDIES {
    static    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans=new ArrayList<>();
   List<Integer> can=new ArrayList<>();

        for (int i = 0; i <candies.length ; i++){
            can.add(candies[i]);

        }
        int max=Collections.max(can);

        for (int i = 0; i <candies.length ; i++) {
if(can.get(i)+extraCandies>=max) ans.add(true);
else ans.add(false);
        }
        System.out.println(ans);

        return ans;


    }
    public static void main(String[] args) {
        int [] candies = {2,3,5,1,3}; int extraCandies = 3;
        List<Boolean> ans=kidsWithCandies(candies,extraCandies);
        System.out.println(candies);
    }
}
