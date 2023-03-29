package day0322_분할정복;

public class 분할정복04_이진검색_재귀 {
	static int[] arr;
	static int key;
	public static void main(String[] args) {
		//정렬된 상태라고 가정
		arr = new int[]{2, 4, 6, 7, 8, 9, 17, 28};
		key = 6;
		
		System.out.println(binarySearch(0, arr.length-1));
	}
	
	//이진검색을 하는 이유는
	//이거 이 안에 들었나 -> 반환값 boolean / 들었다면 어디에 들었나! -> 반환값 int
	//인자값으로 무엇을 들고 가야하나
	// => 경계의 시작점과 끝점
	public static boolean binarySearch(int st, int ed) {
		//기저조건(못찾았을 때)
		if(st > ed) return false;
		
		
		int mid = (st + ed)/2; //정수값
		
		//같다면
		if(arr[mid]==key) return true;
		//크다면
		else if(arr[mid] > key) return binarySearch(st, mid-1);
		//작다면
		else return binarySearch(mid+1, ed);
		
		
		
//		//(st>ed), (arr[mid]==key)도 아닌 경우
//		// 아예 못찾을 때
//		return false;
		//위에서 return을 다 해버려서 여기서 return 필요 없음
		//return false 써버리면 이게 중간에 반환값을 처리하는 길이 없이 false 반환
	}
}
