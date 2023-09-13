class Solution {
public static int getAns(ArrayList<Integer> nums,int dp[][],int idx,int target){

if(idx==0){
    if(target%nums.get(0)==0){
        return target/nums.get(0);
    } 
    else{
        return 100000;
    }
}
if(idx<0) return 0;

if(dp[idx][target]!=-1) return dp[idx][target];


int notTake=getAns(nums,dp,idx-1,target);

int take=1000;
if(nums.get(idx)<=target){
    take= 1+getAns(nums,dp,idx,target-nums.get(idx));
}
return dp[idx][target]=Math.min(take,notTake);
}
    public int numSquares(int n) {



ArrayList<Integer> nums=new ArrayList<>();
for(int i=1;i<=1000;i++){
    int ele=i*i;
  //  if(ele>1000) break;
    nums.add(ele);
}
int sz=nums.size();

        int dp[][]=new int[sz][n+1];
    for(int row[]:dp)
    Arrays.fill(row,-1);
   // System.out.println(nums);
    return getAns(nums,dp,sz-1,n);
    }
}