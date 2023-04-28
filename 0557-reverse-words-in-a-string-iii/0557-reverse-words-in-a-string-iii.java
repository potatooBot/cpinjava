class Solution {
    public String reverseWords(String str) {
           Stack<Character> stk=new Stack<>();
        String ans="";
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==' '){
                while (stk.isEmpty()==false){
                    ans=ans+stk.pop();
                }
                ans=ans+' ';
            }
            else {
                stk.push(str.charAt(i));
            }
        }
      while (stk.isEmpty()==false){
          ans=ans+stk.pop();
      }
     return ans;  
    }
}