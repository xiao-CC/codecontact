package oop.extends_interface.v2;

/**
 *  不同包 的非子类中
 *
 *  受保护的  缺省 私有 都不能调用
 *
 *
 */
public class StuManage {
    public static void main(String[] args) {
        UNStudent2 unstu = new UNStudent2();
        unstu.name="";
//        unstu.age=20; 受保护
//        unstu.score=100;
//        unstu.id=10;


    }
}
