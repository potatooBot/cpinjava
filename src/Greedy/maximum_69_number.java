package Greedy;

public class maximum_69_number {
    public static void maximum69Number (int num) {

        int[] digits = Integer.toString(num).chars().map(c -> c-'0').toArray();
       for (int i=0;i< digits.length;i++){
           if(digits[i]==6){
               digits[i]=9;
           break;
           }
       }
        int res=0;
        for(int i=0;i<digits.length;i++) {
            res=res*10+digits[i];
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        int num = 9669;
maximum69Number(num);
    }
}
