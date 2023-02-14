package Algorithm.SlidingWIndow;
import java.util.*;

public class count_number_of_disting_numbers_inwindows_k {
    static ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        // code here
 HashMap<Integer,Integer> map=new HashMap<>();
        int start=0;

        ArrayList<Integer> ans=new ArrayList<>();
        for(int end=0;end<n;end++){
map.put(A[end], map.getOrDefault(A[end],0)+1);

            if(end-start+1==k){



                ans.add(map.size());
map.replace(A[start], map.get(A[start])-1);

                if(map.containsKey(A[start])){
                    if(map.get(A[start])==0)
                        map.remove(A[start]);
                }
                start++;
            }



        }

        return ans;

    }
    public static void main(String[] args) {
        int N = 7, K = 4,
        A[] = {1,2,1,3,4,2,3};
    ArrayList ans=countDistinct(A,N,K);
        System.out.println(ans);
    }
}
