package day0323_백트래킹;

import java.util.Arrays;

//visited
public class 순열_3 {
	static int[] nums;
	static int N;
	static boolean[] visited; //해당 원소 사용 유무
	static int[] result; //순열결과 저장
	
	public static void main(String[] args) {
		nums = new int[] {0,1,2};
		N = nums.length;
		result = new int[N];
		visited = new boolean[N];
		
		perm(0);
	}
	
	public static void perm(int idx) {
		if(idx==N) {
			System.out.println(Arrays.toString(result));
			return;
		}
		
		//모든 요소를 반복문을 통해 돌면서
		//사용하지 않은 원소가 있다면 결과에 넣고 사용했다고 표시하고
		//다음 차례로 내려가 본다.
		for(int i=0; i<N; i++) {
			//1. 원소를 사용했는지 체크
			if(visited[i]) continue;	//i 썼어 -> 얘 이제 쳐내!
			//요기에다가 작성(실행된다는 것은 안쓴 원소이다.)
			result[idx] = nums[i];
			visited[i] = true;	//해당 원소 썼어요
			perm(idx+1);		//내려가
			visited[i] = false;	//다시 원상복구
			
//			if(!visited[i]) {
//				//요기에다가 작성
//			}
		}
		
	}
}
