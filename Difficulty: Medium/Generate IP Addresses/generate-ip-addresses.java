//{ Driver Code Starts
import java.util.*;
class GenIP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            Solution sln = new Solution();
            ArrayList<String> str = sln.genIp(s);
            Collections.sort(str);
            if(str.size() == 0)
                System.out.println(-1);
            else{
                for (String u : str) {
                    System.out.println(u);
                }
            }
        }
    }
}
// } Driver Code Ends


/*complete the Function*/

class Solution {
     public void backtrack(String s,int idx,int dots,String cur,ArrayList<String> ans){
        if(dots>4) return;
        if(dots==4&&idx==s.length()){
            ans.add(cur.substring(0,cur.length()-1));
            return ;
        }
        for(int i=1;i<=3;i++){
            if(idx+i>s.length()) return;
            String val=s.substring(idx,idx+i);
            if(i>1&&val.charAt(0)=='0') return;
            if(Integer.parseInt(val)>255) return;
            backtrack(s,idx+i,dots+1,cur+val+".",ans);
        }
    }
    public ArrayList<String> genIp(String s) {
       ArrayList<String> ans=new ArrayList<>();
        backtrack(s,0,0,"",ans);
        return ans;
    }
}