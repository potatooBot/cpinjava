package Algorithm.Binary_Search;

public class Nth_root_of_an_integer {
    public static double muliply(double val,int n){
        double ans=1;
        for (int i = 1; i <=n ; i++) {
            ans=ans*val;
        }
        return ans;
    }
    static   public double NthRoot(int n, int m)
    {
     double ans=0;
     double low=0;
     double high=m;


     double esp=1e-5;

     while (high-low>esp){
         double mid=(low+high)/2;
         if(muliply(mid,n)<=m){
             low=mid;
         }
         else high=mid;
     }
        System.out.println(low);
        // code here
        return (int)Math.floor(low);
    }
    public static void main(String[] args) {
        int n = 2, m = 9;
       double ans=NthRoot(n,m);
        System.out.println((int) ans);
    }
}
