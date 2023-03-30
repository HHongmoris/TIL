package day0330_프림_다익스트라;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 프림_반복문 {
	
	static final int INF = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(input);
		
		int V = sc.nextInt();	//V : 정점의 개수, 0부터 시작한다
		int E = sc.nextInt();	//E : 간선의 수
		
		int[][] adjArr = new int[V][V];
		
		for(int i=0; i<E; i++) {
			int A = sc.nextInt();	//시작 정점
			int B = sc.nextInt();	//도착 정점
			int W = sc.nextInt();	//가중치
			//무향 그래프이니까
			adjArr[A][B] = W;
			adjArr[B][A] = W;
		}//입력 끝

		//방문처리를 하기 위해서
		boolean[] visited = new boolean[V];
		int[] p = new int[V];	//내가 어디서 왔는지에 대한 정보를 저장
		int[] dist = new int[V]; //key라고 불리었던 가장 작은 값을 저장하는 용도
		
		//dist는 아주아주 큰 값으로 갱신해라! 
		for(int i=0; i<V; i++) {
			dist[i] = INF;
		}
		Arrays.fill(dist, INF); //위에 for문과 똑같음!
		
		//임의의 한 점을 선택해서 돌려야한다
		dist[0] = 0;
		p[0] = -1;
		
		int ans = 0;
		//프림을 동작시킨다. 
		for(int i=0; i<V-1; i++) {	//정점 개수만큼 돌아도 딱히 상관은 없다만 굳이?
			//1. 내가 가장 작은 값을 뽑겠다
			int min = INF;
			int idx = -1;
			//아직 안뽑힌 친구들 중 가장 작은 값을 뽑겠다
			for(int j=0; j<V; j++) {
				if(!visited[j] && dist[j] < min) {
					min = dist[j];
					idx = j;
				}
			}	//idx에는 가장 작은 값을 가지고 있는 정점이 뽑혔다
			visited[idx] = true;	//선택
			
			
			//2. 뽑은 정점을 이용해서 갱신할 수 있는게 있다면 모조리 갱신
			//인접 행렬이니까 모든 정점을 확인하는 것
			for(int j=0; j<V; j++) {
				if(!visited[j] && adjArr[idx][j] != 0 && dist[j]>adjArr[idx][j]) {
					dist[j] = adjArr[idx][j];
					p[j] = idx;
					
				}
			}
		}
		for (int i=0; i<V; i++) {
			ans += dist[i];
		}
		System.out.println(ans);
	} 
	
		
	
		
	
	static String input = "7 11\r\n" + 
	        "0 1 32\r\n" + 
	        "0 2 31\r\n" + 
	        "0 5 60\r\n" + 
	        "0 6 51\r\n" + 
	        "1 2 21\r\n" + 
	        "2 4 46\r\n" + 
	        "2 6 25\r\n" + 
	        "3 4 34\r\n" + 
	        "3 5 18\r\n" + 
	        "4 5 40\r\n" + 
	        "4 6 51\r\n" + 
	        "\r\n";
}
