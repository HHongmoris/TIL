package day0410_동적계획법;

import java.util.Scanner;

public class 동전거스름돈 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int money = sc.nextInt();	//해당 돈의 거스름돈의 최소개수를 구하고 싶다.
		//사용할 수 있는 동전의 가지수는 3가지로 1원/4원/6원
		
		int[] dp = new int[money+1];
		dp[0] = 0;	//굳이 안해도 됨
		
		
		// i : 현재 거슬러주고 싶은 금액
		for(int i=1; i<=money; i++) {
			int min = 987654321;
			//1원 작은 부분 문제에 1원을 추가하는 경우
			min = Math.min(min, dp[i-1]+1);
			//4원 작은 부분문제에서 4원을 추가하는 경우
			if(i>=4) min = Math.min(min, dp[i-4]+1);
			//6원 작은 부분문제에 6원을 추가하는 경우
			if(i>=6) min = Math.min(min, dp[i-6]+1);
			dp[i] = min;
		}
		
		System.out.println(dp[money]);
	}
}
