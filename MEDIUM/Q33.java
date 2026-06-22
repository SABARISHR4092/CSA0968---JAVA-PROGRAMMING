class Parent2 {

    void displayParent() {
        System.out.println("This is parent class");
    }

    public void displayParent2() {
    }
}

class Child2 extends Parent2 {
    void displayChild2() {
        System.out.println("This is child class");
    }
}
 class InheritanceDemo {

    public static void main(String[] args) {

        Parent2 p = new Parent2();

        Child2 c = new Child2();

        // 1
        p.displayParent2();

        // 2
        c.displayChild2();

        // 3
        c.displayParent();
    }
}
