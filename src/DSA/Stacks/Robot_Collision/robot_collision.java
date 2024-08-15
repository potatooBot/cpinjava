package DSA.Stacks.Robot_Collision;
import java.util.*;

class pair{
    int first;
    int second;
    pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
public class robot_collision {
    public static List<Integer> survivedRobotsHealths(int[] pos, int[] hea, String dir) {
        int arr[][]=new int[pos.length][3];
        for(int i=0;i<pos.length;i++){
            if(dir.charAt(i)=='L'){
                arr[i][0]=pos[i];
                arr[i][1]=hea[i];
                arr[i][2]=-1;
            }
            else{
                arr[i][0]=pos[i];
                arr[i][1]=hea[i];
                arr[i][2]=1;
            }
        }
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        List<Integer> ans=new ArrayList<>();

        for(int ele[]:arr) System.out.println(Arrays.toString(ele));
        Stack<pair> stk=new Stack<>();
        for(int ele[]:arr) {
            int p = ele[0];
            int h = ele[1];
            int d = ele[2];
            boolean flag = false;

            if (d == -1) {
                while (stk.isEmpty() == false && stk.peek().second == 1 && stk.peek().first < h) {
                    stk.pop();
                    h = h - 1;
                }
                if (stk.isEmpty() == false && h == stk.peek().first) {
                    stk.pop();
                    h = h - 1;
                    flag = true;
                    break;
                }
                if (stk.isEmpty() == false && stk.peek().first > h) {
                    int val = stk.peek().first;
                    stk.pop();
                    stk.add(new pair(val-1, 1));
                    flag = true;
                 continue;
                }
                if (flag == false) {
                    stk.add(new pair(h, d));
                }

            }
            if(d==1){
                while (stk.isEmpty() == false && stk.peek().second == -1 && stk.peek().first < h) {
                    stk.pop();
                    h = h - 1;
                }
                if (stk.isEmpty() == false && h == stk.peek().first) {
                    stk.pop();
                    h = h - 1;
                    flag = true;
                    break;
                }
                if (stk.isEmpty() == false && stk.peek().first > h) {
                    int val = stk.peek().first;
                    stk.pop();
                    stk.add(new pair(val-1, 1));
                    flag = true;
                  continue;
                }
                if (flag == false) {
                    stk.add(new pair(h, d));
                }
            }
            else{
                if(stk.isEmpty()==true){
                    stk.add(new pair(h,d));
                }
            }
        }
        for (pair ele:
             stk) {
            System.out.println(ele.first+" "+ele.second);
        }
        return ans;

    }
    public static void main(String[] args) {
/*int pos[]={3,5,2,6};
int hea[]={10,10,15,12};
String dir="RLRL";

*/
        int pos[]={7,1,3,2,6,4};
int hea[]={8,10,5,12,15,7};
String dir="RLLRRL";
        System.out.println(survivedRobotsHealths(pos,hea,dir));
    }
}
