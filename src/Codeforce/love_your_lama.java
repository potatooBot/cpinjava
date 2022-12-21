package Codeforce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class love_your_lama {
    public static void main(String[] args) {
        List <Integer> lst=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <7 ; i++) {
            lst.add(sc.nextInt());
        }

        System.out.println(Collections.max(lst)-Collections.min(lst));
    }
}
