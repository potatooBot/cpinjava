class Solution {
    public static int getTrueCount(String answerKey,int k){
           int zeroCnt=0;
        int n=answerKey.length();
int ans=0;
int start=0;
    for(int end=0;end<n;end++){
if(answerKey.charAt(end)=='F'){
    zeroCnt++;
}
while(zeroCnt>k){
    if(answerKey.charAt(start)=='F'){
        zeroCnt--;
    }
    start++;
}

ans=Math.max(ans,end-start+1);
    }
    return ans;
    }
        public static int getFalseCount(String answerKey,int k){
           int zeroCnt=0;
        int n=answerKey.length();
int ans=0;
int start=0;
    for(int end=0;end<n;end++){
if(answerKey.charAt(end)=='T'){
    zeroCnt++;
}
while(zeroCnt>k){
    if(answerKey.charAt(start)=='T'){
        zeroCnt--;
    }
    start++;
}

ans=Math.max(ans,end-start+1);
    }
    return ans;
    }


    public int maxConsecutiveAnswers(String answerKey, int k) {
 return Math.max(getTrueCount(answerKey,k),getFalseCount(answerKey,k))    ;
    }
}