package Algorithm.SDE_QUESTIONS.Smaller_on_left_not_stack_question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Smaller_on_left_not_stack_question {
    public static int[] Smallestonleft (int arr[], int n) {
    int ans[]=new int[n];
        TreeMap<Integer,Integer> map=new TreeMap<>();
//        map.put(0,-1);

        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i <n ; i++) {

if(map.lowerKey(arr[i])==null){
    ans[i]=-1;
}
else {
    ans[i]=map.lowerKey(arr[i]);
}
map.put(arr[i],1 );
        }
     return ans;   // Complete the function
    }
    public static void main(String[] args) {
        int N = 10;
int         arr[] = {3, 5, 4, 2, 2, 5, 5, 4, 2, 5};
int ans[]=Smallestonleft(arr,N);
        System.out.println(Arrays.stream(ans).boxed().collect(Collectors.toList()));
    }
}
