package DSA.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class queries_on_a_permutation_with_a_key {
    static   public int[] processQueries(int[] queries, int m) {
int ans[]=new int[queries.length];
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 1; i <=m; i++) {
            list.add(i);
        }

        ArrayList<Integer> dummyAnsList=new ArrayList<>();
        for (int i = 0; i < queries.length ; i++) {
            for (int j = 0; j <m ; j++) {
                if(queries[i]==list.get(j)){
                    int iniVal=list.get(j);
                list.remove(j);
                    list.add(0,iniVal);

                    dummyAnsList.add(j);
                break;
                }
            }
        }
        for (int i = 0; i <dummyAnsList.size() ; i++) {
            ans[i]=dummyAnsList.get(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int []  queries = {3,1,2,1};int  m = 5;
        int ans[]=processQueries(queries,m);

        System.out.println(Arrays.stream(ans)
                .boxed()
                .collect(Collectors.toList()));
//        System.out.println(Arrays.stream(ans).boxed().collect(Collectors.toList()));
    }
}
