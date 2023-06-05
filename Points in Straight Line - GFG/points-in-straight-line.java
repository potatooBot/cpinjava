//{ Driver Code Starts
    import java.util.*;
    class TestClass 
    {
        public static void main(String args[] ) throws Exception 
        {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            while(T>0)
            {
            	int N = sc.nextInt();
            	
            	int x[] = new int[N];
       			int y[] = new int[N];
            	for(int i = 0; i < N; i++)
            		x[i] = sc.nextInt();
	for(int i = 0; i < N; i++)
            		y[i] = sc.nextInt();
            	System.out.println(new GfG(). maxPoints(x,y,N));
            T--;
            }
        }
    }
// } Driver Code Ends


class GfG{
    int maxPoints(int x[],int y[],int n) {
        //You are required to complete this method
                int maxi=0;
        for (int i = 0; i <n; i++) {
            HashMap<Double,Integer> map=new HashMap<>();
double val=0;

            for (int j = 0; j <n ; j++) {
                if (i != j) {

                    if (x[j] - x[i] == 0) {
                      val=Double.MAX_VALUE;
                    } else {
                        val=(double) (y[j]-y[i])/(double)(x[j]-x[i]);
                    }
                    map.put(val, map.getOrDefault(val,0) + 1);
                    maxi=Math.max(maxi,map.get(val));
                }
            }
        }

       return (maxi)+1;
   }
}