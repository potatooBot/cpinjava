import java.util.*;
import java.lang.*;
import java.io.*;
public class CFMM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int k = 0; k < t; k++) {
            int n = sc.nextInt();
            int c = 0, o = 0, d = 0, e = 0, h = 0, f = 0;
            for (int i = 0; i < n; i++) {
                String str = sc.next();

                for (int j = 0; j < str.length(); j++) {
                    switch (str.charAt(j)) {
                        case 'c':
                            c++;
                            continue;
                        case 'o':
                            o++;
                            continue;
                        case 'd':
                            d++;
                            continue;
                        case 'e':
                            e++;
                            continue;
                        case 'h':
                            h++;
                            continue;
                        case 'f':
                            f++;
                            continue;

                    }

                }
            }

            int arr[] = new int[6];
            arr[0] = c / 2;
            arr[1] = e / 2;
            arr[2] = o;
            arr[3] = d;
            arr[4] = f;
            arr[5] = h;
            Arrays.sort(arr);
            System.out.println(arr[0]);
        }
    }
}
