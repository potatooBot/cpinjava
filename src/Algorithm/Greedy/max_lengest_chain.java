package Algorithm.Greedy;

import java.util.Arrays;

class Pair
{
    int x;
    int y;

    public Pair(int a, int b)
    {
        x = a;
        y = b;
    }
}
public class max_lengest_chain {
    static  int maxChainLength(Pair arr[], int n)
    {
        Arrays.sort(arr,(a,b)->Integer.compare(a.y,b.y));
        int maxi=1;
        int last=arr[0].y;
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i].x+" "+arr[i].y);
            if(last<arr[i].x){
                last=arr[i].y;
                maxi++;
            }
        }

     return maxi;   // your code here
    }


    public static void main(String[] args) {
        Pair arr[]=new Pair[5];

        arr[0]=new Pair(5,24);
        arr[1]=new Pair(39,60);
        arr[2]=new Pair(15,28);
        arr[3]=new Pair(27,40);
arr[4]=new Pair(50,90);
 int ans=maxChainLength(arr,5);
        System.out.println(ans);
    }
}
