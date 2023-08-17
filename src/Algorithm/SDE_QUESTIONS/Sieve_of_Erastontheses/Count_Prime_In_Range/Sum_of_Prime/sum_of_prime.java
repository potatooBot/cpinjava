package Algorithm.SDE_QUESTIONS.Sieve_of_Erastontheses.Count_Prime_In_Range.Sum_of_Prime;
import java.util.*;
import java.util.stream.Collectors;

public class sum_of_prime {
    static int[] getPrimes(int n) {

            boolean prime[] = new boolean[n + 1];

            Arrays.fill(prime, true);
            for (int i = 2; i * i <= n; i++) {
                if (prime[i] == true) {
                    for (long j = i * i; j <= n; j = j + i) {
                        prime[(int) j] = false;
                    }
                }
            }
        int ans[]=new int[2];
            ans[0]=-1;
            ans[1]=-1;
            ArrayList<Integer> list = new ArrayList<>();
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 2; i <= n; i++) {
                if (i == 1) continue;
                if (prime[i] == true) {
                    list.add(i);
                    if(map.containsKey(n-i)){
                        ans[0]=n-i;
                        ans[1]=i;
                    }
                    map.put(i,1);
                }
            }
   //     System.out.println(list);
            return ans;
        }
        public static void main (String[]args){
int ans[]=getPrimes(3);
            System.out.println(Arrays.stream(ans).boxed().collect(Collectors.toList()));
        }
    }


