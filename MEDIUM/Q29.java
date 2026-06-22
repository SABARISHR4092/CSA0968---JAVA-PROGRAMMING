import java.util.ArrayList;
import java.util.ListIterator;
 class ListIteratorDemo {

    public static void main(String[] args) {

        ArrayList<String> list =
                new ArrayList<>();

        list.add("C");
        list.add("A");
        list.add("E");
        list.add("B");
        list.add("D");
        list.add("F");

        ListIterator<String> itr =
                list.listIterator();

        while (itr.hasNext()) {

            String value = itr.next();

            itr.set(value + "+");
        }

        System.out.println("Reverse Order:");

        while (itr.hasPrevious()) {

            System.out.print(
                    itr.previous() + " ");
        }
    }
}