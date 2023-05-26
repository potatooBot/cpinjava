package Miscellaneous;

public class integegr_to_roman {
    static int integer[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
   static String roman[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};



static     public String intToRoman(int num) {
for (int i=0;i<integer.length;i++){
    if(num>=integer[i]){
        return roman[i] +intToRoman(num-integer[i]);
    }

}


    return "";
    }

    public static void main(String[] args) {
        int num= 3;
        String ans=intToRoman(num);
        System.out.println(ans);
    }
}
