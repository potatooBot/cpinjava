package Algorithm.Binary_Search.Find_the_nth_root_of_integers;

public class nth_root_of_an_integer {

    public static long findVal(long mid,int n,int m){
  long ans=1;
        for (int i =1; i <=n ; i++) {
            ans= ans*mid;
            if(ans>m) return 2;
        }
        if(ans==m) {
            return 1;
        }

        return 0;
    }
    static public int NthRoot(int n, int m)
    {
        long low=1;
        long high=m;
        long ans=-1;
        while (low<=high){
            long mid=(low+high)/2;

if(findVal(mid,n,m)==1){
    return (int) mid;
}
else if(findVal(mid,n,m)==2){
    high=mid-1;
}
else {
    low=mid+1;
}
        }

        return -1;
    }
    public static void main(String[] args) {
        int n=2;
        int m=9;
        int ans=NthRoot(n,m);
        System.out.println(ans);
    }
}
