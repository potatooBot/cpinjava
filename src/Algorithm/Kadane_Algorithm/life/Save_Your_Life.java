package Algorithm.Kadane_Algorithm.life;

import java.util.HashMap;

public class Save_Your_Life {
    static String maxSum(String word,char x[],int b[], int n){
int max_end_here=0;
int max_so_far=Integer.MIN_VALUE;
int s=0;int start=0,end=0;
        HashMap<Character,Integer> map=new HashMap<>();



        for (int i = 0; i <n ; i++) {
            map.put(x[i],b[i]);
        }

        for (int i = 0; i <word.length() ; i++) {
            if(map.containsKey(word.charAt(i))){
                max_end_here=max_end_here +map.get(word.charAt(i));
            }
            else {
                max_end_here=max_end_here +(int)word.charAt(i);
            }

            if(max_so_far<max_end_here){
                max_so_far=max_end_here;
                start=s;
                end=i;
            }
            if(max_end_here<0){
                max_end_here=0;
                s=i+1;
            }
        }

//        System.out.println(word.substring(start,end+1));

    return word.substring(start,end+1);    //code here
    }
    public static void main(String[] args) {
        String words = "dbfbsdbf ";
        int n = 2;
        char x[] = { 'b','s'  };
        int b[] = {  -100, 45 };
    String str=maxSum(words,x,b,n);
        System.out.println(str);
    }
}
