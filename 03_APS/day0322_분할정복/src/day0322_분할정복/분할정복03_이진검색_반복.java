package day0322_분할정복;

public class 분할정복03_이진검색_반복 {
	public static void main(String[] args) {
		//정렬된 상태라고 가정
		int[] arr = {2, 4, 6, 7, 8, 9, 17, 28};
		int key = 17;
		// 작성해볼것
		int start = 0;
		int end = arr.length;
		int mid = (start+end)/2;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[mid]==key) {
				System.out.println(mid);
				break;
			}else if(arr[mid]>key) {
				end = mid-1;
				mid = (start+end)/2;
			}else {
				start = mid+1;
				mid = (start+end)/2;
			}			
		}
		if(arr[mid]!=key) {
			System.out.println("제대로된 키를 줘라!!");
		}
		
	}
}
