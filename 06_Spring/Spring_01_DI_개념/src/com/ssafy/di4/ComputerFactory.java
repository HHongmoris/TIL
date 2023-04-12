package com.ssafy.di4;

public class ComputerFactory {
	//이 컴퓨터 주세요
	public static Computer getComputer(String type) {
		if(type.equals("D")) {
			return new Desktop();
		}else if(type.equals("L")) {
			return new Laptop();
		}
		return null;
	}
}
