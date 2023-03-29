package day0323_백트래킹;

import java.util.Arrays;

//bitmasking
public class 순열_4 {
	static int[] nums;
	static int N;
	static int[] result; //순열결과 저장
	
	public static void main(String[] args) {
		nums = new int[] {0,1,2};
		N = nums.length;
		result = new int[N];
		
		perm(0, 0);
	}
	
	//idx : 현재 판단하고 있는 위치
	//visited : 사용한 원소를 기록하기 위한 정수
	public static void perm(int idx, int visited) {
		//if(visited==(1<<N)-1)	이런 식의 표현도 가능!
		if(idx==N) {
			System.out.println(Arrays.toString(result));
			return;
		}
		//모든 원소를 돌면서 판단해
		for(int i=0; i<N; i++) {
			//현재 내가 i번째 원소를 사용했다면 쳐내
			if((visited & (1<<i)) != 0) continue;
			
			result[idx] = nums[i];	//결과 저장
			perm(idx+1, visited | (1<<i));	//| 연산자 사용하면 true, false, 원복 과정도 필요 없다!
			
			
		}
	}
}
