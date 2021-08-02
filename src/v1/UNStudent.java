package oop.extends_interface.v1;

/**
 * UNStudent 继承了 Student
 * 子  父 类处于 同包中
 *
 */
public class UNStudent extends Student{

    public void printInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(score);
        //System.out.println(id); 私有的
    }

    @Override // 注解 - 检查注解
    public  UNStudent exam(Student stu){

        return null;

    }



}
