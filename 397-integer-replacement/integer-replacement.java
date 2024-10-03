class pair{
    long val;
    int cnt;
    public pair(long _val,int _cnt){
        this.val=_val;
        this.cnt=_cnt;
    }
}
class Solution {
    public int integerReplacement(int n) {
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(n,0));
        if(n==1) return 0;
        int ans=Integer.MAX_VALUE;
        while(!q.isEmpty()){
            long val=q.peek().val;
            int cnt=q.peek().cnt;
            q.remove();
            if(val==1) return cnt;
            if(val%2==0){
                q.add(new pair(val/2,cnt+1));
            }
            else{
                 q.add(new pair(val+1,cnt+1));
                  q.add(new pair(val-1,cnt+1));
            }
        }

        return -1;
    }
}