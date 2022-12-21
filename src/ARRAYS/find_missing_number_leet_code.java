package ARRAYS;
import java.util.*;
public class find_missing_number_leet_code {
    public static int firstMissingPositive(int[] nums) {
        ArrayList <Integer> lst=new ArrayList<>();
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]<=nums.length)
            lst.add(nums[i]);
        }

        HashSet <Integer> set=new HashSet<>(lst);
        System.out.println(set);

        for (int i = 1; i <=nums.length+1 ; i++) {
            System.out.println("running for "+i);
           if(!lst.contains(i)) {
              return i;
          }
        }
        return 1;
    }

    public static void main(String[] args) {
        int nums[]={1,2,3,10,2147483647,9};
        int check=firstMissingPositive(nums);
        System.out.println(check);
    }
}
