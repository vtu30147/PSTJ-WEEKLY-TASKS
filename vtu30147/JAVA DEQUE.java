import java.util.*;

public class JavaDeque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        Deque<Integer> deque = new ArrayDeque<>();
        Map<Integer, Integer> map = new HashMap<>();

        int maxUnique = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            deque.addLast(num);
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (deque.size() == k) {
                maxUnique = Math.max(maxUnique, map.size());

                int removed = deque.removeFirst();

                if (map.get(removed) == 1) {
                    map.remove(removed);
                } else {
                    map.put(removed, map.get(removed) - 1);
                }
            }
        }

        System.out.println(maxUnique);

        sc.close();
    }
}