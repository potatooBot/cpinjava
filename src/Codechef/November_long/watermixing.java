package Codechef.November_long;
import java.util.*;
public class watermixing {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t ;i++ ) {


            int a, b, x, y;
            a = sc.nextInt();
            b = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
            if (a == b) {
                System.out.println("YES");

            }
            if (a < b) {
                a = a + x;
                if (a > b || a == b) {
                    System.out.println("YES");
             continue;

                }
                else {
                    System.out.println("NO");
                }
            }

            if (a > b) {
                a = a - y;
                if (a < b || a == b) {
                    System.out.println("YES");
                    continue;

                } else {
                    System.out.println("NO");

                }
            }
        }
     }

    }

