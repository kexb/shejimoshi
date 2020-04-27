package com.atguigu.factory.absfactory.pizzastore.fruit;
//ˮ���ӿ�
interface Fruit {

    public void get();
}

//ƻ����
public abstract class Apple implements Fruit {

    public abstract void get();
}

//����ƻ��
class InnerApple extends Apple {
    @Override
    public void get() {
        System.out.println("�������ڵ�ƻ��");
    }
}

//����ƻ��
class NorthApple extends Apple {

    @Override
    public void get() {
        System.out.println("���ڱ�����ƻ��");
    }
}

//�Ϸ�ƻ��
class SouthApple extends Apple {
    @Override
    public void get() {
        System.out.println("�����Ϸ���ƻ��");
    }
}

//�㽶��
abstract class Banana implements Fruit {

    public abstract void get();
}

//�����㽶
class InnerBanana extends Banana {
    @Override
    public void get() {
        System.out.println("�������ڵ��㽶");
    }
}

//�����㽶
class NorthBanana extends Banana {
    @Override
    public void get() {
        System.out.println("���ڱ������㽶");
    }
}

//�Ϸ��㽶
class SouthBanana extends Banana {
    @Override
    public void get() {
        System.out.println("�����Ϸ����㽶");
    }
}

//ˮ������-�ӿ�
interface FruitFactory {
    //ʵ����Apple
    public Fruit getApple();

    //ʵ����Banana
    public Fruit getBanana();
}


//����ˮ������
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


//����ˮ������
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


//�Ϸ�ˮ������
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

//������
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
        //����Ҫ��������innerApple,InnerBanana
        FruitFactory cc = new InnerFruitFactory();
        Fruit apple3 = cc.getApple();
        apple3.get();
        Fruit banana3 = cc.getBanana();
        banana3.get();

    }
}