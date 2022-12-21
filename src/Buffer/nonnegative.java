package Buffer;

import java.util.*;

public class nonnegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <=t; i++) {
            int count=0;

            ArrayList<Integer> lst = new ArrayList<>();
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                lst.add(sc.nextInt());
            }
            for (int j = 0; j <n ; j++) {
            if(lst.get(j)<0){
                count++;
            }
            else if(lst.get(j)==0){
                count=0;
                break;
            }
            }
            int x=count%2;
            System.out.println(x);
        }
    }
}
