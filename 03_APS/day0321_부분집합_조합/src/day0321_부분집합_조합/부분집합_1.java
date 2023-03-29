package day0321_부분집합_조합;

import java.util.Arrays;

public class 부분집합_1 {
	
	String[] 재료= {"참치", "우엉", "삼겹살"};
	public static void main(String[] args) {
		//반복문을 이용해서 부분집합을 구해보자.
		int N = 3;
		int[] sel = new int[N];
		
		for(int i=0; i<2; i++) {
			sel[0] = i;
			for(int j=0; j<2; j++) {
				sel[1] = j;
				for(int k=0; k<2; k++) {
					sel[2] = k;
					
					System.out.println(Arrays.toString(sel));
				}
			}
		}
	}
}
