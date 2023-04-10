package day0410_동적계획법;

import java.util.Arrays;
import java.util.Scanner;

public class 피보나치 {
	static long callFibo1, callFibo2;
	static long[] memo;
//	static {
//		memo = new long[10000];
//		memo[0] = 0;
//		memo[1] = 1;
//	}		//이렇게 할 수도 있음
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		memo = new long[N+1];	//0으로 초기화가 되어있다.
//		Arrays.fill(memo, -1);
//		memo[0] = 0;	//위의 식을 살리면 0초기화 필요
		memo[1] = 1;
		
		System.out.println(fibo1(N));
		System.out.println(callFibo1);
		System.out.println(fibo2(N));
		System.out.println(callFibo2);
		System.out.println(fibo3(N));
		
	}//main
	
	//재귀 함수를 이용한 피보나치
	public static long fibo1(int n) {
		callFibo1++;
		if(n<2) return n;
		return fibo1(n-1) + fibo1(n-2);
	}
	
	//memoization 기법을 적용한 피보나치
	public static long fibo2(int n) {
		callFibo2++;
//		if(memo[n]==-1) {	//위의 주석처리 식 살리면 이렇게도 가능
		if(n>=2 && memo[n]==0) {
			memo[n] = fibo2(n-1) + fibo2(n-2);
		}
		return memo[n];
	}
	
	public static long fibo3(int n) {
		long[] dp = new long[n+1];
//		dp[0] = 0;	//이건 필요없어
		dp[1] = 1;
		
		for(int i=2; i<=n; i++) {
			dp[i] = dp[i-2] + dp[i-1];
		}
		return dp[n];
	}
	
}
