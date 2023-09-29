class Solution {
    public boolean checkString(String s) {
          Stack<Character> stk=new Stack<>();


    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='a'){
            if(stk.isEmpty()==false){
                char ch=stk.peek();
                if(ch=='b') return false;
            stk.pop();
            }
        }
        else{
            stk.push('b');
        }
    }
    return true;
    }
}