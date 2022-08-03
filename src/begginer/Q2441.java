package begginer;

public class Q2441 {

	//https://www.acmicpc.net/problem/2441
	
	public static void main(String[] args) {
		//오른쪽 정렬
		int N = new java.util.Scanner(System.in).nextInt();
		
		for(int i=N; i > 0; i--) {
			
			// 5 0
			// 4 1
			// 3 2
			
			for(int p=0; p < N-i; p++) {
				System.out.print(" ");
			}
			
			for(int q=i; q > 0; q--) {
				System.out.print("*");
			}
			System.out.println();
			
			
			
			
		}
		
	}
}
