package STRINGS_Pract;

public class string_rotatted_by_two {
//
       public static boolean isRotated(String str1, String str2)
    {

char charArr[]=str1.toCharArray();
        for (int i = 0; i <2 ; i++) {
            char temp=charArr[0];

            for (int j = 0; j <str1.length()-1 ; j++) {
                charArr[j]=charArr[j+1];

            }
            charArr[str1.length()-1]=temp;
      
        }
        String str=new String(charArr);
        if (str.equals(str2)) return true;
        charArr=str1.toCharArray();
        String strAns=new String(charArr);
        System.out.println(strAns);
        for (int i = 0; i <2 ; i++) {
            char temp=charArr[str1.length()-1];

            for (int j = str1.length()-1; j >0 ; j--) {
              charArr[j]=charArr[j-1];
            }
            charArr[0]=temp;
        
        }
        strAns=new String(charArr);
        //  System.out.println(strAns);
        if (strAns.equals(str2)) return true;

        return false;// Your code here
    }
    public static void main(String[] args) {
      String a="amazon";
      String b="azonam";
    boolean ans=isRotated(a,b);
        System.out.println(ans);
    }
}
