package day0321_부분집합_조합;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 조합_3_퀴즈 {
	//재귀를 이용해서 조합을 만들어보자
	static String[] 토핑 = {"상추", "패티", "토마토", "치즈"};
	static int N = 4;
	static int R = 2; //대부분 문제에서 이런 것들은 주어짐
	
	static String[] sel = new String[R]; //내가 선택한 토핑
	
	static List<String[]> list = new ArrayList<>();
	
	public static void main(String[] args) {
		combination(0, 0);
		
		for(String[] strs : list) {
			System.out.println(Arrays.toString(strs));
		}
	}
	
	//idx : 내가 이번 깊이에서 고려할 재료!
	//sidx : 현재 뽑을 자리
	public static void combination(int idx, int sidx) {
		//base case
		// sidx와 idx 나오는 순서 중요!!
		if(sidx == R) {	//다 뽑았어
//			System.out.println(Arrays.toString(sel));
			list.add(sel);
			return;
		}
		
		//recursive case
		//경계값 결정
		for(int i=idx ; i<=(N-R+sidx); i++) {
			sel[sidx] = 토핑[i];
			combination(i+1, sidx+1);
 		}
	}
}
