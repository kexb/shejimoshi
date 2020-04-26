
public class Singletontest {
    public static void main(String[] args) {
        SingleTon1 instance01 = SingleTon1.getInstance();
        SingleTon1 instance02 = SingleTon1.getInstance();
        System.out.println(instance01 == instance02);
        System.out.println(instance01.hashCode());
        System.out.println(instance02.hashCode());
    }
}


class SingleTon1{
    // 构造器私有化，外部不能new
    private SingleTon1(){

    }
    // 内部创建对象实例
    private final static SingleTon1 instance = new SingleTon1();
    // 静态方法，返回instance
    public static SingleTon1 getInstance(){
        return instance;
    }
}