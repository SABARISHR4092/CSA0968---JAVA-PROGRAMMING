import java.util.*;

class SessionManager<T> {
    private HashMap<String, T> sessions = new HashMap<>();

    public void addSession(String id, T data) {
        sessions.put(id, data);
    }

    public T getSession(String id) {
        return sessions.get(id);
    }

    public void removeSession(String id) {
        sessions.remove(id);
    }

    public void displaySessions() {
        Iterator<Map.Entry<String, T>> it = sessions.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, T> e = it.next();
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }

    public static void main(String[] args) {
        SessionManager<String> sm = new SessionManager<>();
        sm.addSession("S101", "User1");
        sm.addSession("S102", "User2");
        sm.displaySessions();
    }
}