package Algorithm.SDE_QUESTIONS;

public class trapping_rain_water {
    static   public int trap(int[] height) {
int left=0;
int right= height.length-1;
int leftMax=0;
int rightMax=0;
int ans=0;
while (left<=right){

    if(height[left]<=height[right]) {


        if (leftMax <= height[left]) {
            leftMax = height[left];
        } else {
            ans = ans + (leftMax) - height[left];
        }
        left++;
    }
        else {
            if (rightMax<=height[right]){
                rightMax=height[right];
            }
            else {
                ans+=rightMax-height[right];
            }
            right--;
        }
    }
        return ans;
    }
    public static void main(String[] args) {
        int height []= {0,1,0,2,1,0,1,3,2,1,2,1};
int ans=trap(height);
        System.out.println(ans);
    }
}
