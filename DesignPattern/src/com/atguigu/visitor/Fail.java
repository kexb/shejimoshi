package com.atguigu.visitor;

public class Fail extends Action {

	@Override
	public void getManResult(Man man) {
		// TODO Auto-generated method stub
		System.out.println(String.format(" ���� %s�������۸ø���ʧ�� !",man.getName()));
	}

	@Override
	public void getWomanResult(Woman woman) {
		// TODO Auto-generated method stub
		System.out.println(String.format(" Ů�� %s�������۸ø���ʧ�� !",woman.getName()));
	}

}
