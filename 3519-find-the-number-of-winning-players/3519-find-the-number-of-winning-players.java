class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        int ans=0;
HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<pick.length;i++){
            int cnt=0;
            int val=pick[i][0];
            int col=pick[i][1];
if(val==-1) continue;
            for(int j=0;j<pick.length;j++){
if(pick[j][0]==val&&pick[j][1]==col){
cnt++;
pick[j][0]=-1;
}

            }
            if(cnt>val) set.add(val);
        }

        return set.size();
    }
}