package STRINGS_Pract;

public class cordinate_of_chess {
    public static boolean squareIsWhite(String c) {
        char ini=c.charAt(0);
        int val=c.charAt(1)-'0';
        boolean check=true;
        if(ini=='a'||ini=='c'||ini=='e'||ini=='g'){
            if(val%2==0) return true;
            check=false;
        }

        if(ini=='b'||ini=='d'||ini=='f'||ini=='h'){
            if(val%2==0) return false;
            else {

                check = true;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        String s="b3";
        boolean check=squareIsWhite(s);
        System.out.println(s.charAt(0)-'a');
        System.out.println(check);
    }
}
