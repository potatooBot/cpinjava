package HashTable_Pract;
import java.util.*;
import java.util.stream.Collectors;

public class find_missing_and_repeating {
    static   int[] findTwoElement(int nums[], int n) {

int ans[]=new int[2];
ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i <n+1 ; i++) {
            list.add(0);
        }

        for (int i = 0; i <n ; i++) {
            list.set(nums[i], list.get(nums[i])+1 );
        }

        for (int i = 1; i < list.size() ; i++) {
            if(list.get(i)==0){
                ans[1]=i;
            }
            if(list.get(i)==2){
                ans[0]=i;
            }
        }
return ans;
    }
    public static void main(String[] args) {

        int n=2;
        int arr[] = { 2,2};
int ans[]=findTwoElement(arr,n);
        System.out.println(Arrays.stream(ans).boxed().collect(Collectors.toList()));
    }
}
