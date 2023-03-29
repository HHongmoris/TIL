package day0322_분할정복;

import java.util.Arrays;

public class 분할정복05_이진검색_API {
	static int[] arr;
	static int key;
	
	public static void main(String[] args) {
		//정렬된 상태라고 가정
		arr = new int[]{2, 4, 6, 7, 8, 9, 17, 28};
		key = 7;
		//있는 key값을 찾으면 해당 인덱스를 반환해주고
		//없는 key값을 찾으면 음수를 반환하는거 같은데 규칙을 모르겠다
		//무슨 규칙이 있는거 같은데 ...무엇일까
		System.out.println(Arrays.binarySearch(arr, key));
		
	}
	
	
}
