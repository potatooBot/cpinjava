class Solution {
    public boolean winnerOfGame(String col) {

        int n=col.length();
        if(n<=2) return false;

        int cntA=0;
        int cnt=0;
        for(int i=0;i<n;i++){
if(col.charAt(i)=='A') {
    cnt++;
}
else{
    if(cnt>=3){
        cntA=cntA+cnt-2;
    }
        cnt=0;
}

        }
        if(cnt>=3) {
    cntA=cntA+cnt-2;
}
int cntB=0;
cnt=0;
        for(int i=0;i<n;i++){
if(col.charAt(i)=='B') {
    cnt++;
}
else{
    if(cnt>=3){
        cntB=cntB+cnt-2;
  
    }
          cnt=0;
}
        }
        if(cnt>=3) {
    cntB=cntB+cnt-2;
}
        System.out.println(cntA);
         System.out.println(cntB);
if(cntA>cntB) return true;
return false;
    }
}
