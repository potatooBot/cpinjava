package DSA.Stacks.Implement_Min_Stack;
import java.util.*;
class pair{
    int val;
    int min;
    pair(int val,int min){
        this.val=val;
        this.min=min;
    }
}
public class min_satck {

    Stack<pair> stk;
    public min_satck(){
        stk=new Stack<>();
    }

    public void push(int val) {
        int min=Integer.MAX_VALUE;
if(stk.isEmpty()==true) {
min=val;
}
else {
    min=Math.min(min,stk.peek().min);
}
stk.push(new pair(val,min));
    }
    public void pop() {
stk.pop();
    }
    public int top() {
return stk.peek().val;
    }
    public int getMin() {
return stk.peek().min;
    }
}
