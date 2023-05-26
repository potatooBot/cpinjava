import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

public class coin_exchange {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();

        int[] notes = new int[]{ 100, 50, 10, 5, 2, 1 };
        int[] noteCounter = new int[6];

        for (int i = 0; i < 6; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount % notes[i];
            }
        }

        int count=0;

        for (int i = 0; i < 6; i++) {
            if (noteCounter[i] != 0) {
                count=count+noteCounter[i];
            }
        }

        System.out.println(count);
    }
}
