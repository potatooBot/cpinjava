package Algorithm.SlidingWIndow;

public class kth_beauty_of_number {
    public static int divisorSubstrings(int num, int k) {
String str=String.valueOf(num);
        System.out.println(str);
        String s="";
        for (int i = 0; i <k ; i++) {
            s=s+str.charAt(i);
        }
        int c=0;
        int val=0;
        for (int i = k; i <str.length() ; i++) {
            val=Integer.parseInt(s);

            if(val!=0&&(num%val)==0) c++;
           s=s.substring(1);
           s=s+str.charAt(i);

            System.out.println(s);
        }

        val=Integer.parseInt(s);
        if(val!=0&&num%val==0) c++;
        return c ;
    }

    public static void main(String[] args) {
        int  num = 10, k = 1;
       int result= divisorSubstrings(num,k);
        System.out.println(result);
    }
}
