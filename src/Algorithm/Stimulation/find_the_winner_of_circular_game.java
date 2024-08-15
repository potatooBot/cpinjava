package Algorithm.Stimulation;
import java.util.*;
public class find_the_winner_of_circular_game {
    public static int findTheWinner(int n, int k) {
        ArrayList<Integer> ds=new ArrayList<>();

        for(int i=1;i<=n;i++){
            ds.add(i);


        }
int prev=0;
        int idx=0;
        while(ds.size()>1){
          idx=prev-1;
            for(int i=1;i<=k;i++){
                idx++;
            }
            if(idx>=ds.size()){
idx=idx%ds.size();
            }
            prev=idx;
            ds.remove(idx);
        }

        return ds.get(0);
    }
    public static void main(String[] args) {
        System.out.println(findTheWinner(5,2));

    }
}
