class Solution {
    public static void right(int height[],int ans1[]){
   int start=0;
        int end=1;
        int ans=0;
while(end<height.length){
int mini=Math.min(height[start],height[end]);

    int area=(end-start)*mini;
    ans=Math.max(area,ans);

    ans1[end]=ans;
    if(height[end]>height[start]){
        start=end;
    }
end++;
}
    }
    public static void left(int height[],int ans2[]){
   int start=height.length-1;
        int end=height.length-2;

        int ans=0;
while(end>=0){
int mini=Math.min(height[start],height[end]);
    int area=Math.abs((end-start)*mini);
    System.out.println(mini);
    ans=Math.max(area,ans);
    ans2[end]=area;
    if(height[end]>height[start]){
        start=end;
    }
end--;
}
    }

    public int maxArea(int[] height) {
     /*int ans1[]=new int[height.length];
         int ans2[]=new int[height.length];

         right(height,ans1);
          left(height,ans2);
          System.out.println(Arrays.toString(ans1));
              System.out.println(Arrays.toString(ans2));
int ans=0;
              for(int i=0;i<ans1.length;i++){
                if(ans1[i]==ans2[i]){
                    ans=Math.max(ans,ans1[i]+ans2[i]);
                }
                else
ans=Math.max(ans,Math.max(ans1[i],ans2[i]));
              }*/


int left=0;
int right=height.length-1;
int ans=-1;
while(left<right){
    int area=Math.min(height[left],height[right])*(right-left);
    ans=Math.max(area,ans);

    if(height[left]<=height[right]){
        left++;
    }
    else{
        right--;
    }
}

      return ans;  
    }
}