import java.util.*;

public class JavaHashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String first = sc.next();
            String second = sc.next();

            set.add(first + " " + second);

            System.out.println(set.size());
        }

        sc.close();
    }
}