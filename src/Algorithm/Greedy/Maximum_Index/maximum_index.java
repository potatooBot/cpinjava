package Algorithm.Greedy.Maximum_Index;

import java.util.Map;
import java.util.TreeMap;

public class maximum_index {
    public static int  getMaxIndex(int arr[]){

        TreeMap<Integer,Integer> map=new TreeMap<>();
        for (int i = 0; i <arr.length ; i++) {
            map.put(arr[i],i );
        }
        int ans=0;
int prev=-1;
        for (Map.Entry<Integer,Integer> entry:
            map.entrySet() ) {
            if(prev==-1){
                prev=entry.getValue();
            continue;
            }
            else {
                if(entry.getValue()>prev){
                    ans=Math.max(ans,entry.getValue()-prev);
                }
            }
            prev=entry.getValue();
        }

        System.out.println(map);
        return ans;
    }
    public static void main(String[] args) {
        int n = 9;
        int arr[] = {34, 8, 10, 3, 2, 80, 30, 33, 1};
    int ans=getMaxIndex(arr);
        System.out.println(ans);
    }
}
