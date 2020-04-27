package com.atguigu.visitor;

public class Client {

    //访问者模式 被访问者通过accept(action)方法可以扩展自己对状态的处理
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建ObjectStructure
		ObjectStructure objectStructure = new ObjectStructure();

        Man m = new Man();
        Woman w = new Woman();
        m.setName("张无忌");
        w.setName("赵敏");
        objectStructure.attach(m);
        objectStructure.attach(w);
		
		
		//成功
		Success success = new Success();
		objectStructure.display(success);
		
		System.out.println("===============");
		Fail fail = new Fail();
		objectStructure.display(fail);
		
		System.out.println("=======给的是待定的测评========");
		
		Wait wait = new Wait();
		objectStructure.display(wait);
	}

}
