class Solution {
    public int minLength(String s) {
        Stack<Character> stk=new Stack<>();
        for(char ch :s.toCharArray()){
if(stk.isEmpty()==false&&ch=='B'&&stk.peek()=='A'){
    stk.pop();
    continue;
}
if(stk.isEmpty()==false&&ch=='D'&&stk.peek()=='C'){
    stk.pop();
    continue;
}

stk.push(ch);
        }

        return stk.size();
    }
}