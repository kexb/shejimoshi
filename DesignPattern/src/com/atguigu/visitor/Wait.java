package com.atguigu.visitor;

public class Wait extends Action {

	@Override
	public void getManResult(Man man) {
		// TODO Auto-generated method stub
		System.out.println(String.format(" 男人 %s给的评价是该歌手待定 ..",man.getName()));
	}

	@Override
	public void getWomanResult(Woman woman) {
		// TODO Auto-generated method stub
		System.out.println(String.format(" 女人 %s给的评价是该歌手待定 ..",woman.getName()));
	}

}
