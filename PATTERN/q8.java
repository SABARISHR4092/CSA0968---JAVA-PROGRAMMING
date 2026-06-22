class MyThread extends Thread {

    public void run() {
        System.out.println("Thread running");
    }
}

class Counter implements Runnable {

    private int count = 0;

    public void increment() {
        count++;
    }

    public void run() {
        increment();
    }
}

public class q8 {

    public static void main(String[] args) throws InterruptedException {

        MyThread t1 = new MyThread();

        t1.start();

        Thread.sleep(100);

        System.out.println("Main thread finished");
    }
}