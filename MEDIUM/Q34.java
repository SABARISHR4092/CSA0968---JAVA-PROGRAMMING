import java.util.*;
class Student{
    String name;
    String regNo;
    int m1,m2,m3;
    int total ;
    double average;
    Student(String name,
            String regNo,
            int m1,
            int m2,
            int m3){
        this.name = name;
        this.regNo=regNo;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
        total = m1+m2+m3;
        average = total /3.0;
    }
    void display(){
        System.out.println("Student name :"+name);
        System.out.println("Student regNo: "+regNo);
        System.out.println("MARKS:");
        System.out.println("Subject1: "+m1);
        System.out.println("Subject2 "+m2);
        System.out.println("Subject3 "+m3);
        System.out.println("Total "+total);
        System.out.println("Average "+average);
    }
}
class StudentDemo{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter regNo:");
        String regNo = sc.nextLine();
        System.out.println("Enter 1st marks:");
        int m1 = sc.nextInt();
        System.out.println("Enter 2nd marks:");
        int m2 = sc.nextInt();
        System.out.println("Enter 3rd marks:");
        int m3 = sc.nextInt();
        Student s = new Student(name,regNo,m1,m2,m3);
        s.display();
    }
}