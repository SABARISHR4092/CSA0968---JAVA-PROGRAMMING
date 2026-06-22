class Box {
    int length;
    int breadth;
    int height;
    Box() {
        length = 5;
        breadth = 4;
        height = 3;
    }
    int volume() {
        return length * breadth * height;
    }
}
 class BoxDemo {
    public static void main(String[] args) {
        Box b = new Box();
        System.out.println("Volume of Box = "
                + b.volume());
    }
}