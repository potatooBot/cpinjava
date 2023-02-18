package STRINGS_Pract;

public class shortest_distance_to_character {
    public static int[] shortestToChar(String s, char c) {
        int ans[]=new int[s.length()];
        int count=0;
        int idx=0;
        boolean check=true;
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)!=c){
                count++;

            }
            else {
                for (int j = count; j >=0 ; j--) {
                    ans[idx++]=count;
                    count=count -1;
                }
                count=0;
            }
        }
return ans;
    }
    public static void main(String[] args) {
        String str="loveleetcode";
        char c='e';
int ans[]=shortestToChar(str,c);
        for (int i = 0; i < ans.length ; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
