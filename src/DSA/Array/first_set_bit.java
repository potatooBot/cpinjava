package DSA.Array;

public class first_set_bit {
    public static void main(String[] args) {
        int num=12;

        String str=Integer.toBinaryString(num);
        System.out.println(str);
        for (int i = str.length()-1; i >=0 ; i--) {
            if(str.charAt(i)=='1'){

                System.out.println(str.length()-i);
                break;
            }
        }
    }
}
