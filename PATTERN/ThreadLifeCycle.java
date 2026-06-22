class LifeCycleThread extends Thread {
    public void run() {
        System.out.println("Thread is Running");
        try {
            Thread.sleep(15000);
        } catch (Exception e) {
        }
        System.out.println("Thread Finished");
    }
}
public class ThreadLifeCycle {
    public static void main(String[] args)
            throws Exception {
        LifeCycleThread t = new LifeCycleThread();
        System.out.println("State after creation : " + t.getState());
        t.start();
        System.out.println("State after start : " + t.getState());
        Thread.sleep(500);
        System.out.println("State during sleep : " + t.getState());
        t.join();
        System.out.println("State after completion : " + t.getState());
    }
}