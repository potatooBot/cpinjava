package Two_Pointers;

import org.jetbrains.annotations.NotNull;

public class Minimum_Length_of_String_After_Deleting_similar_Ends {
    public static int minimumLength(@NotNull String s) {
        int low=0;
        int high=s.length()-1;
        int cnt=0;
        while(low<high){
            if(s.charAt(low)==s.charAt(high)){
                cnt=cnt+2;;
                char ch=s.charAt(low);
                low++;
                while(s.charAt(low)==ch&&low<high){
                    cnt++;
                    low++;
                }
                high--;
                while(s.charAt(high)==ch&&high>low){
                    cnt++;
                    high--;
                }
            }
            else{
             return s.length()-cnt;
            }


        }
        return s.length()-cnt;
    }
    public static void main(String[] args) {
String str= "aaaaaabbbbbababababababbabaabababbccccccbbbbbbaaa";
        System.out.println(minimumLength(str));
    }
}
