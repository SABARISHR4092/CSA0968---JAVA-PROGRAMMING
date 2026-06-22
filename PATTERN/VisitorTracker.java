import java.util.*;

public class VisitorTracker {
    public static void main(String[] args) {

        HashSet<String> visitors = new HashSet<>();

        visitors.add("Alice");
        visitors.add("Bob");
        visitors.add("Alice");

        Iterator<String> it = visitors.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("Unique Visitors = " + visitors.size());
    }
}