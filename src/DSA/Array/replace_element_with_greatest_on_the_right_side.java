package DSA.Array;

import java.util.Arrays;
import java.util.stream.Collectors;

public class replace_element_with_greatest_on_the_right_side {
    static   public int[] replaceElements(int[] arr) {
int ans[]=new int[arr.length];
int n= arr.length;
int maxi=-1;
        for (int i =n-1 ; i >=0 ; i--) {
            ans[i]=maxi;
            maxi=Math.max(maxi,arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {

//        int [] arr = {17,18,5,4,6,1};
        int [] arr = {400};
    int ans[]=replaceElements(arr);
        System.out.println(Arrays.stream(ans).boxed().collect(Collectors.toList()));
    }
}
