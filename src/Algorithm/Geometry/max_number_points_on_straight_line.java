package Algorithm.Geometry;

import java.util.HashMap;
import java.util.Map;

public class max_number_points_on_straight_line {
    static int maxPoints(int x[],int y[],int n) {

        int maxi=0;
        for (int i = 0; i <n; i++) {
            HashMap<Double,Integer> map=new HashMap<>();
            double val=0;

            for (int j = 0; j <n ; j++) {
                if (i != j) {

                    if (x[j] - x[i] == 0) {
                        val=Double.MAX_VALUE;
                    } else {
                        val=(double) (y[j]-y[i])/(double)(x[j]-x[i]);
                    }
                    map.put(val, map.getOrDefault(val,0) + 1);
                    maxi=Math.max(maxi,map.get(val));
                }
            }
        }

        return (maxi)+1;
       }


        //You are required to complete this method

    public static void main(String[] args) {
        int x[] = {1, 3, 5, 4, 2, 1};
        int y[] = {1, 2, 3, 1, 3, 4};

//        int x[] = {1, 2, 3};
//        int y[] = {1, 2, 3};
    int ans=maxPoints(x,y,x.length);
        System.out.println(ans);
    }
}
