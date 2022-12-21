package STRINGS_Pract;

public class valid_ip_address {
    public static boolean isValid(String str) {
        int j=0;
        String check="";
        int dotcount=0;
        int chcount=0;
        for (int i = 0; i <str.length() ; i++) {
            chcount++;

            if(str.charAt(i)=='.'){
                dotcount++;

check=str.substring(j,i);
                j=i;
                if(check.length()>=2) {
                    if (check.charAt(0) == '0' && check.charAt(1) == '0') return false;
                }
//                System.out.println(check);
               String fin=check.replace(".","");
//                System.out.println(fin);

                int incheck=Integer.parseInt(fin);
                if(incheck<0||incheck>255) {
                return false;
                }

            }
        }

        if(dotcount<3||dotcount>=4){
            return false;
        }
        check=str.substring(j+1,str.length());

        if(check.length()>=2) {
            if (check.charAt(0) == '0' && check.charAt(1) == '0') return false;
        }
        int incheck=Integer.parseInt(check);

        if(incheck<0||incheck>255) {
            return false;
        }

       return true;
    }
    public static void main(String[] args) {
//        String address = "192.168.0.255";
//        String address="1.1.1";
//        String address="2.2.2.2.2";
        String address="1...1";
        boolean check=isValid(address);
        System.out.println(check);
    }
}
