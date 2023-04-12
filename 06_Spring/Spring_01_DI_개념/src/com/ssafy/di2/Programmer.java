package com.ssafy.di2;

public class Programmer {
	//캡슐화
	private Desktop computer;
	
	
	//객체생성 의존성을 제거하기 위해서 얘가 만드는게 아니라
	//만들어진 컴퓨터를 넣어주겠다!
	public Programmer(Desktop computer) {
//		computer = new Desktop();
		this.computer = computer;
	}
	
	public void coding() {
		System.out.println(computer.getInfo()+"으로 개발을 합니다");
	}
}
