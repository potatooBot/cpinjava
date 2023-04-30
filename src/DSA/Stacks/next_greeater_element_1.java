package DSA.Stacks;

import java.util.*;
import java.util.stream.Collectors;

public class next_greeater_element_1 {
    static  public int[] nextGreaterElement(int[] nums1, int[] nums2) {
int ans[]=new int[nums1.length];
        Stack<Integer> stk=new Stack<>();

        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = nums2.length-1; i >=0 ; i--) {
            while (stk.isEmpty()==false&&stk.peek()<=nums2[i])
            {
                stk.pop();
            }

            if(stk.isEmpty()==false&&stk.peek()>nums2[i]){
                map.put(nums2[i], stk.peek());
            }
            else {
                map.put(nums2[i],-1);
            }
            stk.push((int)nums2[i]);
        }
//        System.out.println(map);
        for (int i = 0; i <nums1.length ; i++) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()
            ) {
if(nums1[i]==(int) entry.getKey()){

    ans[i]=(int) entry.getValue();
}
            }
        }
return ans;
    }
    public static void main(String[] args) {
        int [] nums1 = {4,1,2};int [] nums2 = {1,3,4,2};
int ans[]=nextGreaterElement(nums1,nums2);
        System.out.println(Arrays.stream(ans).boxed().collect(Collectors.toList()));
    }
}
