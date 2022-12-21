import java.util.Scanner;
public class CHEFGAMES {
    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for (int i = 0; i <t ; i++) {
           int a,b,c,d;
           a= sc.nextInt();
           b= sc.nextInt();
           c= sc.nextInt();
           d= sc.nextInt();
           if(a==0&&b==0&&c==0&&d==0){
               System.out.println("IN");
           }
           else{
               System.out.println("OUT");
           }

            }
        }
    }

