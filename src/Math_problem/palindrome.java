package Math_problem;
import java.util.*;
public class palindrome {
    static public void is_palindrome(int n)
    {
        // Code here
    ArrayList <Integer> list=new ArrayList<>();
int i=0;
        while(n!=0)
        {
            int rem=n%10;
         list.add(rem);
n=n/10;
        }

 i=0;int j= list.size()-1;
while (i<j){
    if(list.get(i)==list.get(j)){
        i++;j--;
    }
    else {
        System.out.println("No");
        break;
    }
}

        System.out.println("yes+");
    }
    public static void main(String[] args) {
        int n=55556;
        is_palindrome(n);
    }
}
