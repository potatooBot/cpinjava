import java.util.*;
import java.lang.*;
import java.io.*;
public class EQUALIZEAB {

    public static void equalab(int a,int b,int x) {

        int res = a - b;

        if (a == b) {
            System.out.println("YES");
            return;
        }
        if (res % 2 == 0 && x == 1) {
            System.out.println("YES");
            return;
        }
        if (a < b) {
            int s = b % a;
            if (s == 0 &&a==x) {
                System.out.println("YES");
                return;
            }

        }
        if (b < a) {
            int s = b % a;
            if (s == 0 &&b==x ) {
                System.out.println("YES");
                return;
            }

        }
        System.out.println("NO");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a, b, x;
            a = sc.nextInt();
            b = sc.nextInt();
            x = sc.nextInt();
           equalab(a,b,x);
        }
    }

}



