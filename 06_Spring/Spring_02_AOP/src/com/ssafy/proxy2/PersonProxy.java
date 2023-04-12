package com.ssafy.proxy2;

import java.util.Random;

import com.ssafy.proxy.OuchException;

public class PersonProxy implements Person{

	private Person person;
	
	//설정자 주입
	public void setPerson(Person person) {
		this.person = person;
	}
	
	@Override
	public void coding() {
		System.out.println("컴퓨터를 부팅한다.");	//이전에 해야할 것들
		try {
			person.coding();	//핵심관심사항
			if(new Random().nextBoolean()) {
				throw new OuchException();
			}
			System.out.println("Git에 Push한다.");		//아무 이상 없이 잘 마쳤을 때
		} catch (Exception e) {
			System.out.println("반차를 낸다.");			//문제가 발생했을 때
		}finally {
			System.out.println("보람찬 하루를 마무리한다.");		//모든게 끝이 났을 때			
		}
	}

}
