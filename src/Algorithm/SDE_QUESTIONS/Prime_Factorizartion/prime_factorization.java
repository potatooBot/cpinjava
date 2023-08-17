package Algorithm.SDE_QUESTIONS.Prime_Factorizartion;
import java.util.*;
public class prime_factorization {
    public static void sieve(ArrayList<Integer> prime,int n) {


        int spf[]=new int[100000];
        Arrays.fill(spf,0);
        for (int i = 2; i <=n; i++) {
            spf[i]=i;
        }

        for (int i = 2; i*i <=n ; i++) {
            if (spf[i] == i) {
                for (int j=i*i ; j<=n ; j=j+i) {
                    if(spf[j]==j){
                        spf[j]=i;
                    }
                }

            }
        }

        while (n!=1){
            prime.add(spf[n] );
        n=n/spf[n];
        }



    }

    static List<Integer> findPrimeFactors(int n) {
        ArrayList<Integer> ans=new ArrayList<>();
        sieve(ans,n);
        System.out.println(ans);;
return ans;
    }
    public static void main(String[] args) {
        int n = 24;
        findPrimeFactors(n);
    }
}
