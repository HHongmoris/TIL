package day0322_분할정복;

public class 분할정복01_거듭제곱_반복문 {
	public static void main(String[] args) {
		int C = 2;
		int N = 10;
		System.out.println(pow(C, N));
	}
	
	//거듭제곱을 구하는데(반복문을 이용해서 구해보자)
//	public static int pow(int C, int N) {
//		int ans = 1;
//		for(int i=0; i<N; i++) {
//			ans *= C;
//		}
//		return ans;
//	}
	
	
	//팩토리얼을 구했던 것처럼 재귀함수를 돌려보자.
	public static int pow(int C, int N) {
		if(N==0) {
			return 1;
		}
		
		if(N%2==0) {
			return pow(C, N/2)*pow(C, N/2);
		}else {
			return C*pow(C, N-1);
		}
		
	}
}
