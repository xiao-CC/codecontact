package oop.extends_interface.v1;

public class StuManage {
    public static void main(String[] args) {
        UNStudent unstu = new UNStudent();
        unstu.name="";
        unstu.age=20;
        unstu.score=100;
//        unstu.id=10;

        Student stu2 = (Student) unstu;

        UNStudent unstu3 = (UNStudent) stu2;

        // ClassCastException
        Student  stu = new Student();
        UNStudent unstu2 = (UNStudent) stu;
        unstu2.printInfo();


    }
}
