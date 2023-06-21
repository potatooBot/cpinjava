class Solution {
    public int waysToMakeFair(int[] nums) {
       int rightEvenIndexSum =0;
int rightOddIndexSum=0;
        int leftEvenIndexSum=0;
        int leftOddIndexSum=0;

        for (int i = 0; i < nums.length ; i++) {
            if(i%2==0){
                rightEvenIndexSum=rightEvenIndexSum+nums[i];
            }
            else {
                rightOddIndexSum=rightOddIndexSum+nums[i];
            }
        }
int count=0;
        for (int i = 0; i < nums.length ; i++) {
            if(i%2==0){
                rightEvenIndexSum=rightEvenIndexSum-nums[i];
            }
            else {
                rightOddIndexSum=rightOddIndexSum-nums[i];
            }

            if(leftOddIndexSum+rightEvenIndexSum==leftEvenIndexSum+rightOddIndexSum){
                count++;
            }



            if (i%2==0){
                leftEvenIndexSum=leftEvenIndexSum+nums[i];
            }
            else {
                leftOddIndexSum=leftOddIndexSum+nums[i];
            }

        }


        return count; 
    }
}