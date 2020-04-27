package com.atguigu.visitor;

public class Fail extends Action {

	@Override
	public void getManResult(Man man) {
		// TODO Auto-generated method stub
		System.out.println(String.format(" 男人 %s给的评价该歌手失败 !",man.getName()));
	}

	@Override
	public void getWomanResult(Woman woman) {
		// TODO Auto-generated method stub
		System.out.println(String.format(" 女人 %s给的评价该歌手失败 !",woman.getName()));
	}

}
