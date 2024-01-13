//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            int N = Integer.parseInt(read.readLine().trim());
            String []input_line = read.readLine().trim().split("\\s+");
            String S1 = input_line[0];
            String S2 = input_line[1];
            Solution obj = new Solution();
            int ans = obj.minManipulation(N, S1, S2); 
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    int minManipulation(int N, String s, String t) 
    {
        HashMap<Character,Integer> map1=new HashMap<>();
HashMap<Character,Integer> map2=new HashMap<>();

for(int i=0;i<s.length();i++){

    map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0)+1);
}
int ans=0;

for(Map.Entry<Character,Integer> e: map1.entrySet()){
            int val=e.getValue();
            char key=e.getKey();
            int x=(map2.containsKey(key)) ? map2.get(key) : 0;
            int cnt=val-x;
          //  System.out.println(key);
            if(cnt>0) ans+=cnt;
//System.out.println(ans);
        }


return ans; 
    }
} 