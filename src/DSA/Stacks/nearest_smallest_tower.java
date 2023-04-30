package DSA.Stacks;

import java.util.*;

class pair{
    int idx;int val;
    public pair(int val,int idx){
        this.idx=idx;
        this.val=val;
    }
}
public class nearest_smallest_tower {
    public static List<pair>getLeftSmallest(int nums[]){
      List<pair> ans=new ArrayList<>();

        Stack<pair> stk=new Stack<>();
        for (int i = 0; i < nums.length ; i++) {
            while (stk.empty()==false&&stk.peek().val>=nums[i]){
                stk.pop();
            }
            if (stk.isEmpty() == false&&stk.peek().val<nums[i]) {
                ans.add(new pair(stk.peek().val,Math.abs(i- stk.peek().idx)));
            }
            else {
                ans.add(new pair(nums[i],-1));
            }
            stk.push(new pair(nums[i],i));
        }
        return ans;
    }
    public static List<pair>getRightSmallest(int nums[]){
        List<pair> ans=new ArrayList<>();

        Stack<pair> stk=new Stack<>();
        for (int i = nums.length-1; i >=0 ; i--) {
            while (stk.empty()==false&&stk.peek().val>=nums[i]){
                stk.pop();
            }
            if (stk.isEmpty() == false&&stk.peek().val<nums[i]) {
                ans.add(new pair(stk.peek().val,Math.abs(i- stk.peek().idx)));
            }
            else {
                ans.add(new pair(nums[i],-1));
            }
            stk.push(new pair(nums[i],i));
        }
        return ans;
    }
    static 	int [] nearestSmallestTower(int [] nums){
     int ans[]=new int[nums.length];

     List<pair> valNums1 =getLeftSmallest(nums);
   List<pair> valNums2=getRightSmallest(nums);
Collections.reverse(valNums2);
        for (pair pr:valNums1
        ) {
            System.out.println(pr.val+" "+pr.idx);
        }
        System.out.println("Seperation");
        for (pair pr:valNums2
             ) {
            System.out.println(pr.val+" "+pr.idx);
        }
     return ans;
        //Write your code here
    }
    public static void main(String[] args) {
        int nums[] = {4,8,3,5,3};
nearestSmallestTower(nums);
    }
}
