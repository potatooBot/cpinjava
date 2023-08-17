package STRINGS_Pract.String_Rotated_by_two_places;
import java.util.*;
public class string_rotatted_by_two_places {
    public static void reverse(char arr[],int start,int end){


        while(start<end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void checkLeft(char arr[]){
        reverse(arr,0,1);
        reverse(arr,2,arr.length-1);
        reverse(arr,0,arr.length-1);

    }
    public static void  checkRight(char arr[]){
        reverse(arr,0,arr.length-1);
        reverse(arr,0,1);
        reverse(arr,2,arr.length-1);
    }
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String str=sc.next();
String str2=sc.next();
if(str.length()!=str2.length()){
    System.out.println(false);
}
if(str.length()==1&&str2.length()==1){
    System.out.println(false);
}
int n=str.length();
char arr[]=new char[n];
arr=str.toCharArray();

        char arr2[]=new char[n];
        arr2=str.toCharArray();
checkLeft(arr);
checkRight(arr2);
String res1=new String(arr);
String res2=new String(arr2);
boolean ans1=false;
boolean ans2=false;
if(res1.equals(str2)){
    ans1=true;
}
if(res2.equals(str2)){
    ans2=true;
}
if(ans1||ans2){
    System.out.println(true);
}
else {
    System.out.println(false);
}


    }
}
