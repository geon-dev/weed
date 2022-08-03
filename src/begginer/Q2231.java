package begginer;

public class Q2231 {

	//https://www.acmicpc.net/problem/2231
	
	
	// 참조
	// https://hellodoor.tistory.com/143
	
	public static void main(String[] args) {
		int M = new java.util.Scanner(System.in).nextInt();
		
		int N = 0;
		while(M > N) {
			int V = N;
			int sum = V;
			while(V > 0) {
				int v1 = V % 10;
				
				sum += v1;
				
				V = V / 10;
			}
			
			// 나가는조건
			if(M == sum) {
				System.out.println(N);
				return;
			}
			
			N = N + 1;
		}
		
		System.out.println(0);
		
	}
	





	
	
	
	
	
}
