package Algorithm.SlidingWIndow;

import java.util.ArrayList;

public class count_increasing_subarray {
   static int countIncreasing(int nums[], int n) {
        // code here
        if(nums.length==1) return nums[0];
        int count=0;
        ArrayList<Integer> ans=new ArrayList<>();

        for (int i = 0; i < nums.length-1 ; i++) {
            //  sum=sum+nums[i];
            if(nums[i]<nums[i+1]){
                count++;
            }
            if(nums[i]>=nums[i+1]) {
                //ans.add(count);
                if (count >=2)
                    ans.add(count+1);
                else if (count == 1) {
                    ans.add(1);
                }
                count=0;
            }
        }
        if(nums[nums.length-2]<nums[nums.length-1]) {
            count++;
            ans.add(count);
        }
        int val=0;
       System.out.println(ans);
        for(int i=0;i<ans.size();i++){
            int ch=ans.get(i);
            if(ch==1) {
                val=val+ch;
                continue;
            }
            val=val+ ch*(ch-1)/2;

        }

        return val;
    }
    public static void main(String[] args) {
//        int [] nums = {22 ,23 ,17, 33, 10, 11, 30, 36, 26, 3 ,8 ,49, 10, 28, 7, 1, 44,
//                22, 28, 25, 3, 3, 21, 42, 33 ,19, 8, 4, 28, 27, 30, 12, 46, 44 ,19, 16, 25, 41};
        int []nums={1,  5};
        int n= nums.length;
   int ans=countIncreasing(nums,n);
        System.out.println(ans);
   }
}
