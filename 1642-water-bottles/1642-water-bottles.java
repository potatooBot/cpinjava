class Solution {
    public int numWaterBottles(int numB, int numE) {
        int val=numB/numE;
int res=numB-val*numE;
        int num= val+res;
        int sum=0;
        while(num>=numE){
            sum=sum+(num/numE)*numE;
            num=num%numE +(num/numE);
       // System.out.println(num);
        }
        
        return sum+ val*numE +num;
    }
}