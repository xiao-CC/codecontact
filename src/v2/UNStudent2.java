package oop.extends_interface.v2;

import oop.extends_interface.v1.Student;

/**
 * UNStudent2 继承了 Student
 * 子  父 类处于 不同包中
 * 子类{} 中 私有的 缺省的都不可以调用
 */
public class UNStudent2 extends Student {

    public void printInfo(){
        System.out.println(name);
        System.out.println(age);
//        System.out.println(score); 缺省的
//        System.out.println(id); 私有的
    }

}
