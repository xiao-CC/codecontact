package bijiao;

import java.util.Objects;

public class Test {
    int id;

    public Test(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        //判断对象是否相等

        //1.判断两个对象内存地址是否相等
        if (this == o)
            return true;
        //2.判断是否为空；判断是否为同一个类
        if (o == null || getClass() != o.getClass())
            return false;
        Test test = (Test) o;  //上一句已经判断过了，给到的参数一定是Test
        //3.判断其属性是否相等，如果相等，那么两个对象就相等
        return Objects.equals(id,test.id);
    }
}
