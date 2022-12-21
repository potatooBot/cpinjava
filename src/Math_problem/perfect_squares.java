package Math_problem;
import java.util.*;
public class perfect_squares {
    static int countSquares(int N) {
        // code here
        int count=0;
        for(int i=N-1;i>=1;i--){

            if(Math.sqrt(i)==(int)Math.sqrt(i)) {
                System.out.println(Math.sqrt(i));
//                count=(int)Math.sqrt(i);
//                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int c=16;
        int count= countSquares(c);
        System.out.println(count);
    }
}
