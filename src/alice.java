import java.math.BigInteger;
import java.util.*;
import java.lang.*;
import java.io.*;


public class alice {


    public static void main(String[] args) {
        int num=1248;
        int dup=num;
        int count=0;
        while(dup!=0){
            int rem=dup%10;
            dup=dup/10;
            if(num%rem==0) count++;

        }
        System.out.println(count);
    }
}



