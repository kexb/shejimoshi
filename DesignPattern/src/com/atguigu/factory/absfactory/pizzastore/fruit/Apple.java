package com.atguigu.factory.absfactory.pizzastore.fruit;
//水果接口
interface Fruit {

    public void get();
}

//苹果类
public abstract class Apple implements Fruit {

    public abstract void get();
}

//室内苹果
class InnerApple extends Apple {
    @Override
    public void get() {
        System.out.println("长在室内的苹果");
    }
}

//北方苹果
class NorthApple extends Apple {

    @Override
    public void get() {
        System.out.println("长在北方的苹果");
    }
}

//南方苹果
class SouthApple extends Apple {
    @Override
    public void get() {
        System.out.println("长在南方的苹果");
    }
}

//香蕉类
abstract class Banana implements Fruit {

    public abstract void get();
}

//室内香蕉
class InnerBanana extends Banana {
    @Override
    public void get() {
        System.out.println("长在室内的香蕉");
    }
}

//北方香蕉
class NorthBanana extends Banana {
    @Override
    public void get() {
        System.out.println("长在北方的香蕉");
    }
}

//南方香蕉
class SouthBanana extends Banana {
    @Override
    public void get() {
        System.out.println("长在南方的香蕉");
    }
}

//水果工厂-接口
interface FruitFactory {
    //实例化Apple
    public Fruit getApple();

    //实例化Banana
    public Fruit getBanana();
}


//室内水果工厂
class InnerFruitFactory implements FruitFactory {
    @Override
    public Fruit getApple() {
        return new InnerApple();
    }

    @Override
    public Fruit getBanana() {
        return new InnerBanana();
    }
}


//北方水果工厂
class NorthFruitFactory implements FruitFactory {
    @Override
    public Fruit getApple() {
        return new NorthApple();
    }

    @Override
    public Fruit getBanana() {

        return new NorthBanana();
    }
}


//南方水果工厂
class SouthFruitFactory implements FruitFactory {
    @Override
    public Fruit getApple() {
        return new SouthApple();
    }

    @Override
    public Fruit getBanana() {
        return new SouthBanana();
    }
}

//测试类
class MainClass {
    public static void main(String[] args) {
        FruitFactory ff = new NorthFruitFactory();
        Fruit apple = ff.getApple();
        apple.get();

        Fruit banana = ff.getBanana();
        banana.get();

        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        FruitFactory bb = new SouthFruitFactory();
        Fruit apple2 = bb.getApple();
        apple2.get();

        Fruit banana2 = bb.getBanana();
        banana2.get();

        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        //比如要增加室内innerApple,InnerBanana
        FruitFactory cc = new InnerFruitFactory();
        Fruit apple3 = cc.getApple();
        apple3.get();
        Fruit banana3 = cc.getBanana();
        banana3.get();

    }
}