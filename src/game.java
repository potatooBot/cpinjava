public class game {
    public  static int Game(String str,int n){
        int a=str.charAt(0);
        int b=str.charAt(1);
        String rep="";
        int count=0;
        char ch='S';
        for (int i = 0; i <str.length() ; i++) {
            if(count!=n&&str.charAt(i)=='R') {
                str = str.substring(0, i) + ch
                        + str.substring(i + 1);
                count++;
            }
            else if(count==n) break;
        }
count=0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='S'){
count=count+1;
            }
            else if(str.charAt(i)=='R') {
                count=count-1;
            }
        }

        return count;
    }
    public static void main(String[] args) {
int x=Game("SR",1);
        System.out.println(x);

    }
}
