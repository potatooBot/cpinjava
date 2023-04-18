public class game {
    public  static int Game(int n){
if(n==1) return 1;
if(n==2) return 1;

        return Game(n-1)+Game(n-2);
    }
    public static void main(String[] args) {
Game(5);

    }
}
