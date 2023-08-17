package Graph.BFS.Shortest_Prime_Path;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
class pair{
    int data;
    int steps;
    pair(int data,int steps){
        this.data=data;
        this.steps=steps;
    }
}
public class shortest_prime_Path {
    static   int solve(int num1,int num2){

     boolean prime[]=new boolean[100000];
        Arrays.fill(prime,true);
     for (int p = 2; p*p <100000 ; p++) {
         if (prime[p] == true) {
             for (int i = p * p; i < 10000; i = i + p) {
prime[i]=false;
             }
         }
     }
//        for (int i = 0; i < prime.length ; i++) {
//            System.out.println(prime[i]);
//        }
        Queue<pair> q=new LinkedList<>();
     q.add(new pair(num1,0));
     boolean vis[]=new boolean[100000];
     vis[num1]=true;
int mini=Integer.MAX_VALUE;

     while (q.isEmpty()==false){
         int val=q.peek().data;
         int steps=q.peek().steps;
         q.remove();
         if(val==num2){
            return steps;
         }
         String str=String.valueOf(val);
         char ch[]=new char[str.length()];

         ch=str.toCharArray();

         for (int i = 0; i < 4 ; i++) {
             char temp=ch[i];
             for (char dig = '0'; dig <= '9'; dig++) {
if(i==0&&dig=='0'){
    continue;
}
ch[i]=dig;
String concated=new String(ch);
ch[i]=temp;
                int newVal=Integer.valueOf(concated);
                if(prime[newVal]==true&&vis[newVal]==false){

                    q.add(new pair(newVal,steps+1));
                    vis[newVal]=true;
                }
             }
         }
     }




     return mini;   //code here
    }
    public static void main(String[] args) {
        int num1 = 1033;
        int num2 = 8179;
        int ans=solve(num1,num2);
        System.out.println(ans);

    }
}
