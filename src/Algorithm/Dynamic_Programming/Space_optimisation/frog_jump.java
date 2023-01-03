package Algorithm.Dynamic_Programming.Space_optimisation;

public class frog_jump {
    public static void main(String[] args) {
        int height[]={30,10,60,10,60,50};
        int n=height.length;
        int prev=0;
        int prev2=0;
        for(int i=1;i<n;i++){

            int jumpTwo = Integer.MAX_VALUE;
            int jumpOne= prev + Math.abs(height[i]-height[i-1]);
            if(i>1)
                jumpTwo = prev2 + Math.abs(height[i]-height[i-2]);

            int cur_i=Math.min(jumpOne, jumpTwo);
            prev2=prev;
            prev=cur_i;

        }
        System.out.println(prev);
    }
}
