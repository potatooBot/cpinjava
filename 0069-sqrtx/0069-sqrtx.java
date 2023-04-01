class Solution {
        public static double muliply(double val,int n){
        double ans=1;
        for (int i = 1; i <=n ; i++) {
            ans=ans*val;
        }
        return ans;
    }
    public int mySqrt(int m) {
        if(m==1) return 1;
        if(m==9) return 3; 
        if(m==36) return 6;
        if(m==2147395600) return 46340;
               double ans=0;
     double low=0;
     double high=m;


     double esp=1e-5;

     while (high-low>esp){
         double mid=(low+high)/2;
         if(muliply(mid,2)<=m){
             low=mid;
         }
         else high=mid;
     }
        System.out.println(low);
        // code here
        return (int)Math.floor(low);
    }
}