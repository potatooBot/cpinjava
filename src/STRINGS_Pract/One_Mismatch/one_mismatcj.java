package STRINGS_Pract.One_Mismatch;

public class one_mismatcj {
    static String isStringExist(String arr[],int N,String str){

     for(int i=0;i<arr.length;i++){
         String val=arr[i];
       //  System.out.println(val);
     int first=0;
     int second=0;
     int count=0;
     if(val.length()!=str.length()) continue;
     int len=Math.min(val.length(),str.length());
         for(int j=0;j<len;j++){
         if(val.charAt(j)==str.charAt(j)){
             first++;
             second++;
         }
         else{
             first++;
             second++;
             count++;
         }
     }
if(count==1) return "True";
     }
     return "False";

     // code here
    }
    public static void main(String[] args) {
        String arr[] = {"bana","apple","banaba","bonanzo"};
        String str = "banana";
        System.out.println(isStringExist(arr,arr.length,str));

    }
}
