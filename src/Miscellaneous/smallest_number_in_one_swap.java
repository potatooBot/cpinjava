package Miscellaneous;

public class smallest_number_in_one_swap {
    static  public String smallestNumber(String s)
    {
        int mini=Integer.MAX_VALUE;
        int i=0;
        int j=0;
        for ( i = 0; i <s.length() ; i++) {
            int former=Integer.parseInt(String.valueOf(s.charAt(i)));
           mini=Integer.MAX_VALUE;
            for ( j = i+1; j <s.length() ; j++) {
mini=Math.min(mini,Integer.parseInt(String.valueOf(s.charAt(j))));
            }
            if(mini==0&&i!=0) {
                break;
            }
        }
        System.out.println(i);
        char ch=s.charAt(i);
    String ans=s.substring(0,i)+String.valueOf(mini)+s.substring(i+1);

        for (int k = s.length()-1; k >=0 ; k--) {
          int chVal=Integer.parseInt(String.valueOf(mini));
          int checkVal=Integer.parseInt(String.valueOf(ans.charAt(k)));

           if(chVal==checkVal){
                System.out.println("hm");
                ans=ans.substring(0,k) +ch+ans.substring(k+1);
                break;
            }
        }
        System.out.println(ans);
     return "";   //complete the function here
    }
    public static void main(String[] args) {
        String N = "9625635";
String ans=smallestNumber(N);
        System.out.println(ans);
    }
}
