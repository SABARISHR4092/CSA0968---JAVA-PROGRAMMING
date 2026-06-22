import java.util.HashMap;
import java.util.Map;
 class EmployeeMap {

    public static void main(String[] args) {

        Map<Integer, String> emp =
                new HashMap<>();

        emp.put(101, "Sabarish");
        emp.put(102, "Rahul");
        emp.put(103, "Vijay");

        System.out.println("Employees:");
        System.out.println(emp);

        System.out.println("Is Empty? "
                + emp.isEmpty());

        emp.remove(102);

        System.out.println("After Remove:");
        System.out.println(emp);

        emp.clear();

        System.out.println("After Clear:");
        System.out.println(emp);
    }
}