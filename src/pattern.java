import java.util.HashSet;
import java.util.Scanner;

public class pattern {
    public static String pattern(String [] str){

        char arr[]=str[0].toCharArray();


        HashSet <Integer> set=new HashSet<>();
        boolean check=true;
        String res="";
        for (int i = 0; i <str.length-1; i++) {

            System.out.println(str[i].compareTo(str[i+1]));
            int temp=str[i].compareTo(str[i+1]);
            if(!set.contains(temp)){
                check=true;
            }
            set.add(temp);
             res=str[i+1];
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String []str =new String[4];
        for (int i = 0; i <n ; i++) {
            str[i]= sc.next();
        }
        pattern(str);

    }
}
