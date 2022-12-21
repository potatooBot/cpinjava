public class reverse_string {
    public static void main(String[] args) {
        String str="keshav";
        String reverse = "";


        for (int i = 0; i <str.length() ; i++) {
            reverse=  str.charAt(i)+reverse;
        }

        System.out.println(reverse);
    }
        }
