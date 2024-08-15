package Algorithm.Krishna_Exam;

import java.util.*;

public class placementlelo {
    static int placementlelo(int n, int m, List<Pair<Integer, Integer>> dealer, List<Pair<Integer, Integer>> x) {
        Collections.sort(dealer, (a, b) -> b.getValue().compareTo(a.getValue()));
        Collections.sort(x, (a, b) -> b.getValue().compareTo(a.getValue()));

        int b = 0;
        int i = 0;

        for (Pair<Integer, Integer> c : dealer) {
            while (i < m && x.get(i).getValue() > c.getValue()) {
                i++;
            }

            if (i < m && x.get(i).getKey() >= c.getKey()) {
                b++;
                i++;
            }
        }

        return b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        List<Pair<Integer, Integer>> dealer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            dealer.add(new Pair<>(first, second));
        }

        List<Pair<Integer, Integer>> x = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            x.add(new Pair<>(first, second));
        }

        int result = placementlelo(n, m, dealer, x);
        System.out.println(result);
    }

    static class Pair<K, V> {
        private final K key;
        private final V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
}