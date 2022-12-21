package Math_problem;

public class power_of_number {
    static long power(int N,int R)
    {
        //Your code here
        if(R==0)
        {
            return 1;
        }
        long p=power(N,R/2);
        long h=(p*p)%1000000007;
        if(R%2==0)
        {
            return h;
        }
        return (h*N)%1000000007;
    }

    public static void main(String[] args) {
        long res=power(12,21);
        System.out.println(res);
    }
}
