package com.atguigu.visitor;

public class Wait extends Action {

	@Override
	public void getManResult(Man man) {
		// TODO Auto-generated method stub
		System.out.println(String.format(" ���� %s���������Ǹø��ִ��� ..",man.getName()));
	}

	@Override
	public void getWomanResult(Woman woman) {
		// TODO Auto-generated method stub
		System.out.println(String.format(" Ů�� %s���������Ǹø��ִ��� ..",woman.getName()));
	}

}
