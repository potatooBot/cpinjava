package Design_Questions;
import java.util.*;
import java.util.*;
public class shivam_test {
    public static String getUnique(String str){
        String arr[]=str.split("\\s+");
int ans=0;
    String res="";
        for (int i = 0; i < arr.length ; i++) {
            HashSet<Character> set=new HashSet<>();
            for (int j = 0; j <arr[i].length() ; j++) {
                set.add(arr[i].charAt(j));

            }
if(set.size()>=ans){
    ans=set.size();
    res=arr[i];
}
        }
        return res;
    }
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
        System.out.println(getUnique(str));



    }
}
