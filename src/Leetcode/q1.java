package Leetcode;
import java.util.*;
public class q1 {
    static int swap(int input)
    {

        int decimalValue = 0x0000003D;
        String binaryValue = Integer.toBinaryString(decimalValue);
        char binaryString []=new char[binaryValue.length()];
        for (int i = 0; i <binaryString.length ; i++) {
            binaryString[i]=binaryValue.charAt(i);
        }

        for (int i = 1; i < binaryString.length; i = i + 2) {
            char currentBit = binaryString[i];
            char prevBit = binaryString[i-1];
            binaryString[i-1] = currentBit;
            binaryString[i] = prevBit;
        }
        String val="";
        for (int i = 0; i <binaryString.length ; i++) {
            val=val+binaryString[i];
        }
        int decimal = (int) Long.parseLong(binaryValue, 2);


        System.out.println("0x" + Integer.toHexString(decimal));


return decimal;
    }
    public static void main(String[] args) {
System.out.println(swap(0x0000003D));

    }
}
