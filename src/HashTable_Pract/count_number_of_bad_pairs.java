package HashTable_Pract;

import java.util.HashMap;
import java.util.Map;

public class count_number_of_bad_pairs {
    public static int countNicePairs(int[] nums) {

        int ans=0;

        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
int dig=nums[i];
int rev=0;
while (dig!=0){
    rev=(rev*10) +dig%10;
    dig=dig/10;
}
map.put(nums[i]-rev, map.getOrDefault(nums[i]-rev,0)+1);

        }
        System.out.println(map);
        int count=0;
        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            ans= ans+ (entry.getValue()*(entry.getValue()-1))/2;
        }
        return ans ;
    }

    public static void main(String[] args) {
//int nums[] = {13,10,35,24,76};
int nums[] = {42,11,1,97};
int ans=countNicePairs(nums);
        System.out.println(ans);
    }
}
