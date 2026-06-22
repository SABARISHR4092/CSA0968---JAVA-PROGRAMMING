import java.util.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class StudentRecord {
    public static void main(String[] args) {

        TreeMap<Integer, Student> map = new TreeMap<>();

        map.put(101, new Student(101, "Ram"));
        map.put(103, new Student(103, "John"));
        map.put(102, new Student(102, "Arun"));

        for (Map.Entry<Integer, Student> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue().name);
        }

        System.out.println("Search ID 102 : " + map.get(102).name);
    }
}