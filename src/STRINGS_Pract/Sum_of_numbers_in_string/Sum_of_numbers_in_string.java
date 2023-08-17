package STRINGS_Pract.Sum_of_numbers_in_string;

import java.util.Arrays;

public class Sum_of_numbers_in_string {
    public static long findSum(String s)
    {
        long sum=0;
        String val=s.replaceAll("[^0-9]",",");

        String str[]=val.split(",");

        for (int i = 0; i <str.length ; i++) {
            if(str[i]==null||str[i]=="") continue;
            sum=sum+Long.parseLong(str[i]);
        }


        return sum;
    }
    public static void main(String[] args) {
        String str = "g1abc23";
       long sum=findSum(str);
        System.out.println(sum);

    }
}
