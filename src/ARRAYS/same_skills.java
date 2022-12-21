package ARRAYS;

import java.util.Arrays;

public class same_skills {
    public static long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int low=0;
        int high=skill.length-1;
        int val=skill[low]+skill[high];
     long sum=0;
        while (low<high){
            if(skill[low]+skill[high]!=val){
                return -1;
            }
            else if(skill[low]+skill[high]==val){
                sum=sum+skill[low]*skill[high];
                low++;high--;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int skill[] = {1,1,2,3};
        long res=dividePlayers(skill);
        System.out.println(res);
    }
}
