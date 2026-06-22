import java.util.*;
class Fibonacci implements Runnable{
    int n ;
    Fibonacci(int n){
        this.n=n;
    }
    public void run(){
        int a = 0 , b=1;
        System.out.println("Fibonacci series:");
        for(int i=0;i<=n;i++){
            System.out.println(a+" ");
            int c = a+b;
            a=b;
            b=c;
        }
    }
}
class FibonacciSeries{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Thread t1 = new Thread(new Fibonacci(n));
        t1.start();
    }
}
