//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
        static int integer[]={1000,500,100,50,10,5,1};
    static Character roman[]={'M','D','C','L','X','V','I'};
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String s) {
         HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i <integer.length ; i++) {
            map.put(roman[i],integer[i] );
        }

        int integegrVal=map.get(s.charAt(s.length()-1));
        for (int i = s.length()-2; i >=0 ; i--) {
int former=map.get(s.charAt(i));
int later=map.get(s.charAt(i+1));
if(former<later){
    integegrVal=integegrVal-former;
}
else {
    integegrVal+=former;
}
        }
        return integegrVal;
    }
}