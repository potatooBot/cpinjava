package STRINGS_Pract;

public class check_if_two_array_strings_are_equivalent {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
String str1="";
String str2="";

        for (int i = word1.length-1; i >=0; i--) {
            str1=word1[i]+str1;
        }for (int i = word2.length-1; i >=0; i--) {
            str2=word2[i]+str2;
        }

    return str1.equals(str2);

    }
    public static void main(String[] args) {
        String str1[]= {"a", "cb"};
        String str2[]= {"a", "bc"};
        boolean check=arrayStringsAreEqual(str1,str2);
        System.out.println(check);
    }
}
