package DSA.Stacks;
import java.util.*;
import java.util.stream.Collectors;

public class lader_in_array {
    static ArrayList<Integer> leaders(int arr[], int n){
     ArrayList<Integer> list=new ArrayList<>();
     Stack<Integer> stk=new Stack<>();
int nge[]=new int[n];
        for (int i = n-1; i >=0 ; i--) {
            while (stk.isEmpty()==false&&stk.peek()<=arr[i]){
                stk.pop();
            }
            if(stk.isEmpty()==false&&stk.peek()>arr[i]){
                nge[i]=stk.peek();
            }
            else {
                nge[i]=-1;
            }


            stk.push(arr[i]);
        }
        for (int i = 0; i <nge.length ; i++) {
            if(nge[i]==-1) list.add(arr[i]);
        }

//        System.out.println(Arrays.stream(nge).boxed().collect(Collectors.toList()));
        // Your code here
    return list;
    }
    public static void main(String[] args) {
        int n = 6;
        int arr[] = {16,17,4,3,5,2};
ArrayList<Integer> ans=leaders(arr,n);
    }
}
