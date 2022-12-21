//
//A gene string can be represented by an 8-character long string, with choices from 'A', 'C', 'G', and 'T'.
//
//        Suppose we need to investigate a mutation from a gene string start to a gene string end where one mutation is defined as one single character changed in the gene string.
//
//        For example, "AACCGGTT" --> "AACCGGTA" is one mutation.
//        There is also a gene bank bank that records all the valid gene mutations. A gene must be in bank to make it a valid gene string.
//
//        Given the two gene strings start and end and the gene bank bank, return the minimum number of mutations needed to mutate from start to end. If there is no such a mutation, return -1.
//
//        Note that the starting point is assumed to be valid, so it might not be included in the bank.
//
//
//
//        Example 1:
//
//        Input: start = "AACCGGTT", end = "AACCGGTA", bank = ["AACCGGTA"]
//        Output: 1
//        Example 2:
//
//        Input: start = "AACCGGTT", end = "AAACGGTA", bank = ["AACCGGTA","AACCGCTA","AAACGGTA"]
//        Output: 2
package STRINGS_Pract;

import java.util.HashSet;

public class minimum_no_of_mutations_unsolved {
    public static void minMutation(String start, String end, String[] bank) {
        int count=0;
        HashSet <String> set =new HashSet<>();
        for (int i = 0; i < bank.length ; i++) {
            set.add(bank[i]);
        }
        System.out.println(set);
        System.out.println("start "+start);
        System.out.println("end "+end);
        for (int i = start.length()-1; i >=0 ; i--) {

            if(start.charAt(i)!=end.charAt(i)){
                start= start.substring(0, i) + end.charAt(i) + start.substring(i + 1);
                System.out.println(start);
     if(set.contains(start))
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        String start = "AACCGGTT";
        String end = "AAACGGTA";
        String []bank = {"AACCGGTA","AACCGCTA","AAACGGTA"};
       minMutation(start,end,bank);
    }
}
