package begginer;

import java.util.*;

public class Q2775 {

	//https://www.acmicpc.net/problem/2775
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//테스트케이스
		int T = sc.nextInt();
		while(T-- > 0) {
			int k = sc.nextInt(); //층
			int n = sc.nextInt(); //호
			
			//a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합

			// 1	5	15	35	70
			// 1	4	10	20	35 // 3 6 10 15 // 3 4 5 
			// 1	3	6	10	15 // 2 3 4 5
			// 1	2	3	4	5 // 1 1 1 1 

			int[][] arr = new int[k+1][n+1];

			// 1,1 1,2 1,3 1,4
			// 0,1 0,2 0,3 0,4
			
			for(int i=0; i <= k; i++) {
				for(int p=1; p <=n; p++) {
					
					if(i == 0) {
						arr[i][p] = p;
					}else {
						
						arr[i][p] = arr[i-1][p] + arr[i][p-1];
					}
				}
			}
			
			System.out.println(arr[k][n]);
		}
		
		
	}
	
	
	
	
	
	
	
}
