class Solution {
    public String losingPlayer(int x, int y) {
       int cnt=1;
       while(x!=0&&y!=0){
        if(x>=1&&y>=4){
            cnt++;
            x=x-1;
            y=y-4;
        }
        else{
            break;
        }
       }
       if(cnt%2==0) return "Alice";
       return "Bob";

    }
}