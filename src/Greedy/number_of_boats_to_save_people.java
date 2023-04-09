package Greedy;

import java.util.Arrays;

public class number_of_boats_to_save_people {
    static    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count = 0;
        int i = 0;
        int j = 0;
        for (i = 0; i < people.length; i++) {
            i = j + 1;

            if (people[i] + people[j] == limit) {
                count++;

            }
            if (people[j] > limit) {
                count = j;

            }


        }
        return count;
    }
    public static void main(String[] args) {
int people[]={3,2,2,1};
int limit=3;
int ans=numRescueBoats(people,limit);
        System.out.println(ans);
    }
}
