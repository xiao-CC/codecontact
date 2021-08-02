package danli;

public class Hungry {
    //饿汉单例模式

    //这种设计模式下，属性、new、构造方法都是私有的，也就是封装的
    private String name;
    private static Hungry hungry=new Hungry("cui");
    private Hungry(String name){
        this.name=name;
    }

    //通过静态的get方法来创建对象
    //注意、此方法是public的
    public static Hungry getHungry(){
        return hungry;
    }

    //有时候该类需要调用其他对象，这时候会使用create方法来创建
    public static King createNewObject(String name){
        King obj = new King();
        return obj;
    }

}
