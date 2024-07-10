class Solution {
    public int minOperations(String[] logs) {
        int cnt=0;
        
        for(String ele:logs){
            if(ele.equals("../")) {
                if(cnt>0)
                cnt--;
            }
            else if(ele.charAt(0)!='.'){
           cnt++;
            }
          
     
        }
     
        return cnt;
    }
}