package DSA.Stacks.Aestroid_Collision;

import java.util.Arrays;
import java.util.Collection;
import java.util.Stack;
import java.util.stream.Collectors;

public class aestroid_collision {
    static  public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stk=new Stack<>();

        for (int i = asteroids.length-1; i >=0; i--) {
            if(stk.isEmpty()){
                stk.add(asteroids[i]);
                continue;
            }
            else {
                if(stk.peek()>0&&asteroids[i]>0){
                    stk.add(asteroids[i] );
                    continue;
                }
                if(asteroids[i]<0&&stk.peek()<0){
                    stk.add(asteroids[i] );
                    continue;
                }
                else {
                    int val=asteroids[i];
                    if(val<Math.abs(stk.peek())){
                        continue;
                    }
                    else if(val==Math.abs(stk.peek())) {
stk.pop();
                    }
                    else {

                        stk.pop();
                        stk.add(val);
                    }

                }
            }
        }
        int i=0;
        int ans[]=new int[stk.size()];
        for (int ele:stk) {
            ans[i++]=ele;
        }
        i=0;
        int j=0;
        int finalAns[]=new int [ans.length];
        for (i =ans.length-1;i>=0;i--) {
            finalAns[j++]=ans[i];
        }
    return finalAns;
    }
    public static void main(String[] args) {
        int [] aestroid={-2,2,-1,-2};
    //    System.out.println(Arrays.stream(aestroid).boxed().collect(Collectors.toList()));

        int ans[]=asteroidCollision(aestroid);
        System.out.println(Arrays.stream(ans).boxed().collect(Collectors.toList()));


    }
}
