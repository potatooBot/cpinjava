package DSA.Stacks.Largest_Rectangle_In_Histogram;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

public class largest_rectangle_in_histogram {
    static     public int largestRectangleArea(int[] heights) {
        Stack<Integer> stk=new Stack<>();
        int leftBoundary[]=new int[heights.length];
        for (int i = 0; i < heights.length ; i++) {
            while (stk.isEmpty()==false&&heights[stk.peek()]>=heights[i]){
                stk.pop();
            }
            if(stk.isEmpty()==true) {
                leftBoundary[i]=0;
            }
            else {
                leftBoundary[i]=stk.peek()+1;
            }
            stk.push(i);
        }

        stk.clear();
        int rightBoundary[]=new int[heights.length];
        for (int i = heights.length-1; i >=0 ; i--) {
            while (stk.isEmpty()==false&&heights[stk.peek()]>=heights[i]){
                stk.pop();
            }
            if(stk.isEmpty()==true) {
                rightBoundary[i]= heights.length-1;
            }
            else {
                rightBoundary[i]=stk.peek()-1;
            }
            stk.push(i);
        }

      int maxi=Integer.MIN_VALUE;
        for (int i = 0; i < heights.length ; i++) {
            maxi=Math.max(maxi,(rightBoundary[i]-leftBoundary[i]+1)*heights[i]);
        }

        return maxi;
    }
    public static void main(String[] args) {
        int [] heights = {2,1,5,6,2,3};
int ans=largestRectangleArea(heights);
        System.out.println(ans);
    }
}
