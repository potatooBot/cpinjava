package Heap_Practice;

import java.util.*;

public class top_k_frequent_word {


    public static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for(String word:words){
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(new MyComparator());
        for(Map.Entry<String, Integer> e:map.entrySet()){
            pq.offer(e);
        }
        List<String> ans = new LinkedList<>();
        for(int i = 0;i<=k-1;i++){
            ans.add(pq.poll().getKey());
        }
        return ans;
    }
static
class MyComparator implements Comparator<Map.Entry<String, Integer>> {
    public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
        String word1 = e1.getKey();
        int freq1 = e1.getValue();
        String word2 = e2.getKey();
        int freq2 = e2.getValue();
        if (freq1 != freq2) {
            return freq2 - freq1;
        } else {
            return word1.compareTo(word2);
        }
    }
}
    public static void main(String[] args) {
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 1;
        List<String> lst = new ArrayList<>();
        lst = topKFrequent(words, k);
        System.out.println(lst);
    }

}