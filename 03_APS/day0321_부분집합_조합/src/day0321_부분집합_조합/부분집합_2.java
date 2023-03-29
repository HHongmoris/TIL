package day0321_부분집합_조합;

import java.util.Arrays;

public class 부분집합_2 {
	
	static String[] 재료= {"참치", "우엉", "삼겹살"};
	public static void main(String[] args) {
		//비트마스킹을 이용해보자
		int N = 3;
		
		//(1<<N) = 2^N
		//i는 모든 부분집합을 의미한다.
		for(int i=0; i<(1<<N); i++) {
			//i가 부분집합 중 1개라는 것은 알겠다
			//그런데 i가 무슨 원소를 가진 부분집합인지 몰라
			//i가 무슨 원소를 가진 부분집합인지 검사해야함!!

			//N개의 원소를 검사
			String tmp = "";
			for(int j=0; j<N; j++) {
				//i의 j번째 비트에 해당 값이 있는지 체크
				
				//	if((i&(1<<j)) ==1)은 안된다!!!
				//	결과로 나오는 비트 값은 보이기에는 1이지만 2진수이기 때문에
				//	10진수 값은 1이 아니다!
//				if((i&(1<<j)) != 0) //혹은 아래 방식
				if((i&(1<<j)) > 0) {
					//해당 j번째의 요소가 이번 부분집합에는 포함되어 있습니다.
					tmp+=재료[j];
				}
			}
			System.out.println(tmp);
		}
		
	}
}
