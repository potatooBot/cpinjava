//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}
// } Driver Code Ends


class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        
        if(a.length()!=b.length()){
            return false;
        }
        
       /* ArrayList<Character> str1=new ArrayList<>();
        
        for(int i=0;i<a.length();i++){
            str1.add(a.charAt(i));
            
        }
        
          ArrayList<Character> str2=new ArrayList<>();
        
        for(int i=0;i<b.length();i++){
            str2.add(b.charAt(i));
        }
        
        
Collections.sort(str1);
Collections.sort(str2);

if(str1.equals(str2)) {
    return true;
}*/

LinkedHashMap <Character,Integer> map1=new LinkedHashMap<>();
LinkedHashMap <Character,Integer> map2=new LinkedHashMap<>();

    for(int i=0;i<a.length();i++){
            map1.put(a.charAt(i),map1.getOrDefault(a.charAt(i),0)+1);
            map2.put(b.charAt(i),map2.getOrDefault(b.charAt(i),0)+1);
            
        }
        
if(map1.equals(map2)) return true;

return false;
    }
}