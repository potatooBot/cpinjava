package Segment_Tree.SeegmentTree_Bracket;

import java.util.Scanner;


public class SegmentTreeBracket {
    static class info{
        int open;
        int close;
        int full;
        info(int _open,int _close,int _full){
            open=_open;
            close=_close;
            full=_full;
        }
    }
    public static info merge(info left,info right){
info ans=new info(0,0,0);
ans.full=left.full + right.full + Math.min(left.open,right.close);
ans.open=left.open + right.open - Math.min(left.open,right.close);
ans.close=left.close + right.close - Math.min(left.open,right.close);

return ans;
    }
public static void build (int idx,int low,int high,String s,info [] seg){
    if(low==high){
        if(s.charAt(low)=='('){
           seg[idx]=new info(1,0,0);
        }
        else if(s.charAt(low)==')'){
            seg[idx]=new info(0,1,0);

        }
        return;
    }

    int mid=(low+high)/2;
 build(2*idx+1,low,mid,s,seg);
   build(2*idx+2,mid+1,high,s,seg);
seg[idx]= merge(seg[2*idx +1],seg[2*idx+2]);
}
public static info query(int idx,int low,int high,int l,int r,info seg[]){
        if(r<low||l>high){
            return new info(0,0,0);
        }
        if(low>=l&&high<=r){
            return seg[idx];
        }
        int mid=(low+high)/2;
        info left=query(2*idx+1,low,mid,l,r,seg);
        info right=query(2*idx+2,mid+1,high,l,r,seg);
return merge(left,right);
    }
    public static void main(String[] args) {
//String str="((()";
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        int q = sc.nextInt();
        info seg[] = new info[4 * str.length()];
        build(0, 0, str.length() - 1, str, seg);
        while (q!=0) {
int l=sc.nextInt();
int r= sc.nextInt();

l--;
r--;

            info ans = query(0, 0, str.length() - 1, l, r, seg);
            System.out.println(ans.full * 2);
            q--;
        }
    }
}
