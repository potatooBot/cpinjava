package Bit_Manipulation;
//It will print even first then odd
public class check_even_or_odd{
        static void evenOdd (int a,int b)
        {
            //Your code here
            if((a&1)==1) {
                System.out.println(b);
                System.out.println(a);
            }
            else {
                System.out.println(a);
                System.out.println(b);
            }

        }

//        Left shift trick
    // N=N<<i is equal to N=N*Pow(2,i);

    public static void main(String[] args) {
 evenOdd(5,10);
    }
}
