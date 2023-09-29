class Solution {

        public static int lis(int nums[],int idx,int prev_idx,int dp[][]){
if(idx==nums.length) return 0;
if(dp[idx][prev_idx+1]!=-1) return dp[idx][prev_idx+1];
int len= 0+ lis(nums,idx+1,prev_idx,dp);
if(prev_idx==-1||nums[idx]>=nums[prev_idx]){
int take= 1+ lis(nums,idx+1,idx,dp);    
len=Math.max(len,take);
}
        return dp[idx][prev_idx+1]=len;
    }
    public int minimumDeletions(String s) {
 /*    int nums[]=new int[s.length()];
       
     for(int i=0;i<s.length();i++)   
    {
        if(s.charAt(i)=='a'){
            nums[i]=1;
        }
        else{
            nums[i]=2;
        }
    }
    int dp[][]=new int[nums.length][nums.length+1];
    for(int []rows:dp)
    Arrays.fill(rows,-1);
    int val=lis(nums,0,-1,dp);

    return s.length() - lengthOfLIS(nums);*/

    int ans=0;
    Stack<Character> stk=new Stack<>();


    for(int i=0;i<s.length();i++){


        if(s.charAt(i)=='a'){
            if(stk.isEmpty()==false){
                char ch=stk.peek();
                if(ch=='b') ans++;
            stk.pop();
            }
        }
        else{
            stk.push('b');
        }
    }
    return ans;

    }
}