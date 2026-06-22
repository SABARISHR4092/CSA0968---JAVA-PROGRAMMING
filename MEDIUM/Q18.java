class TableThread extends Thread{
    int num;
    TableThread(int num){
        this.num = num;
    }
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(num+"+"+i+"="+(num*i));
            try{
                Thread.sleep(500);
            }catch(Exception e){

            }
        }
    }
}
class MultiplicationThread{
    static void main(String[] args) {
        TableThread t1 = new TableThread(5);
        TableThread t2 = new TableThread(2);
        t1.start();
        t2.start();
    }
}