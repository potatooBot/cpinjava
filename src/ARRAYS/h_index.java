package ARRAYS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class h_index {
    static   public int hIndex(int[] citations) {


        Arrays.sort(citations);
        TreeMap<Integer,Integer> map=new TreeMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        int maxi=citations[citations.length-1];

        for (int i = 0; i <= citations.length ; i++) {
            for (int j = 0; j <citations.length ; j++) {


                if (citations[j] >= i) {
                    map.put(i, citations.length - j);
                    break;
                }
            }
        }
        System.out.println(map);
        int h_index=0;
        for (Map.Entry<Integer,Integer> entry: map.entrySet()
             ) {
            if(entry.getValue()>=entry.getKey()){
                h_index=(int)entry.getKey();
            }
        }
        return h_index;
    }
    public static void main(String[] args) {
//        int [] citations = {3,0,6,1,5};
        int [] citations = {1,2,100};
//        int [] citations = {4,4,4,4,4,4,5};
//        0 1 3 5 6
int ans=hIndex(citations);
        System.out.println(ans);
    }
}
