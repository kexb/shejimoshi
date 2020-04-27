package com.atguigu.visitor;

public class Client {

    //������ģʽ ��������ͨ��accept(action)����������չ�Լ���״̬�Ĵ���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ObjectStructure
		ObjectStructure objectStructure = new ObjectStructure();

        Man m = new Man();
        Woman w = new Woman();
        m.setName("���޼�");
        w.setName("����");
        objectStructure.attach(m);
        objectStructure.attach(w);
		
		
		//�ɹ�
		Success success = new Success();
		objectStructure.display(success);
		
		System.out.println("===============");
		Fail fail = new Fail();
		objectStructure.display(fail);
		
		System.out.println("=======�����Ǵ����Ĳ���========");
		
		Wait wait = new Wait();
		objectStructure.display(wait);
	}

}
