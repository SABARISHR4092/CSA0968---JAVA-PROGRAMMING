import java.util.Hashtable;
 class HashTableDemo {

    public static void main(String[] args) {

        Hashtable<Integer, String> bank =
                new Hashtable<>();

        bank.put(101, "Sabarish");
        bank.put(102, "Arun");
        bank.put(103, "Karthik");

        System.out.println("Records:");
        System.out.println(bank);

        System.out.println("Size = "
                + bank.size());

        bank.clear();

        System.out.println("After Clear:");
        System.out.println(bank);
    }
}
