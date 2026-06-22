final class Constants{
    static final int MAX_SPEED = 120;
}
class SuperClass{
    public final void show(){
        System.out.println("This is a final keyword.");
    }
}
class SubClass extends SuperClass{

}
class AnotherClass{

}
public class Q9{
    static void main(String[] args) {
        final int speed ;
        speed = 100;

        System.out.println(speed);
        System.out.println(Constants.MAX_SPEED);
    }
}