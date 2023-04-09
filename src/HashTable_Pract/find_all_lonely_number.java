package HashTable_Pract;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class find_all_lonely_number {
    static    public List<Integer> findLonely(int[] nums) {
        List<Integer> ans=new ArrayList<>();

        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1 );
        }

        for (Map.Entry<Integer,Integer> entry: map.entrySet()
             ) {
            if(entry.getValue()==1)
            {
                if(!map.containsKey(entry.getKey()+1)&&!map.containsKey(entry.getKey()-1))
                {
                    ans.add(entry.getKey());
                }

            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] nums = {1,3,5,3};
    List<Integer> ans=findLonely(nums);
        System.out.println(ans);

    }
}
