class Numberthread extends Thread{
    String name;
    Numberthread(String name){
        this.name=name;
    }
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(name+" : "+i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class ThreeThreadsDemo{
    static void main(String[] args) {
        Numberthread t1 = new Numberthread("Thread-1");
        Numberthread t2 = new Numberthread("Thread-2");
        Numberthread t3 = new Numberthread("Thread-3");
        t1.start();
        t2.start();
        t3.start();
    }
}
