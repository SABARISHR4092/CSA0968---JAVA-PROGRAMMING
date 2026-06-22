import java.util.*;

public class LogAnalyzer {
    public static void main(String[] args) {

        Hashtable<String, List<String>> logs = new Hashtable<>();

        logs.put("ERROR", new ArrayList<>());
        logs.put("INFO", new ArrayList<>());

        logs.get("ERROR").add("File Not Found");
        logs.get("ERROR").add("Database Error");

        logs.get("INFO").add("Login Success");

        Iterator<String> it = logs.keySet().iterator();

        while (it.hasNext()) {
            String type = it.next();

            System.out.println(type + " Logs");

            for (String log : logs.get(type)) {
                System.out.println(log);
            }
        }
    }
}