package bijiao;

public class BiJiao {
    public static void main(String[] args) {
        bijiao.User user1=new bijiao.User();
        user1.age=1;
        user1.arr=new int[]{1, 2, 3};
        user1.name=new String("cuihao");
        user1.id=123;
        user1.test=new bijiao.Test(1);

        bijiao.User user2=new bijiao.User();
        user2.age=1;
        user2.arr=new int[]{1, 2, 3};
        user2.name=new String("cuihao");
        user2.id=123;
        user2.test=new bijiao.Test(1);

        if (user1.equals(user2)){
            System.out.println("两个对象相等");
        }
        else {
            System.out.println("两个对象不相等");
        }

    }
}
