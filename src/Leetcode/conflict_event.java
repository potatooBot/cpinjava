package Leetcode;

import java.time.LocalTime;
import java.util.ArrayList;

public class conflict_event {
    public static boolean haveConflict(String[] event1, String[] event2) {


        LocalTime time1Eve1
                = LocalTime.parse(event1[0]);
        LocalTime time2Eve1
                = LocalTime.parse(event1[1]);

        LocalTime time1Eve2
                = LocalTime.parse(event2[0]);
        LocalTime time2Eve2
                = LocalTime.parse(event2[1]);
int v1=time1Eve1.compareTo(time1Eve2);
int v2=time2Eve1.compareTo(time1Eve2);
if(v1==0&&v2>0){
    return true;
}


return false;
    }
    public static void main(String[] args) {
        String[] event1={"01:15","02:00"};
        String[] event2={"02:00","03:00"};
        boolean ch=haveConflict(event1,event2);
        System.out.println(ch);
    }
}
