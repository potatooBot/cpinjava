package Algorithm.Greedy.Swap_To_Get_Largest_Num;
import java.util.*;

public class swap_to_get_largest_num {
    public static int maximumSwap(int num) {
        int dummy=num;
        ArrayList<Integer> list=new ArrayList<>();
        while(dummy!=0){
            int rem=dummy%10;
            list.add(rem);
            dummy=dummy/10;

        }
        long ans=num;
        Collections.reverse(list);
        for(int i=0;i<list.size();i++){
            for(int j=list.size()-1;j>=0;j--){
                int temp=list.get(i);
                list.set(i,list.get(j));
                list.set(j,temp);
                long val=0;
                for(int k=0;k<list.size();k++){
                    val=val*10+list.get(k);
                }
                if(val>ans){
                    ans=val;
                }
                temp=list.get(i);
                list.set(i,list.get(j));
                list.set(j,temp);
            }
        }
        return (int)ans;
    }
    public static void main(String[] args) {
        int val=1993;
    int ans=maximumSwap(val);
        System.out.println(ans);
    }
}
