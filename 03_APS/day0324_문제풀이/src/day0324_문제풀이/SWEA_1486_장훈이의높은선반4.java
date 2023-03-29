package day0324_문제풀이;

import java.util.Scanner;

public class SWEA_1486_장훈이의높은선반4 {
	static int N, B, ans;	//N : 점원의 수(1~20), B : 선반의 높이
	static int[] H; // 점원들의 키를 저장할 배열
	static boolean[] sel;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			N = sc.nextInt();
			B = sc.nextInt();
			H = new int[N];
			int rs = 0;	//모든 점원의 키의 합
			for(int i=0; i<N; i++) {
				H[i] = sc.nextInt();
			}//입력 끝
			
//			ans = Integer.MAX_VALUE;
			ans = 987654321;
			powerset(0, 0, rs);
			
			System.out.println("#"+tc+" "+(ans-B));
			
			
		}
	}//main
	
	
	public static void powerset(int idx, int sum, int rsum) {
		//나 이거 좀 쳐내고 싶은데?
		if(sum > ans) return; //이미 내가 최고의 값을 가지고 있는데 중간 결과가 나를 넘어서?
		//이거 안해도 됨.
		
		//모든 점원 판단 끝났어!
		if(idx == N) {
			if(sum>=B){
				ans = Math.min(ans, sum);
			}
			return;
		}
		
		//sum : 내가 지금까지의 합
		//rsum : 앞으로 나한테 더해질 수 있는 합
		if(sum + rsum < B) return; // 안되는게 보이니 가지 쳐내겠다
		
		powerset(idx+1, sum+H[idx], rsum-H[idx]);	//쌓고
		powerset(idx+1, sum, rsum-H[idx]);	//안쌓고
								//쌓든 안쌓든 rsum은 해당 idx직원의 키 뺀 값(해당 직원 제외한 값)!
	}
	
}
