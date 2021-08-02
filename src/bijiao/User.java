package bijiao;

public class User {
    String name;
    int age;
    bijiao.Test test;
    Integer id;
    int[] arr;

    @Override
    public boolean equals(Object obj) {
        if (this==obj){
            return true;
        }
        if (obj==null||this.getClass()!=obj.getClass()){
            return false;
        }
        User u=(User)obj;//强转这里有问题
        if(this.test.equals(u.test)
                &&this.id.equals(u.id)
                &&this.name.equals(u.name)
                &&this.arrEquals(u.arr)
                &&this.age== u.age)
        {
            return true;
        }else return false;
    }

    public boolean arrEquals(int[] arr){
        if(this.arr.length!=arr.length)return false;
        for(int i=0;i<arr.length;i++)  //先判断，再执行
        {
            if (this.arr[i]!=arr[i]){
                return false;  //此处返回了false的话，方法就结束了，不需要break
            }
        }  //for外面是要有返回值的，因为数组的长度为空时，for不执行
        return true;
    }
}
