class Parent{
    int x;
    Parent(int x){
        this.x =x;
    }
}
class Child extends Parent{
    int x;
    Child(int p,int c){
        super(p);
        this.x = c;
    }
    void display(){
        System.out.println("Parent value = "+super.x);
        System.out.println("Child value = "+this.x);
    }
}
class Superdemo{
    static void main(String[] args) {
        Child obj = new Child(100,200);
        obj.display();
    }
}