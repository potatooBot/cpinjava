class Solution {
    public long minimumSteps(String s) {
        long one=0;
        long swap=0;

        for(char ch:s.toCharArray()){
            if(ch=='1')
{
    one++;
}

else if(ch=='0'){
    swap=swap+one;
}
        }

        return swap;
    }
}