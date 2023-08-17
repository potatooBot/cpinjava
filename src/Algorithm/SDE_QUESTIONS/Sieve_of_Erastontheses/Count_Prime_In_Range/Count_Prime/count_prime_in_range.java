package Algorithm.SDE_QUESTIONS.Sieve_of_Erastontheses.Count_Prime_In_Range.Count_Prime;
import java.util.*;


//Sieve of Erastonthese
public class count_prime_in_range {
   static public int countPrimes(int n) {
        boolean prime[]=new boolean[n];

        Arrays.fill(prime,true);
        for(int i=2;i*i<n;i++){
            if(prime[i]==true){
                for(long j=i*i;j<n;j=j+i){
                    prime[(int)j]=false;
                }
            }
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(prime[i]==true){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
int ans=countPrimes(10);
        System.out.println(ans);
    }
}
