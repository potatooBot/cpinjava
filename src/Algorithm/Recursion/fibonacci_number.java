package Algorithm.Recursion;

public class fibonacci_number {
    public static int fiboNum(int n){
        if(n<=1) return n;
        int last=fiboNum(n-1);
        int seconLast=fiboNum(n-2);

        return last+seconLast;
    }
    public static void main(String[] args) {
       int res=fiboNum(20);
        System.out.println(res);
    }
}
