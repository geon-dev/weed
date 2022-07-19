package begginer;

public class Q23037 {

	//https://www.acmicpc.net/problem/23037
	
	public static void main(String[] args) {
		int N = new java.util.Scanner(System.in).nextInt();
		
		int sum = 0;
		for(int i=0; i < 5; i++) {
			sum += asdf(N%10);
			N = N/10;
		}
		
		System.out.println(sum);
	}
	
	static long asdf(int v) {
		int x = v;
		for(int i=0; i < 4; i++) {
			v *= x;
		}

		return v;
	}
	
	
	
	
	
	
	
	
	
	
	
}
