class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
             Stack<Integer> stk=new Stack<>();

int j=0;
        for (int i = 0; i < pushed.length ; i++) {
            while (!stk.isEmpty()&&stk.peek()==popped[j]){
                stk.pop();
                j++;
            }
                stk.push(pushed[i]);
        }
        while(!stk.isEmpty()&&stk.peek()==popped[j]) {
            stk.pop();
            j++;
        }
        if(stk.isEmpty()) return true;
     //   System.out.println(stk);
        return false; 
    }
}