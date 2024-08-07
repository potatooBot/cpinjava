class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum=0;
        for(int ele:nums) sum=sum+ele;

int val1=0;
   int val2=0;
        for(int ele:nums)
    {
        if(ele<10) val1+=ele;
else{
    val2=val2+ele;
}

    }

    if(val1==val2) return false;
    return true;
    }
}