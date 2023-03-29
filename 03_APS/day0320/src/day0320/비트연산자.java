package day0320;

public class 비트연산자 {
	public static void main(String[] args) {
		// & 연산자 : 비트끼리 AND 연산 / 둘다 1인 경우만 1을 내뱉음
		System.out.println(3 & 5);
		
		// | 연산자 : 비트끼리 OR 연산 / 하나라도 1인 경우만 1을 내뱉음
		System.out.println(3 | 5);
		
		// ^ 연산자 : 비트끼리 XOR 연산 / 같으면 0, 다르면 1 내뱉음
		System.out.println(3 ^ 5);
		
		// ~ 연산자 : 단항연산자 / 비트 반전(1의 보수를 취한 것)
		System.out.println(~3+1);
		
		// A << B : A비트를 B번 왼쪽으로 이동시킨다. 2씩 곱해짐
		System.out.println(3 << 2);
		
		// A >> B : A비트를 B번 오른쪽으로 이동시킨다. 2씩 나누어짐
		System.out.println(12 >> 2);
	}
}
